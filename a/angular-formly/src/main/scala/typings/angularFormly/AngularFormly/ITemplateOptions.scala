package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/ngmodelattrstemplatemanipulator
  */
trait ITemplateOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var description: js.UndefOr[String] = js.undefined
  
  // both attribute or regular attribute
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var groupProp: js.UndefOr[String] = js.undefined
  
  //Bootstrap types
  var label: js.UndefOr[String] = js.undefined
  
  // default: value
  var labelProp: js.UndefOr[String] = js.undefined
  
  //attribute only
  var max: js.UndefOr[Double] = js.undefined
  
  var maxlength: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var minlength: js.UndefOr[Double] = js.undefined
  
  //expression types
  var onBlur: js.UndefOr[String | IExpressionFunction] = js.undefined
  
  var onChange: js.UndefOr[String | IExpressionFunction] = js.undefined
  
  var onClick: js.UndefOr[String | IExpressionFunction] = js.undefined
  
  var onFocus: js.UndefOr[String | IExpressionFunction] = js.undefined
  
  var onKeydown: js.UndefOr[String | IExpressionFunction] = js.undefined
  
  var onKeypress: js.UndefOr[String | IExpressionFunction] = js.undefined
  
  var onKeyup: js.UndefOr[String | IExpressionFunction] = js.undefined
  
  // types for select/radio fields
  var options: js.UndefOr[js.Array[ISelectOption]] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[Double | String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var tabindex: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  // default: group
  var valueProp: js.UndefOr[String] = js.undefined
}
object ITemplateOptions {
  
  inline def apply(): ITemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setGroupProp(value: String): Self = StObject.set(x, "groupProp", value.asInstanceOf[js.Any])
    
    inline def setGroupPropUndefined: Self = StObject.set(x, "groupProp", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelProp(value: String): Self = StObject.set(x, "labelProp", value.asInstanceOf[js.Any])
    
    inline def setLabelPropUndefined: Self = StObject.set(x, "labelProp", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    inline def setOnBlur(value: String | IExpressionFunction): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction3(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: String | IExpressionFunction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: String | IExpressionFunction): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(value: String | IExpressionFunction): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction3(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeydown(value: String | IExpressionFunction): Self = StObject.set(x, "onKeydown", value.asInstanceOf[js.Any])
    
    inline def setOnKeydownFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "onKeydown", js.Any.fromFunction3(value))
    
    inline def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
    
    inline def setOnKeypress(value: String | IExpressionFunction): Self = StObject.set(x, "onKeypress", value.asInstanceOf[js.Any])
    
    inline def setOnKeypressFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "onKeypress", js.Any.fromFunction3(value))
    
    inline def setOnKeypressUndefined: Self = StObject.set(x, "onKeypress", js.undefined)
    
    inline def setOnKeyup(value: String | IExpressionFunction): Self = StObject.set(x, "onKeyup", value.asInstanceOf[js.Any])
    
    inline def setOnKeyupFunction3(value: (/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope) => Any): Self = StObject.set(x, "onKeyup", js.Any.fromFunction3(value))
    
    inline def setOnKeyupUndefined: Self = StObject.set(x, "onKeyup", js.undefined)
    
    inline def setOptions(value: js.Array[ISelectOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: ISelectOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlaceholder(value: Double | String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueProp(value: String): Self = StObject.set(x, "valueProp", value.asInstanceOf[js.Any])
    
    inline def setValuePropUndefined: Self = StObject.set(x, "valueProp", js.undefined)
  }
}
