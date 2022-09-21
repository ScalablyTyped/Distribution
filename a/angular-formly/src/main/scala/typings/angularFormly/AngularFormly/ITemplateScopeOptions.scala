package typings.angularFormly.AngularFormly

import typings.angular.mod.IFormController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITemplateScopeOptions extends StObject {
  
  var formControl: IFormController | js.Array[IFormController]
  
  var templateOptions: ITemplateOptions
  
  var validation: js.Object
}
object ITemplateScopeOptions {
  
  inline def apply(
    formControl: IFormController | js.Array[IFormController],
    templateOptions: ITemplateOptions,
    validation: js.Object
  ): ITemplateScopeOptions = {
    val __obj = js.Dynamic.literal(formControl = formControl.asInstanceOf[js.Any], templateOptions = templateOptions.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateScopeOptions]
  }
  
  extension [Self <: ITemplateScopeOptions](x: Self) {
    
    inline def setFormControl(value: IFormController | js.Array[IFormController]): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
    
    inline def setFormControlVarargs(value: IFormController*): Self = StObject.set(x, "formControl", js.Array(value*))
    
    inline def setTemplateOptions(value: ITemplateOptions): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: js.Object): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
