package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bear-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bear-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`boundary-crossing`
import typings.arcgisJsApi.arcgisJsApiStrings.`central-fork`
import typings.arcgisJsApi.arcgisJsApiStrings.`clockwise-roundabout`
import typings.arcgisJsApi.arcgisJsApiStrings.`counter-clockwise-roundabout`
import typings.arcgisJsApi.arcgisJsApiStrings.`down-elevator`
import typings.arcgisJsApi.arcgisJsApiStrings.`down-escalator`
import typings.arcgisJsApi.arcgisJsApiStrings.`down-stairs`
import typings.arcgisJsApi.arcgisJsApiStrings.`general-event`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-fork`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-handed-u-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-ramp`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-turn-and-immediate-left-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-turn-and-immediate-right-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`off-ferry`
import typings.arcgisJsApi.arcgisJsApiStrings.`on-ferry`
import typings.arcgisJsApi.arcgisJsApiStrings.`pedestrian-ramp`
import typings.arcgisJsApi.arcgisJsApiStrings.`restriction-violation`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-fork`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-handed-u-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-ramp`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-turn-and-immediate-left-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-turn-and-immediate-right-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`scaled-cost-barrier-event`
import typings.arcgisJsApi.arcgisJsApiStrings.`sharp-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`sharp-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`time-zone-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`traffic-event`
import typings.arcgisJsApi.arcgisJsApiStrings.`u-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`up-elevator`
import typings.arcgisJsApi.arcgisJsApiStrings.`up-escalator`
import typings.arcgisJsApi.arcgisJsApiStrings.`up-stairs`
import typings.arcgisJsApi.arcgisJsApiStrings.arrive
import typings.arcgisJsApi.arcgisJsApiStrings.depart
import typings.arcgisJsApi.arcgisJsApiStrings.door
import typings.arcgisJsApi.arcgisJsApiStrings.elevator
import typings.arcgisJsApi.arcgisJsApiStrings.escalator
import typings.arcgisJsApi.arcgisJsApiStrings.header
import typings.arcgisJsApi.arcgisJsApiStrings.landmark
import typings.arcgisJsApi.arcgisJsApiStrings.roundabout
import typings.arcgisJsApi.arcgisJsApiStrings.stairs
import typings.arcgisJsApi.arcgisJsApiStrings.straight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionPointProperties extends StObject {
  
  /**
    * Time when the action happens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#arrivalTime)
    */
  var arrivalTime: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The type of directions event or maneuver described by the point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#directionPointType)
    */
  var directionPointType: js.UndefOr[
    header | arrive | depart | straight | `on-ferry` | `off-ferry` | `central-fork` | roundabout | `u-turn` | door | stairs | elevator | escalator | `pedestrian-ramp` | `left-fork` | `left-ramp` | `clockwise-roundabout` | `left-handed-u-turn` | `bear-left` | `left-turn` | `sharp-left` | `left-turn-and-immediate-left-turn` | `left-turn-and-immediate-right-turn` | `right-fork` | `right-ramp` | `counter-clockwise-roundabout` | `right-handed-u-turn` | `bear-right` | `right-turn` | `sharp-right` | `right-turn-and-immediate-left-turn` | `right-turn-and-immediate-right-turn` | `up-elevator` | `up-escalator` | `up-stairs` | `down-elevator` | `down-escalator` | `down-stairs` | `general-event` | landmark | `time-zone-change` | `traffic-event` | `scaled-cost-barrier-event` | `boundary-crossing` | `restriction-violation`
  ] = js.undefined
  
  /**
    * The direction item text to dispay on the screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#displayText)
    */
  var displayText: js.UndefOr[String] = js.undefined
  
  /**
    * The local time offset (in minutes) for the arrival time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#endTimeOffset)
    */
  var endTimeOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Point representing the direction's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#geometry)
    */
  var geometry: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * Sequence of the Direction items, starting with 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#sequence)
    */
  var sequence: js.UndefOr[Double] = js.undefined
}
object DirectionPointProperties {
  
  inline def apply(): DirectionPointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionPointProperties]
  }
  
  extension [Self <: DirectionPointProperties](x: Self) {
    
    inline def setArrivalTime(value: DateProperties): Self = StObject.set(x, "arrivalTime", value.asInstanceOf[js.Any])
    
    inline def setArrivalTimeUndefined: Self = StObject.set(x, "arrivalTime", js.undefined)
    
    inline def setDirectionPointType(
      value: header | arrive | depart | straight | `on-ferry` | `off-ferry` | `central-fork` | roundabout | `u-turn` | door | stairs | elevator | escalator | `pedestrian-ramp` | `left-fork` | `left-ramp` | `clockwise-roundabout` | `left-handed-u-turn` | `bear-left` | `left-turn` | `sharp-left` | `left-turn-and-immediate-left-turn` | `left-turn-and-immediate-right-turn` | `right-fork` | `right-ramp` | `counter-clockwise-roundabout` | `right-handed-u-turn` | `bear-right` | `right-turn` | `sharp-right` | `right-turn-and-immediate-left-turn` | `right-turn-and-immediate-right-turn` | `up-elevator` | `up-escalator` | `up-stairs` | `down-elevator` | `down-escalator` | `down-stairs` | `general-event` | landmark | `time-zone-change` | `traffic-event` | `scaled-cost-barrier-event` | `boundary-crossing` | `restriction-violation`
    ): Self = StObject.set(x, "directionPointType", value.asInstanceOf[js.Any])
    
    inline def setDirectionPointTypeUndefined: Self = StObject.set(x, "directionPointType", js.undefined)
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setEndTimeOffset(value: Double): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setGeometry(value: PointProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
  }
}
