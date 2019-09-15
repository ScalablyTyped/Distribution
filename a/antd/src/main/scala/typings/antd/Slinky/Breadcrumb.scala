package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esBreadcrumbBreadcrumbMod.BreadcrumbProps
import typings.antd.esBreadcrumbBreadcrumbMod.Route
import typings.antd.esBreadcrumbMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Breadcrumb
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esBreadcrumbMod.default].asInstanceOf[String | js.Object]
  def apply(
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => TagMod[Any] = null,
    params: js.Any = null,
    prefixCls: String = null,
    routes: js.Array[Route] = null,
    separator: TagMod[Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (params != null) __obj.updateDynamic("params")(params)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BreadcrumbProps
}

