package typings
package atAngularFormsLib.srcDirectivesValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator extends js.Object {
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  var registerOnValidatorChange: js.UndefOr[js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  /**
    * @description
    * Method that performs synchronous validation against the provided control.
    *
    * @param control The control to validate against.
    *
    * @returns A map of validation errors if validation fails,
    * otherwise null.
    */
  def validate(control: atAngularFormsLib.srcModelMod.AbstractControl): ValidationErrors | scala.Null
}

object Validator {
  @scala.inline
  def apply(
    validate: js.Function1[atAngularFormsLib.srcModelMod.AbstractControl, ValidationErrors | scala.Null],
    registerOnValidatorChange: js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = null
  ): Validator = {
    val __obj = js.Dynamic.literal(validate = validate)
    if (registerOnValidatorChange != null) __obj.updateDynamic("registerOnValidatorChange")(registerOnValidatorChange)
    __obj.asInstanceOf[Validator]
  }
}

