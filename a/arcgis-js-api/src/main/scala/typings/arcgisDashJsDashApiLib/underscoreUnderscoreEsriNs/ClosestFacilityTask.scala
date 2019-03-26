package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosestFacilityTask extends Task {
  /**
    * Solves the closest facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html#solve)
    *
    * @param params Defines the parameters of the closest facility analysis.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def solve(params: ClosestFacilityParameters): arcgisDashJsDashApiLib.IPromise[ClosestFacilitySolveResult] = js.native
  def solve(params: ClosestFacilityParameters, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[ClosestFacilitySolveResult] = js.native
}

@JSGlobal("__esri.ClosestFacilityTask")
@js.native
/**
  * Helps you find closest facilities around any location (incident) on a network.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html)
  */
class ClosestFacilityTaskCls () extends ClosestFacilityTask {
  def this(properties: ClosestFacilityTaskProperties) = this()
}

