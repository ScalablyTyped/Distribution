package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenHours extends StObject {
  
  /**
    * Specifies the schedule settings for the custom channel.
    */
  var CUSTOM: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
  
  /**
    * Specifies the schedule settings for the email channel.
    */
  var EMAIL: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
  
  /**
    * Specifies the schedule settings for the push channel.
    */
  var PUSH: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
  
  /**
    * Specifies the schedule settings for the SMS channel.
    */
  var SMS: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
  
  /**
    * Specifies the schedule settings for the voice channel.
    */
  var VOICE: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
}
object OpenHours {
  
  inline def apply(): OpenHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenHours]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenHours] (val x: Self) extends AnyVal {
    
    inline def setCUSTOM(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "CUSTOM", value.asInstanceOf[js.Any])
    
    inline def setCUSTOMUndefined: Self = StObject.set(x, "CUSTOM", js.undefined)
    
    inline def setEMAIL(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "EMAIL", value.asInstanceOf[js.Any])
    
    inline def setEMAILUndefined: Self = StObject.set(x, "EMAIL", js.undefined)
    
    inline def setPUSH(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "PUSH", value.asInstanceOf[js.Any])
    
    inline def setPUSHUndefined: Self = StObject.set(x, "PUSH", js.undefined)
    
    inline def setSMS(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "SMS", value.asInstanceOf[js.Any])
    
    inline def setSMSUndefined: Self = StObject.set(x, "SMS", js.undefined)
    
    inline def setVOICE(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "VOICE", value.asInstanceOf[js.Any])
    
    inline def setVOICEUndefined: Self = StObject.set(x, "VOICE", js.undefined)
  }
}
