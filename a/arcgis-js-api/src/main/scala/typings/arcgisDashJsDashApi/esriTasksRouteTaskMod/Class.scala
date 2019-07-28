package typings.arcgisDashJsDashApi.esriTasksRouteTaskMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.RouteTask
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.RouteTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/RouteTask", JSImport.Namespace)
@js.native
/**
  * Find routes between two or more locations and optionally get driving directions. The RouteTask uses ArcGIS Server network analysis services to calculate routes. Network analysis services allow you to solve simple routing problems as well as complex ones that take into account multiple stops, barriers, and time windows.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html)
  */
class Class () extends RouteTask {
  def this(properties: RouteTaskProperties) = this()
}

