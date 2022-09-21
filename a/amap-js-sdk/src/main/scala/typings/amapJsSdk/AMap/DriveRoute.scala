package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveRoute extends StObject {
  
  var distance: Double
  
  var policy: String
  
  var steps: js.Array[DriveStep]
  
  var time: Double
  
  var tolls: Double
  
  var tolls_distance: Double
}
object DriveRoute {
  
  inline def apply(
    distance: Double,
    policy: String,
    steps: js.Array[DriveStep],
    time: Double,
    tolls: Double,
    tolls_distance: Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveRoute]
  }
  
  extension [Self <: DriveRoute](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[DriveStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: DriveStep*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTolls(value: Double): Self = StObject.set(x, "tolls", value.asInstanceOf[js.Any])
    
    inline def setTolls_distance(value: Double): Self = StObject.set(x, "tolls_distance", value.asInstanceOf[js.Any])
  }
}
