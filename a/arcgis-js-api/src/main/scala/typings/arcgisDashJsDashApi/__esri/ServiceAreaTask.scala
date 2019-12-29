package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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
  def solve(params: ServiceAreaParameters): js.Promise[ServiceAreaSolveResult] = js.native
  def solve(params: ServiceAreaParameters, requestOptions: js.Any): js.Promise[ServiceAreaSolveResult] = js.native
}

@JSGlobal("__esri.ServiceAreaTask")
@js.native
object ServiceAreaTask extends TopLevel[ServiceAreaTaskConstructor]

