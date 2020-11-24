package typings.angularFormly.AngularFormly

import typings.angular.mod.IFormController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITemplateScopeOptions extends js.Object {
  
  var formControl: IFormController | js.Array[IFormController] = js.native
  
  var templateOptions: ITemplateOptions = js.native
  
  var validation: js.Object = js.native
}
object ITemplateScopeOptions {
  
  @scala.inline
  def apply(
    formControl: IFormController | js.Array[IFormController],
    templateOptions: ITemplateOptions,
    validation: js.Object
  ): ITemplateScopeOptions = {
    val __obj = js.Dynamic.literal(formControl = formControl.asInstanceOf[js.Any], templateOptions = templateOptions.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateScopeOptions]
  }
  
  @scala.inline
  implicit class ITemplateScopeOptionsOps[Self <: ITemplateScopeOptions] (val x: Self) extends AnyVal {
    
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
    def setFormControlVarargs(value: IFormController*): Self = this.set("formControl", js.Array(value :_*))
    
    @scala.inline
    def setFormControl(value: IFormController | js.Array[IFormController]): Self = this.set("formControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateOptions(value: ITemplateOptions): Self = this.set("templateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidation(value: js.Object): Self = this.set("validation", value.asInstanceOf[js.Any])
  }
}
