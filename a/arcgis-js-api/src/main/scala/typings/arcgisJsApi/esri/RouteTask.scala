package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteTask extends Task {
  
  /**
    * Solves the route against the route layer with the route parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html#solve)
    */
  def solve(params: RouteParameters): js.Promise[RouteResult] = js.native
  def solve(params: RouteParameters, requestOptions: js.Any): js.Promise[RouteResult] = js.native
}
