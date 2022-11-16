package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitTestResultGround extends StObject {
  
  /**
    * The distance from camera position to the ground hit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var distance: Double
  
  /**
    * The point at which the ground was hit while performing the hitTest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var mapPoint: Point
}
object HitTestResultGround {
  
  inline def apply(distance: Double, mapPoint: Point): HitTestResultGround = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitTestResultGround]
  }
  
  extension [Self <: HitTestResultGround](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
  }
}
