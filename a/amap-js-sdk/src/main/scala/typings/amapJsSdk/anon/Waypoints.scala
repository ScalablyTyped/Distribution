package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Waypoints extends StObject {
  
  var waypoints: js.Array[LngLat]
}
object Waypoints {
  
  inline def apply(waypoints: js.Array[LngLat]): Waypoints = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoints]
  }
  
  extension [Self <: Waypoints](x: Self) {
    
    inline def setWaypoints(value: js.Array[LngLat]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsVarargs(value: LngLat*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
