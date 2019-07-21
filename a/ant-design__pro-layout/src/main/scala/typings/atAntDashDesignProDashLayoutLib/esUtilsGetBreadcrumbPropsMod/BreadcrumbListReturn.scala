package typings
package atAntDashDesignProDashLayoutLib.esUtilsGetBreadcrumbPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<antd.antd/es/breadcrumb.BreadcrumbProps, std.Extract<keyof antd.antd/es/breadcrumb.BreadcrumbProps, 'routes' | 'itemRender'>> */
trait BreadcrumbListReturn extends js.Object {
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ antdLib.esBreadcrumbBreadcrumbMod.Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route], 
      /* paths */ js.Array[java.lang.String], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var routes: js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]] = js.undefined
}

object BreadcrumbListReturn {
  @scala.inline
  def apply(
    itemRender: (/* route */ antdLib.esBreadcrumbBreadcrumbMod.Route, /* params */ js.Any, /* routes */ js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route], /* paths */ js.Array[java.lang.String]) => reactLib.reactMod.ReactNode = null,
    routes: js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route] = null
  ): BreadcrumbListReturn = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[BreadcrumbListReturn]
  }
}

