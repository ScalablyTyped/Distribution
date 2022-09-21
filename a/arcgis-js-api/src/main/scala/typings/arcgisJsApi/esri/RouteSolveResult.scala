package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSolveResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Message received when the solve is complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#messages)
    */
  var messages: js.Array[NAMessage] = js.native
  
  /**
    * Point barriers are an array of graphics with point geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#pointBarriers)
    */
  var pointBarriers: js.Array[Graphic] = js.native
  
  /**
    * Polygon barriers are an array of graphics with polygon geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.Array[Graphic] = js.native
  
  /**
    * Polyline barriers are an array of graphics with polyline geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.Array[Graphic] = js.native
  
  /**
    * An array of route results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html#routeResults)
    */
  var routeResults: js.Array[RouteResult] = js.native
}
