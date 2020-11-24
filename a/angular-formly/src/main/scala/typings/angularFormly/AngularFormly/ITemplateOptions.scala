package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/ngmodelattrstemplatemanipulator
  */
@js.native
trait ITemplateOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var description: js.UndefOr[String] = js.native
  
  // both attribute or regular attribute
  var disabled: js.UndefOr[Boolean] = js.native
  
  var groupProp: js.UndefOr[String] = js.native
  
  //Bootstrap types
  var label: js.UndefOr[String] = js.native
  
    // default: value
  var labelProp: js.UndefOr[String] = js.native
  
  //attribute only
  var max: js.UndefOr[Double] = js.native
  
  var maxlength: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var minlength: js.UndefOr[Double] = js.native
  
  //expression types
  var onBlur: js.UndefOr[String | IExpressionFunction] = js.native
  
  var onChange: js.UndefOr[String | IExpressionFunction] = js.native
  
  var onClick: js.UndefOr[String | IExpressionFunction] = js.native
  
  var onFocus: js.UndefOr[String | IExpressionFunction] = js.native
  
  var onKeydown: js.UndefOr[String | IExpressionFunction] = js.native
  
  var onKeypress: js.UndefOr[String | IExpressionFunction] = js.native
  
  var onKeyup: js.UndefOr[String | IExpressionFunction] = js.native
  
  // types for select/radio fields
  var options: js.UndefOr[js.Array[ISelectOption]] = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[Double | String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var tabindex: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
    // default: group
  var valueProp: js.UndefOr[String] = js.native
}
object ITemplateOptions {
  
  @scala.inline
  def apply(): ITemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateOptions]
  }
  
  @scala.inline
  implicit class ITemplateOptionsOps[Self <: ITemplateOptions] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setGroupProp(value: String): Self = this.set("groupProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupProp: Self = this.set("groupProp", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelProp(value: String): Self = this.set("labelProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelProp: Self = this.set("labelProp", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinlength(value: Double): Self = this.set("minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinlength: Self = this.set("minlength", js.undefined)
    
    @scala.inline
    def setOnBlurFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("onBlur", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnBlur(value: String | IExpressionFunction): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChangeFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChange(value: String | IExpressionFunction): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClickFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("onClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnClick(value: String | IExpressionFunction): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnFocusFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("onFocus", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnFocus(value: String | IExpressionFunction): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeydownFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("onKeydown", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnKeydown(value: String | IExpressionFunction): Self = this.set("onKeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeydown: Self = this.set("onKeydown", js.undefined)
    
    @scala.inline
    def setOnKeypressFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("onKeypress", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnKeypress(value: String | IExpressionFunction): Self = this.set("onKeypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeypress: Self = this.set("onKeypress", js.undefined)
    
    @scala.inline
    def setOnKeyupFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("onKeyup", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnKeyup(value: String | IExpressionFunction): Self = this.set("onKeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyup: Self = this.set("onKeyup", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: ISelectOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[ISelectOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Double | String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueProp(value: String): Self = this.set("valueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueProp: Self = this.set("valueProp", js.undefined)
  }
}
