package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esTypographyTypographyMod.InternalTypographyProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style, id, className, aria-label */
object Typography
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esTypographyTypographyMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    component: String = null,
    prefixCls: String = null,
    setContentRef: /* node */ HTMLElement => Unit = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (setContentRef != null) __obj.updateDynamic("setContentRef")(js.Any.fromFunction1(setContentRef))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = InternalTypographyProps
}

