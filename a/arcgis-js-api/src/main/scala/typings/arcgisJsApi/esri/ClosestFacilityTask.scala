package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosestFacilityTask extends Task {
  
  /**
    * Solves the closest facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html#solve)
    */
  def solve(params: ClosestFacilityParameters): js.Promise[ClosestFacilitySolveResult] = js.native
  def solve(params: ClosestFacilityParameters, requestOptions: js.Any): js.Promise[ClosestFacilitySolveResult] = js.native
}
