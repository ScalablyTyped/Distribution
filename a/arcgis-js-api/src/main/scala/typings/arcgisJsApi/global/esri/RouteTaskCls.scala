package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RouteTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.RouteTask")
@js.native
/**
  * Find routes between two or more locations and optionally get driving directions. The RouteTask uses ArcGIS Server network analysis services to calculate routes. Network analysis services allow you to solve simple routing problems as well as complex ones that take into account multiple stops, barriers, and time windows.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html)
  */
class RouteTaskCls ()
  extends typings.arcgisJsApi.esri.RouteTask {
  def this(properties: RouteTaskProperties) = this()
}

