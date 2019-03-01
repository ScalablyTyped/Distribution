package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/ngmodelattrstemplatemanipulator
	 */
trait ITemplateOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var description: js.UndefOr[java.lang.String] = js.undefined
  // both attribute or regular attribute
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var groupProp: js.UndefOr[java.lang.String] = js.undefined
  //Bootstrap types
  var label: js.UndefOr[java.lang.String] = js.undefined
    // default: value
  var labelProp: js.UndefOr[java.lang.String] = js.undefined
  //attribute only
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxlength: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minlength: js.UndefOr[scala.Double] = js.undefined
  //expression types
  var onBlur: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onChange: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onClick: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onFocus: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onKeydown: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onKeypress: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onKeyup: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  // types for select/radio fields
  var options: js.UndefOr[js.Array[ISelectOption]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var tabindex: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
    // default: group
  var valueProp: js.UndefOr[java.lang.String] = js.undefined
}

object ITemplateOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    description: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    groupProp: java.lang.String = null,
    label: java.lang.String = null,
    labelProp: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    maxlength: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minlength: scala.Int | scala.Double = null,
    onBlur: java.lang.String | IExpressionFunction = null,
    onChange: java.lang.String | IExpressionFunction = null,
    onClick: java.lang.String | IExpressionFunction = null,
    onFocus: java.lang.String | IExpressionFunction = null,
    onKeydown: java.lang.String | IExpressionFunction = null,
    onKeypress: java.lang.String | IExpressionFunction = null,
    onKeyup: java.lang.String | IExpressionFunction = null,
    options: js.Array[ISelectOption] = null,
    pattern: java.lang.String = null,
    placeholder: scala.Double | java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    tabindex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    valueProp: java.lang.String = null
  ): ITemplateOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (groupProp != null) __obj.updateDynamic("groupProp")(groupProp)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelProp != null) __obj.updateDynamic("labelProp")(labelProp)
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
    if (options != null) __obj.updateDynamic("options")(options)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valueProp != null) __obj.updateDynamic("valueProp")(valueProp)
    __obj.asInstanceOf[ITemplateOptions]
  }
}

