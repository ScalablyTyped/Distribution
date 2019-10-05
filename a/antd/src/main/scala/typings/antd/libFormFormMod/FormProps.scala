package typings.antd.libFormFormMod

import typings.antd.libFormFormItemMod.FormLabelAlign
import typings.antd.libGridColMod.ColProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FormEvent
import typings.react.reactMod.FormHTMLAttributes
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends FormHTMLAttributes[HTMLFormElement] {
  /**
    * @since 3.15.0
    */
  var colon: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[WrappedFormUtils[_]] = js.undefined
  var hideRequiredMark: js.UndefOr[Boolean] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
  var layout: js.UndefOr[FormLayout] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  /**
    * @since 3.14.0
    */
  var wrapperCol: js.UndefOr[ColProps] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    FormHTMLAttributes: FormHTMLAttributes[HTMLFormElement] = null,
    className: String = null,
    colon: js.UndefOr[Boolean] = js.undefined,
    form: WrappedFormUtils[_] = null,
    hideRequiredMark: js.UndefOr[Boolean] = js.undefined,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    layout: FormLayout = null,
    onSubmit: FormEvent[HTMLFormElement] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    wrapperCol: ColProps = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FormHTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon)
    if (form != null) __obj.updateDynamic("form")(form)
    if (!js.isUndefined(hideRequiredMark)) __obj.updateDynamic("hideRequiredMark")(hideRequiredMark)
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign)
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol)
    __obj.asInstanceOf[FormProps]
  }
}

