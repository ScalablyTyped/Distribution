package typings.antDesignProLayout.getBreadcrumbPropsMod

import typings.antd.breadcrumbBreadcrumbMod.Route
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<antd.antd/lib/breadcrumb.BreadcrumbProps, std.Extract<keyof antd.antd/lib/breadcrumb.BreadcrumbProps, 'routes' | 'itemRender'>> */
trait BreadcrumbListReturn extends js.Object {
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactNode
    ]
  ] = js.undefined
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
}

object BreadcrumbListReturn {
  @scala.inline
  def apply(
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode = null,
    routes: js.Array[Route] = null
  ): BreadcrumbListReturn = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbListReturn]
  }
}

