package typings.angularForms.mod

import typings.angularForms.angularFormsStrings.blur
import typings.angularForms.angularFormsStrings.change
import typings.angularForms.angularFormsStrings.submit
import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractControlOptions extends js.Object {
  
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | Null] = js.native
  
  /**
    * @description
    * The event name for control to update upon.
    */
  var updateOn: js.UndefOr[change | blur | submit] = js.native
  
  /**
    * @description
    * The list of validators applied to a control.
    */
  var validators: js.UndefOr[ValidatorFn | js.Array[ValidatorFn] | Null] = js.native
}
object AbstractControlOptions {
  
  @scala.inline
  def apply(): AbstractControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractControlOptions]
  }
  
  @scala.inline
  implicit class AbstractControlOptionsOps[Self <: AbstractControlOptions] (val x: Self) extends AnyVal {
    
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
    def setAsyncValidatorsVarargs(value: AsyncValidatorFn*): Self = this.set("asyncValidators", js.Array(value :_*))
    
    @scala.inline
    def setAsyncValidatorsFunction1(
      value: /* control */ AbstractControl => (js.Promise[ValidationErrors | Null]) | (Observable_[ValidationErrors | Null])
    ): Self = this.set("asyncValidators", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsyncValidators(value: AsyncValidatorFn | js.Array[AsyncValidatorFn]): Self = this.set("asyncValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncValidators: Self = this.set("asyncValidators", js.undefined)
    
    @scala.inline
    def setAsyncValidatorsNull: Self = this.set("asyncValidators", null)
    
    @scala.inline
    def setUpdateOn(value: change | blur | submit): Self = this.set("updateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOn: Self = this.set("updateOn", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: ValidatorFn*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidatorsFunction1(value: /* control */ AbstractControl => ValidationErrors | Null): Self = this.set("validators", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidators(value: ValidatorFn | js.Array[ValidatorFn]): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
    
    @scala.inline
    def setValidatorsNull: Self = this.set("validators", null)
  }
}
