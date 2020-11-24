package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldGroup extends js.Object {
  
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
  implicit class IFieldGroupOps[Self <: IFieldGroup] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setElementAttributes(value: String): Self = this.set("elementAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementAttributes: Self = this.set("elementAttributes", js.undefined)
    
    @scala.inline
    def setFieldGroupVarargs(value: (IFieldConfigurationObject | IFieldGroup)*): Self = this.set("fieldGroup", js.Array(value :_*))
    
    @scala.inline
    def setFieldGroup(value: IFieldArray): Self = this.set("fieldGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldGroup: Self = this.set("fieldGroup", js.undefined)
    
    @scala.inline
    def setForm(value: js.Object): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setHideExpressionFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("hideExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHideExpression(value: String | IExpressionFunction): Self = this.set("hideExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideExpression: Self = this.set("hideExpression", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setModel(value: String | StringDictionary[js.Any]): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setOptions(value: IFormOptionsAPI): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setTemplateOptions(value: ITemplateOptions): Self = this.set("templateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateOptions: Self = this.set("templateOptions", js.undefined)
    
    @scala.inline
    def setWrapperVarargs(value: String*): Self = this.set("wrapper", js.Array(value :_*))
    
    @scala.inline
    def setWrapper(value: String | js.Array[String]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
