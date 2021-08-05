package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "EmailValidator")
@js.native
class EmailValidator ()
  extends StObject
     with Validator {
  
  /* private */ var _enabled: js.Any = js.native
  
  /* private */ var _onChange: js.Any = js.native
  
  /**
    * @description
    * Tracks changes to the email attribute bound to this directive.
    */
  def email_=(value: Boolean | String): Unit = js.native
  
  /**
    * Registers a callback function to call when the validator inputs change.
    * @nodoc
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
