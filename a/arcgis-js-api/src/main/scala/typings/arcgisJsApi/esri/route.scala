package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Find routes between two or more locations and optionally get driving directions.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html)
	 */
@js.native
trait route extends StObject {
  
  /**
  		 * Solves the route against the route layer with the route parameters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html#solve)
  		 */
  def solve(url: String, params: RouteParameters): js.Promise[RouteSolveResult] = js.native
  def solve(url: String, params: RouteParameters, requestOptions: Any): js.Promise[RouteSolveResult] = js.native
}
