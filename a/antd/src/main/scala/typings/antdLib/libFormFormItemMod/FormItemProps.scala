package typings
package antdLib.libFormFormItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var colon: js.UndefOr[scala.Boolean] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var hasFeedback: js.UndefOr[scala.Boolean] = js.undefined
  var help: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var htmlFor: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[antdLib.libGridColMod.ColProps] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var validateStatus: js.UndefOr[
    antdLib.antdLibStrings.success | antdLib.antdLibStrings.warning | antdLib.antdLibStrings.error | antdLib.antdLibStrings.validating | antdLib.antdLibStrings.Empty
  ] = js.undefined
  var wrapperCol: js.UndefOr[antdLib.libGridColMod.ColProps] = js.undefined
}

object FormItemProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    colon: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    hasFeedback: js.UndefOr[scala.Boolean] = js.undefined,
    help: reactLib.reactMod.ReactNode = null,
    htmlFor: java.lang.String = null,
    id: java.lang.String = null,
    label: reactLib.reactMod.ReactNode = null,
    labelAlign: FormLabelAlign = null,
    labelCol: antdLib.libGridColMod.ColProps = null,
    prefixCls: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    validateStatus: antdLib.antdLibStrings.success | antdLib.antdLibStrings.warning | antdLib.antdLibStrings.error | antdLib.antdLibStrings.validating | antdLib.antdLibStrings.Empty = null,
    wrapperCol: antdLib.libGridColMod.ColProps = null
  ): FormItemProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback)
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign)
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (style != null) __obj.updateDynamic("style")(style)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol)
    __obj.asInstanceOf[FormItemProps]
  }
}

