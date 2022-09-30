package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`true`
import typings.angularForms.angularFormsStrings.blur
import typings.angularForms.angularFormsStrings.change
import typings.angularForms.angularFormsStrings.submit
import typings.angularForms.mod.AbstractControl
import typings.angularForms.mod.AsyncValidatorFn
import typings.angularForms.mod.ValidationErrors
import typings.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/forms.@angular/forms.FormControlOptions & {  initialValueIsDefault :true} */
trait FormControlOptionsinitial extends StObject {
  
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | Null] = js.undefined
  
  /**
    * @deprecated Use `nonNullable` instead.
    */
  var initialValueIsDefault: js.UndefOr[Boolean] & `true`
  
  /**
    * @description
    * Whether to use the initial value used to construct the `FormControl` as its default value
    * as well. If this option is false or not provided, the default value of a FormControl is `null`.
    * When a FormControl is reset without an explicit value, its value reverts to
    * its default value.
    */
  var nonNullable: js.UndefOr[Boolean] = js.undefined
  
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
object FormControlOptionsinitial {
  
  inline def apply(initialValueIsDefault: js.UndefOr[Boolean] & `true`): FormControlOptionsinitial = {
    val __obj = js.Dynamic.literal(initialValueIsDefault = initialValueIsDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlOptionsinitial]
  }
  
  extension [Self <: FormControlOptionsinitial](x: Self) {
    
    inline def setAsyncValidators(value: AsyncValidatorFn | js.Array[AsyncValidatorFn]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsFunction1(
      value: /* control */ AbstractControl[Any, Any] => (js.Promise[ValidationErrors | Null]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<ValidationErrors | null> */ Any)
    ): Self = StObject.set(x, "asyncValidators", js.Any.fromFunction1(value))
    
    inline def setAsyncValidatorsNull: Self = StObject.set(x, "asyncValidators", null)
    
    inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    inline def setAsyncValidatorsVarargs(value: AsyncValidatorFn*): Self = StObject.set(x, "asyncValidators", js.Array(value*))
    
    inline def setInitialValueIsDefault(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "initialValueIsDefault", value.asInstanceOf[js.Any])
    
    inline def setNonNullable(value: Boolean): Self = StObject.set(x, "nonNullable", value.asInstanceOf[js.Any])
    
    inline def setNonNullableUndefined: Self = StObject.set(x, "nonNullable", js.undefined)
    
    inline def setUpdateOn(value: change | blur | submit): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
    
    inline def setValidators(value: ValidatorFn | js.Array[ValidatorFn]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsFunction1(value: /* control */ AbstractControl[Any, Any] => ValidationErrors | Null): Self = StObject.set(x, "validators", js.Any.fromFunction1(value))
    
    inline def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: ValidatorFn*): Self = StObject.set(x, "validators", js.Array(value*))
  }
}
