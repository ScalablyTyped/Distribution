package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esAnchorAnchorLinkMod.AnchorLinkProps
import typings.antd.esAnchorAnchorLinkMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, target, href */
object AnchorLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esAnchorAnchorLinkMod.default].asInstanceOf[String | js.Object]
  def apply(title: TagMod[Any], prefixCls: String = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(title = title)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnchorLinkProps
}

