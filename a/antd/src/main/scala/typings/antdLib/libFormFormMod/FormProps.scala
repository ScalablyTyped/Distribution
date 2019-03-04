package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps
  extends reactLib.reactMod.ReactNs.FormHTMLAttributes[reactLib.HTMLFormElement] {
  var form: js.UndefOr[WrappedFormUtils] = js.undefined
  var hideRequiredMark: js.UndefOr[scala.Boolean] = js.undefined
  var labelCol: js.UndefOr[antdLib.libGridColMod.ColProps] = js.undefined
  var layout: js.UndefOr[FormLayout] = js.undefined
  @JSName("onSubmit")
  var onSubmit_FormProps: js.UndefOr[reactLib.reactMod.ReactNs.FormEventHandler[_]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var wrapperCol: js.UndefOr[antdLib.libGridColMod.ColProps] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    FormHTMLAttributes: reactLib.reactMod.ReactNs.FormHTMLAttributes[reactLib.HTMLFormElement] = null,
    className: java.lang.String = null,
    form: WrappedFormUtils = null,
    hideRequiredMark: js.UndefOr[scala.Boolean] = js.undefined,
    labelCol: antdLib.libGridColMod.ColProps = null,
    layout: FormLayout = null,
    onSubmit: reactLib.reactMod.ReactNs.FormEventHandler[_] = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    wrapperCol: antdLib.libGridColMod.ColProps = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FormHTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (form != null) __obj.updateDynamic("form")(form)
    if (!js.isUndefined(hideRequiredMark)) __obj.updateDynamic("hideRequiredMark")(hideRequiredMark)
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol)
    __obj.asInstanceOf[FormProps]
  }
}

