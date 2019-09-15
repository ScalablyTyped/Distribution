package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esTypographyBaseMod.BaseType
import typings.antd.esTypographyBaseMod.CopyConfig
import typings.antd.esTypographyBaseMod.EditConfig
import typings.antd.esTypographyBaseMod.EllipsisConfig
import typings.antd.esTypographyTextMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style, id, className, aria-label, disabled */
object Text
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esTypographyTextMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    code: js.UndefOr[Boolean] = js.undefined,
    copyable: Boolean | CopyConfig = null,
    delete: js.UndefOr[Boolean] = js.undefined,
    editable: Boolean | EditConfig = null,
    ellipsis: Boolean | EllipsisConfig = null,
    ellipsis_TextProps: js.UndefOr[Boolean] = js.undefined,
    mark: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    strong: js.UndefOr[Boolean] = js.undefined,
    `type`: BaseType = null,
    underline: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    if (copyable != null) __obj.updateDynamic("copyable")(copyable.asInstanceOf[js.Any])
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis_TextProps)) __obj.updateDynamic("ellipsis")(ellipsis_TextProps)
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(strong)) __obj.updateDynamic("strong")(strong)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextProps
}

