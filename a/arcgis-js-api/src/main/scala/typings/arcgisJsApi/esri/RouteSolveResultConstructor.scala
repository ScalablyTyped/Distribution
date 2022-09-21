package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSolveResultConstructor
  extends StObject
     with /**
  * The results from [route.solve()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html#solve) method.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html)
  */
Instantiable0[RouteSolveResult]
     with Instantiable1[/* properties */ RouteSolveResultProperties, RouteSolveResult] {
  
  def fromJSON(json: Any): RouteSolveResult = js.native
}
