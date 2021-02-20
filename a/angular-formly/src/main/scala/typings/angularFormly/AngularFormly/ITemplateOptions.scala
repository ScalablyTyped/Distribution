package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class ITemplateOptionsMutableBuilder[Self <: ITemplateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setGroupProp(value: String): Self = StObject.set(x, "groupProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupPropUndefined: Self = StObject.set(x, "groupProp", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelProp(value: String): Self = StObject.set(x, "labelProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPropUndefined: Self = StObject.set(x, "labelProp", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    @scala.inline
    def setOnBlur(value: String | IExpressionFunction): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: String | IExpressionFunction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: String | IExpressionFunction): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnFocus(value: String | IExpressionFunction): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeydown(value: String | IExpressionFunction): Self = StObject.set(x, "onKeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeydownFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "onKeydown", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
    
    @scala.inline
    def setOnKeypress(value: String | IExpressionFunction): Self = StObject.set(x, "onKeypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeypressFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "onKeypress", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnKeypressUndefined: Self = StObject.set(x, "onKeypress", js.undefined)
    
    @scala.inline
    def setOnKeyup(value: String | IExpressionFunction): Self = StObject.set(x, "onKeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyupFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "onKeyup", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnKeyupUndefined: Self = StObject.set(x, "onKeyup", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[ISelectOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: ISelectOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Double | String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValueProp(value: String): Self = StObject.set(x, "valueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePropUndefined: Self = StObject.set(x, "valueProp", js.undefined)
  }
}
