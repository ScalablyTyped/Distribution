package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveStep extends StObject {
  
  var action: String
  
  var assist_action: String
  
  var cities: js.UndefOr[js.Array[ViaCity]] = js.undefined
  
  var distance: Double
  
  var end_location: LngLat
  
  var instruction: String
  
  var orientation: String
  
  var path: js.Array[LngLat]
  
  var road: String
  
  var start_location: LngLat
  
  var time: Double
  
  var tmcs: js.UndefOr[js.Array[TMC]] = js.undefined
  
  var toll_road: String
  
  var tolls: Double
  
  var tolls_distance: Double
}
object DriveStep {
  
  inline def apply(
    action: String,
    assist_action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double,
    toll_road: String,
    tolls: Double,
    tolls_distance: Double
  ): DriveStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], toll_road = toll_road.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriveStep] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAssist_action(value: String): Self = StObject.set(x, "assist_action", value.asInstanceOf[js.Any])
    
    inline def setCities(value: js.Array[ViaCity]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    inline def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    inline def setCitiesVarargs(value: ViaCity*): Self = StObject.set(x, "cities", js.Array(value*))
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setEnd_location(value: LngLat): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
    
    inline def setStart_location(value: LngLat): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTmcs(value: js.Array[TMC]): Self = StObject.set(x, "tmcs", value.asInstanceOf[js.Any])
    
    inline def setTmcsUndefined: Self = StObject.set(x, "tmcs", js.undefined)
    
    inline def setTmcsVarargs(value: TMC*): Self = StObject.set(x, "tmcs", js.Array(value*))
    
    inline def setToll_road(value: String): Self = StObject.set(x, "toll_road", value.asInstanceOf[js.Any])
    
    inline def setTolls(value: Double): Self = StObject.set(x, "tolls", value.asInstanceOf[js.Any])
    
    inline def setTolls_distance(value: Double): Self = StObject.set(x, "tolls_distance", value.asInstanceOf[js.Any])
  }
}
