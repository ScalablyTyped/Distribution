package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps
import typings.antd.esBreadcrumbBreadcrumbItemMod.default
import typings.antd.esDropdownDropdownMod.OverlayFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onClick, href */
object BreadcrumbItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esBreadcrumbBreadcrumbItemMod.default].asInstanceOf[String | js.Object]
  def apply(overlay: TagMod[Any] | OverlayFunc = null, prefixCls: String = null, separator: TagMod[Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BreadcrumbItemProps
}

