package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator extends StObject {
  
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  var registerOnValidatorChange: js.UndefOr[js.Function1[/* fn */ js.Function0[Unit], Unit]] = js.undefined
  
  /**
    * @description
    * Method that performs synchronous validation against the provided control.
    *
    * @param control The control to validate against.
    *
    * @returns A map of validation errors if validation fails,
    * otherwise null.
    */
  def validate(control: AbstractControl[Any, Any]): ValidationErrors | Null
}
object Validator {
  
  inline def apply(validate: AbstractControl[Any, Any] => ValidationErrors | Null): Validator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Validator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validator] (val x: Self) extends AnyVal {
    
    inline def setRegisterOnValidatorChange(value: /* fn */ js.Function0[Unit] => Unit): Self = StObject.set(x, "registerOnValidatorChange", js.Any.fromFunction1(value))
    
    inline def setRegisterOnValidatorChangeUndefined: Self = StObject.set(x, "registerOnValidatorChange", js.undefined)
    
    inline def setValidate(value: AbstractControl[Any, Any] => ValidationErrors | Null): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
