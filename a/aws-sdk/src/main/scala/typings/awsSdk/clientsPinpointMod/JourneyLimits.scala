package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyLimits extends StObject {
  
  /**
    * The maximum number of messages that the journey can send to a single participant during a 24-hour period. The maximum value is 100.
    */
  var DailyCap: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow participants to enter the journey an unlimited number of times, set this value to 0.
    */
  var EndpointReentryCap: js.UndefOr[integer] = js.undefined
  
  /**
    * Minimum time that must pass before an endpoint can re-enter a given journey. The duration should use an ISO 8601 format, such as PT1H. 
    */
  var EndpointReentryInterval: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of messages that the journey can send each second.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.undefined
}
object JourneyLimits {
  
  inline def apply(): JourneyLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneyLimits] (val x: Self) extends AnyVal {
    
    inline def setDailyCap(value: integer): Self = StObject.set(x, "DailyCap", value.asInstanceOf[js.Any])
    
    inline def setDailyCapUndefined: Self = StObject.set(x, "DailyCap", js.undefined)
    
    inline def setEndpointReentryCap(value: integer): Self = StObject.set(x, "EndpointReentryCap", value.asInstanceOf[js.Any])
    
    inline def setEndpointReentryCapUndefined: Self = StObject.set(x, "EndpointReentryCap", js.undefined)
    
    inline def setEndpointReentryInterval(value: string): Self = StObject.set(x, "EndpointReentryInterval", value.asInstanceOf[js.Any])
    
    inline def setEndpointReentryIntervalUndefined: Self = StObject.set(x, "EndpointReentryInterval", js.undefined)
    
    inline def setMessagesPerSecond(value: integer): Self = StObject.set(x, "MessagesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setMessagesPerSecondUndefined: Self = StObject.set(x, "MessagesPerSecond", js.undefined)
  }
}
