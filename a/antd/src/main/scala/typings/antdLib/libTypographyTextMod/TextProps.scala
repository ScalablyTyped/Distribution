package typings
package antdLib.libTypographyTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps
  extends antdLib.libTypographyBaseMod.BlockProps {
  @JSName("ellipsis")
  var ellipsis_TextProps: js.UndefOr[scala.Boolean] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    `aria-label`: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    code: js.UndefOr[scala.Boolean] = js.undefined,
    copyable: scala.Boolean | antdLib.libTypographyBaseMod.CopyConfig = null,
    delete: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: scala.Boolean | antdLib.libTypographyBaseMod.EditConfig = null,
    ellipsis: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    mark: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    strong: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    `type`: antdLib.libTypographyBaseMod.BaseType = null,
    underline: js.UndefOr[scala.Boolean] = js.undefined
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

