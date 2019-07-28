package typings.antd.libFormFormItemMod

import typings.antd.antdStrings.Empty
import typings.antd.antdStrings.error
import typings.antd.antdStrings.success
import typings.antd.antdStrings.validating
import typings.antd.antdStrings.warning
import typings.antd.libGridColMod.ColProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var colon: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var hasFeedback: js.UndefOr[Boolean] = js.undefined
  var help: js.UndefOr[ReactNode] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var validateStatus: js.UndefOr[success | warning | error | validating | Empty] = js.undefined
  var wrapperCol: js.UndefOr[ColProps] = js.undefined
}

object FormItemProps {
  @scala.inline
  def apply(
    className: String = null,
    colon: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    help: ReactNode = null,
    htmlFor: String = null,
    id: String = null,
    label: ReactNode = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    prefixCls: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    validateStatus: success | warning | error | validating | Empty = null,
    wrapperCol: ColProps = null
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

