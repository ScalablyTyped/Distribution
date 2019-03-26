package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTask extends Task {
  /**
    * Solves the route against the route layer with the route parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html#solve)
    *
    * @param params Route parameters used as input to generate the route.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def solve(params: RouteParameters): arcgisDashJsDashApiLib.IPromise[RouteResult] = js.native
  def solve(params: RouteParameters, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[RouteResult] = js.native
}

@JSGlobal("__esri.RouteTask")
@js.native
/**
  * Find routes between two or more locations and optionally get driving directions. The RouteTask uses ArcGIS Server network analysis services to calculate routes. Network analysis services allow you to solve simple routing problems as well as complex ones that take into account multiple stops, barriers, and time windows.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html)
  */
class RouteTaskCls () extends RouteTask {
  def this(properties: RouteTaskProperties) = this()
}

