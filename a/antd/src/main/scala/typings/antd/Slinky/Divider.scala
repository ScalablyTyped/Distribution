package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.vertical
import typings.antd.esDividerMod.DividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, orientation */
object Divider
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esDividerMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    dashed: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    `type`: horizontal | vertical = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dashed)) __obj.updateDynamic("dashed")(dashed)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DividerProps
}

