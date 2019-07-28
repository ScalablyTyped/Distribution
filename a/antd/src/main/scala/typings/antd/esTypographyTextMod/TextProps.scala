package typings.antd.esTypographyTextMod

import typings.antd.esTypographyBaseMod.BaseType
import typings.antd.esTypographyBaseMod.BlockProps
import typings.antd.esTypographyBaseMod.CopyConfig
import typings.antd.esTypographyBaseMod.EditConfig
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends BlockProps {
  @JSName("ellipsis")
  var ellipsis_TextProps: js.UndefOr[Boolean] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    `aria-label`: String = null,
    children: ReactNode = null,
    className: String = null,
    code: js.UndefOr[Boolean] = js.undefined,
    copyable: Boolean | CopyConfig = null,
    delete: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: Boolean | EditConfig = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    mark: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    strong: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    `type`: BaseType = null,
    underline: js.UndefOr[Boolean] = js.undefined
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    if (copyable != null) __obj.updateDynamic("copyable")(copyable.asInstanceOf[js.Any])
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(strong)) __obj.updateDynamic("strong")(strong)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[TextProps]
  }
}

