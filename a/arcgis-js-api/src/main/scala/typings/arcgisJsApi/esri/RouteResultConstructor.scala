package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteResultConstructor
  extends StObject
     with /**
  * The route result from [route.solve()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html#solve) as part of a [RouteSolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html)
  */
Instantiable0[RouteResult]
     with Instantiable1[/* properties */ RouteResultProperties, RouteResult] {
  
  def fromJSON(json: Any): RouteResult = js.native
}
