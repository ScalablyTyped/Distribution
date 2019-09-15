package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esButtonButtonDashGroupMod.ButtonGroupProps
import typings.antd.esButtonButtonMod.ButtonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, style */
object ButtonGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esMod.Button.Group.asInstanceOf[String | js.Object]
  def apply(prefixCls: String = null, size: ButtonSize = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ButtonGroupProps
}

