package typings
package antdLib.esFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps
  extends reactLib.reactMod.FormHTMLAttributes[stdLib.HTMLFormElement] {
  /**
    * @since 3.15.0
    */
  var colon: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[WrappedFormUtils[_]] = js.undefined
  var hideRequiredMark: js.UndefOr[scala.Boolean] = js.undefined
  var labelAlign: js.UndefOr[antdLib.esFormFormItemMod.FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[antdLib.esGridColMod.ColProps] = js.undefined
  var layout: js.UndefOr[FormLayout] = js.undefined
  @JSName("onSubmit")
  var onSubmit_FormProps: js.UndefOr[reactLib.reactMod.FormEventHandler[_]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @since 3.14.0
    */
  var wrapperCol: js.UndefOr[antdLib.esGridColMod.ColProps] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    FormHTMLAttributes: reactLib.reactMod.FormHTMLAttributes[stdLib.HTMLFormElement] = null,
    className: java.lang.String = null,
    colon: js.UndefOr[scala.Boolean] = js.undefined,
    form: WrappedFormUtils[_] = null,
    hideRequiredMark: js.UndefOr[scala.Boolean] = js.undefined,
    labelAlign: antdLib.esFormFormItemMod.FormLabelAlign = null,
    labelCol: antdLib.esGridColMod.ColProps = null,
    layout: FormLayout = null,
    onSubmit: reactLib.reactMod.FormEventHandler[_] = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    wrapperCol: antdLib.esGridColMod.ColProps = null
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
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol)
    __obj.asInstanceOf[FormProps]
  }
}

