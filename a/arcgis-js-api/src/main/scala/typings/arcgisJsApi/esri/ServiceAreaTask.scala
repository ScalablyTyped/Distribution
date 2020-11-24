package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAreaTask extends Task {
  
  /**
    * Determines the service area based on a set of parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html#solve)
    */
  def solve(params: ServiceAreaParameters): js.Promise[ServiceAreaSolveResult] = js.native
  def solve(params: ServiceAreaParameters, requestOptions: js.Any): js.Promise[ServiceAreaSolveResult] = js.native
}
