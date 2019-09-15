package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.PartialRecordBreakpointnumber
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.middle
import typings.antd.antdStrings.small
import typings.antd.antdStrings.vertical
import typings.antd.esDescriptionsMod.DescriptionsProps
import typings.antd.esDescriptionsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Descriptions
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esDescriptionsMod.default].asInstanceOf[String | js.Object]
  def apply(
    bordered: js.UndefOr[Boolean] = js.undefined,
    colon: js.UndefOr[Boolean] = js.undefined,
    column: Double | PartialRecordBreakpointnumber = null,
    layout: horizontal | vertical = null,
    prefixCls: String = null,
    size: middle | small | typings.antd.antdStrings.default = null,
    title: TagMod[Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DescriptionsProps
}

