package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldGroup extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var elementAttributes: js.UndefOr[String] = js.native
  
  var fieldGroup: js.UndefOr[IFieldArray] = js.native
  
  var form: js.UndefOr[js.Object] = js.native
  
  var hide: js.UndefOr[Boolean] = js.native
  
  var hideExpression: js.UndefOr[String | IExpressionFunction] = js.native
  
  var key: js.UndefOr[String | Double] = js.native
  
  var model: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  
  var options: js.UndefOr[IFormOptionsAPI] = js.native
  
  var templateOptions: js.UndefOr[ITemplateOptions] = js.native
  
  var wrapper: js.UndefOr[String | js.Array[String]] = js.native
}
object IFieldGroup {
  
  @scala.inline
  def apply(): IFieldGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldGroup]
  }
  
  @scala.inline
  implicit class IFieldGroupMutableBuilder[Self <: IFieldGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setElementAttributes(value: String): Self = StObject.set(x, "elementAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementAttributesUndefined: Self = StObject.set(x, "elementAttributes", js.undefined)
    
    @scala.inline
    def setFieldGroup(value: IFieldArray): Self = StObject.set(x, "fieldGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldGroupUndefined: Self = StObject.set(x, "fieldGroup", js.undefined)
    
    @scala.inline
    def setFieldGroupVarargs(value: (IFieldConfigurationObject | IFieldGroup)*): Self = StObject.set(x, "fieldGroup", js.Array(value :_*))
    
    @scala.inline
    def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideExpression(value: String | IExpressionFunction): Self = StObject.set(x, "hideExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideExpressionFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "hideExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHideExpressionUndefined: Self = StObject.set(x, "hideExpression", js.undefined)
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setModel(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setOptions(value: IFormOptionsAPI): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setTemplateOptions(value: ITemplateOptions): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
    
    @scala.inline
    def setWrapper(value: String | js.Array[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    
    @scala.inline
    def setWrapperVarargs(value: String*): Self = StObject.set(x, "wrapper", js.Array(value :_*))
  }
}
