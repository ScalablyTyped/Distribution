package typings.antdDashMobileDashRn.libTextareaDashItemPropsTypeMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaItemPropsType extends js.Object {
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  var clear: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var labelNumber: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[TextAreaEventHandle] = js.undefined
  var onChange: js.UndefOr[TextAreaEventHandle] = js.undefined
  var onErrorClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[TextAreaEventHandle] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextAreaItemPropsType {
  @scala.inline
  def apply(
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    labelNumber: Int | Double = null,
    maxLength: Int | Double = null,
    name: String = null,
    onBlur: /* val */ js.UndefOr[String] => Unit = null,
    onChange: /* val */ js.UndefOr[String] => Unit = null,
    onErrorClick: () => Unit = null,
    onFocus: /* val */ js.UndefOr[String] => Unit = null,
    placeholder: String = null,
    rows: Int | Double = null,
    title: ReactNode = null,
    value: String = null
  ): TextAreaItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction0(onErrorClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextAreaItemPropsType]
  }
}

