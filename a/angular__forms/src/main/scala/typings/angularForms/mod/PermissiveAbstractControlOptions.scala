package typings.angularForms.mod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper type to allow the compiler to accept [XXXX, { updateOn: string }] as a valid shorthand
  * argument for .group()
  */
/* Inlined parent std.Omit<@angular/forms.@angular/forms.AbstractControlOptions, 'updateOn'> */
trait PermissiveAbstractControlOptions extends StObject {
  
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | Null] = js.undefined
  
  var updateOn: js.UndefOr[String] = js.undefined
  
  var validators: js.UndefOr[ValidatorFn | js.Array[ValidatorFn] | Null] = js.undefined
}
object PermissiveAbstractControlOptions {
  
  inline def apply(): PermissiveAbstractControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissiveAbstractControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissiveAbstractControlOptions] (val x: Self) extends AnyVal {
    
    inline def setAsyncValidators(value: AsyncValidatorFn | js.Array[AsyncValidatorFn]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsFunction1(
      value: /* control */ AbstractControl[Any, Any] => (js.Promise[ValidationErrors | Null]) | (Observable_[ValidationErrors | Null])
    ): Self = StObject.set(x, "asyncValidators", js.Any.fromFunction1(value))
    
    inline def setAsyncValidatorsNull: Self = StObject.set(x, "asyncValidators", null)
    
    inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    inline def setAsyncValidatorsVarargs(value: AsyncValidatorFn*): Self = StObject.set(x, "asyncValidators", js.Array(value*))
    
    inline def setUpdateOn(value: String): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
    
    inline def setValidators(value: ValidatorFn | js.Array[ValidatorFn]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsFunction1(value: /* control */ AbstractControl[Any, Any] => ValidationErrors | Null): Self = StObject.set(x, "validators", js.Any.fromFunction1(value))
    
    inline def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: ValidatorFn*): Self = StObject.set(x, "validators", js.Array(value*))
  }
}
