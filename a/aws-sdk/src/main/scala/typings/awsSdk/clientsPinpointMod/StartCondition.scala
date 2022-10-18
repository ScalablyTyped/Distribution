package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCondition extends StObject {
  
  /**
    * The custom description of the condition.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  var EventStartCondition: js.UndefOr[typings.awsSdk.clientsPinpointMod.EventStartCondition] = js.undefined
  
  /**
    * The segment that's associated with the first activity in the journey. This segment determines which users are participants in the journey.
    */
  var SegmentStartCondition: js.UndefOr[SegmentCondition] = js.undefined
}
object StartCondition {
  
  inline def apply(): StartCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartCondition]
  }
  
  extension [Self <: StartCondition](x: Self) {
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventStartCondition(value: EventStartCondition): Self = StObject.set(x, "EventStartCondition", value.asInstanceOf[js.Any])
    
    inline def setEventStartConditionUndefined: Self = StObject.set(x, "EventStartCondition", js.undefined)
    
    inline def setSegmentStartCondition(value: SegmentCondition): Self = StObject.set(x, "SegmentStartCondition", value.asInstanceOf[js.Any])
    
    inline def setSegmentStartConditionUndefined: Self = StObject.set(x, "SegmentStartCondition", js.undefined)
  }
}
