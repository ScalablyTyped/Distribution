package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/ngmodelattrstemplatemanipulator
	 */
trait ITemplateOptions
  extends /* key */ StringDictionary[js.Any] {
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
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    groupProp: String = null,
    label: String = null,
    labelProp: String = null,
    max: Int | Double = null,
    maxlength: Int | Double = null,
    min: Int | Double = null,
    minlength: Int | Double = null,
    onBlur: String | IExpressionFunction = null,
    onChange: String | IExpressionFunction = null,
    onClick: String | IExpressionFunction = null,
    onFocus: String | IExpressionFunction = null,
    onKeydown: String | IExpressionFunction = null,
    onKeypress: String | IExpressionFunction = null,
    onKeyup: String | IExpressionFunction = null,
    options: js.Array[ISelectOption] = null,
    pattern: String = null,
    placeholder: Double | String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    tabindex: Int | Double = null,
    `type`: String = null,
    valueProp: String = null
  ): ITemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (groupProp != null) __obj.updateDynamic("groupProp")(groupProp.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelProp != null) __obj.updateDynamic("labelProp")(labelProp.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onKeydown != null) __obj.updateDynamic("onKeydown")(onKeydown.asInstanceOf[js.Any])
    if (onKeypress != null) __obj.updateDynamic("onKeypress")(onKeypress.asInstanceOf[js.Any])
    if (onKeyup != null) __obj.updateDynamic("onKeyup")(onKeyup.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueProp != null) __obj.updateDynamic("valueProp")(valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateOptions]
  }
}

