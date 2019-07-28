package typings.atAngularForms.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "EmailValidator")
@js.native
class EmailValidator () extends Validator {
  var _enabled: js.Any = js.native
  var _onChange: js.Any = js.native
  /**
    * @description
    * Tracks changes to the email attribute bound to this directive.
    */
  var email: Boolean | String = js.native
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MEmailValidator(fn: js.Function0[Unit]): Unit = js.native
  /**
    * @description
    * Method that performs synchronous validation against the provided control.
    *
    * @param control The control to validate against.
    *
    * @returns A map of validation errors if validation fails,
    * otherwise null.
    */
  /* CompleteClass */
  override def validate(control: AbstractControl): ValidationErrors | Null = js.native
}

