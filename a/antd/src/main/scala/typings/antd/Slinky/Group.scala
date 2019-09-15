package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esInputGroupMod.GroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, onMouseLeave, style, className, onFocus, onMouseEnter */
object Group
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esInputGroupMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    size: large | small | default = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GroupProps
}

