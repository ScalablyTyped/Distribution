package typings
package atAngularFormsLib.srcDirectivesValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator extends Validator

object AsyncValidator {
  @scala.inline
  def apply(
    validate: js.Function1[
      atAngularFormsLib.srcModelMod.AbstractControl, 
      (js.Promise[ValidationErrors | scala.Null]) | (rxjsLib.rxjsMod.Observable[ValidationErrors | scala.Null])
    ],
    registerOnValidatorChange: js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = null
  ): AsyncValidator = {
    val __obj = js.Dynamic.literal(validate = validate)
    if (registerOnValidatorChange != null) __obj.updateDynamic("registerOnValidatorChange")(registerOnValidatorChange)
    __obj.asInstanceOf[AsyncValidator]
  }
}

