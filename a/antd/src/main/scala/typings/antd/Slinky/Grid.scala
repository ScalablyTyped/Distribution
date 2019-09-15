package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esCardGridMod.CardGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, style */
object Grid
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esCardGridMod.^.default.asInstanceOf[String | js.Object]
  def apply(hoverable: js.UndefOr[Boolean] = js.undefined, prefixCls: String = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardGridProps
}

