package typings.antdMobile.textareaItemPropsTypeMod

import typings.react.mod.ReactNode
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
    count: js.UndefOr[Double] = js.undefined,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    labelNumber: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    name: String = null,
    onBlur: /* val */ js.UndefOr[String] => Unit = null,
    onChange: /* val */ js.UndefOr[String] => Unit = null,
    onErrorClick: () => Unit = null,
    onFocus: /* val */ js.UndefOr[String] => Unit = null,
    placeholder: String = null,
    rows: js.UndefOr[Double] = js.undefined,
    title: ReactNode = null,
    value: String = null
  ): TextAreaItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelNumber)) __obj.updateDynamic("labelNumber")(labelNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction0(onErrorClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaItemPropsType]
  }
}

