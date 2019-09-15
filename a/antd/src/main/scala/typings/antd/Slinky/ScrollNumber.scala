package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.antd.esBadgeScrollNumberMod.ScrollNumberProps
import typings.antd.esBadgeScrollNumberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object ScrollNumber
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esBadgeScrollNumberMod.default].asInstanceOf[String | js.Object]
  def apply(
    component: String = null,
    count: String | Double = null,
    displayComponent: ReactElement = null,
    onAnimated: js.Function = null,
    prefixCls: String = null,
    title: String | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (displayComponent != null) __obj.updateDynamic("displayComponent")(displayComponent)
    if (onAnimated != null) __obj.updateDynamic("onAnimated")(onAnimated)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScrollNumberProps
}

