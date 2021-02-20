package typings.angularFormly.AngularFormly

import typings.angular.mod.IFormController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITemplateScopeOptions extends StObject {
  
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
  implicit class ITemplateScopeOptionsMutableBuilder[Self <: ITemplateScopeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormControl(value: IFormController | js.Array[IFormController]): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormControlVarargs(value: IFormController*): Self = StObject.set(x, "formControl", js.Array(value :_*))
    
    @scala.inline
    def setTemplateOptions(value: ITemplateOptions): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidation(value: js.Object): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
