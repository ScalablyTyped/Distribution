package typings.angularForms.mod

import typings.angularForms.angularFormsStrings.blur
import typings.angularForms.angularFormsStrings.change
import typings.angularForms.angularFormsStrings.submit
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractControlOptions extends StObject {
  
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | Null] = js.undefined
  
  /**
    * @description
    * The event name for control to update upon.
    */
  var updateOn: js.UndefOr[change | blur | submit] = js.undefined
  
  /**
    * @description
    * The list of validators applied to a control.
    */
  var validators: js.UndefOr[ValidatorFn | js.Array[ValidatorFn] | Null] = js.undefined
}
object AbstractControlOptions {
  
  inline def apply(): AbstractControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractControlOptions]
  }
  
  extension [Self <: AbstractControlOptions](x: Self) {
    
    inline def setAsyncValidators(value: AsyncValidatorFn | js.Array[AsyncValidatorFn]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsFunction1(
      value: /* control */ AbstractControl => (js.Promise[ValidationErrors | Null]) | (Observable_[ValidationErrors | Null])
    ): Self = StObject.set(x, "asyncValidators", js.Any.fromFunction1(value))
    
    inline def setAsyncValidatorsNull: Self = StObject.set(x, "asyncValidators", null)
    
    inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    inline def setAsyncValidatorsVarargs(value: AsyncValidatorFn*): Self = StObject.set(x, "asyncValidators", js.Array(value :_*))
    
    inline def setUpdateOn(value: change | blur | submit): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
    
    inline def setValidators(value: ValidatorFn | js.Array[ValidatorFn]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsFunction1(value: /* control */ AbstractControl => ValidationErrors | Null): Self = StObject.set(x, "validators", js.Any.fromFunction1(value))
    
    inline def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: ValidatorFn*): Self = StObject.set(x, "validators", js.Array(value :_*))
  }
}
