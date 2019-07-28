package typings.atAntDashDesignProDashLayout

import typings.antd.esBreadcrumbBreadcrumbMod.Route
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<antd.antd/es/breadcrumb.BreadcrumbProps, 'routes' | 'itemRender'> */
trait PickBreadcrumbPropsroutesitemRender extends js.Object {
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

object PickBreadcrumbPropsroutesitemRender {
  @scala.inline
  def apply(
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode = null,
    routes: js.Array[Route] = null
  ): PickBreadcrumbPropsroutesitemRender = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[PickBreadcrumbPropsroutesitemRender]
  }
}

