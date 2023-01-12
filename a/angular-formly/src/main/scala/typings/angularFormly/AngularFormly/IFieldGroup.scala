package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldGroup extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var elementAttributes: js.UndefOr[String] = js.undefined
  
  var fieldGroup: js.UndefOr[IFieldArray] = js.undefined
  
  var form: js.UndefOr[js.Object] = js.undefined
  
  var hide: js.UndefOr[Boolean] = js.undefined
  
  var hideExpression: js.UndefOr[String | IExpressionFunction] = js.undefined
  
  var key: js.UndefOr[String | Double] = js.undefined
  
  var model: js.UndefOr[String | StringDictionary[Any]] = js.undefined
  
  var options: js.UndefOr[IFormOptionsAPI] = js.undefined
  
  var templateOptions: js.UndefOr[ITemplateOptions] = js.undefined
  
  var wrapper: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IFieldGroup {
  
  inline def apply(): IFieldGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldGroup] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setElementAttributes(value: String): Self = StObject.set(x, "elementAttributes", value.asInstanceOf[js.Any])
    
    inline def setElementAttributesUndefined: Self = StObject.set(x, "elementAttributes", js.undefined)
    
    inline def setFieldGroup(value: IFieldArray): Self = StObject.set(x, "fieldGroup", value.asInstanceOf[js.Any])
    
    inline def setFieldGroupUndefined: Self = StObject.set(x, "fieldGroup", js.undefined)
    
    inline def setFieldGroupVarargs(value: (IFieldConfigurationObject | IFieldGroup)*): Self = StObject.set(x, "fieldGroup", js.Array(value*))
    
    inline def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideExpression(value: String | IExpressionFunction): Self = StObject.set(x, "hideExpression", value.asInstanceOf[js.Any])
    
    inline def setHideExpressionFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "hideExpression", js.Any.fromFunction3(value))
    
    inline def setHideExpressionUndefined: Self = StObject.set(x, "hideExpression", js.undefined)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setModel(value: String | StringDictionary[Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setOptions(value: IFormOptionsAPI): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTemplateOptions(value: ITemplateOptions): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
    
    inline def setWrapper(value: String | js.Array[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    
    inline def setWrapperVarargs(value: String*): Self = StObject.set(x, "wrapper", js.Array(value*))
  }
}
