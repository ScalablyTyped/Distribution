package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAreaTask extends Task {
  /**
    * Determines the service area based on a set of parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html#solve)
    *
    * @param params The parameters needed to define the service area.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def solve(params: ServiceAreaParameters): IPromise[ServiceAreaSolveResult] = js.native
  def solve(params: ServiceAreaParameters, requestOptions: js.Any): IPromise[ServiceAreaSolveResult] = js.native
}

@JSGlobal("__esri.ServiceAreaTask")
@js.native
/**
  * ServiceAreaTask helps you find service areas around any location on a network. A network service area is a region that encompasses all accessible streets (streets that are within a specified impedance). For instance, the 5-minute service area for a point includes all the streets that can be reached within five minutes from that point.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html)
  */
class ServiceAreaTaskCls () extends ServiceAreaTask {
  def this(properties: ServiceAreaTaskProperties) = this()
}

