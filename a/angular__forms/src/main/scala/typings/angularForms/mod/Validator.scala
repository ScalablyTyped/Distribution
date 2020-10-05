package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator extends js.Object {
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  var registerOnValidatorChange: js.UndefOr[js.Function1[/* fn */ js.Function0[Unit], Unit]] = js.native
  /**
    * @description
    * Method that performs synchronous validation against the provided control.
    *
    * @param control The control to validate against.
    *
    * @returns A map of validation errors if validation fails,
    * otherwise null.
    */
  def validate(control: AbstractControl): ValidationErrors | Null = js.native
}

object Validator {
  @scala.inline
  def apply(validate: AbstractControl => ValidationErrors | Null): Validator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Validator]
  }
  @scala.inline
  implicit class ValidatorOps[Self <: Validator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValidate(value: AbstractControl => ValidationErrors | Null): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterOnValidatorChange(value: /* fn */ js.Function0[Unit] => Unit): Self = this.set("registerOnValidatorChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegisterOnValidatorChange: Self = this.set("registerOnValidatorChange", js.undefined)
  }
  
}

