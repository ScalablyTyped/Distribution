package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignLimits extends StObject {
  
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. For an application, this value specifies the default limit for the number of messages that campaigns and journeys can send to a single endpoint during a 24-hour period. The maximum value is 100.
    */
  var Daily: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled start time for the campaign. The minimum value is 60 seconds.
    */
  var MaximumDuration: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum number of messages that a campaign can send each second. For an application, this value specifies the default limit for the number of messages that campaigns can send each second. The minimum value is 50. The maximum value is 20,000.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum total number of messages that the campaign can send per user session.
    */
  var Session: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign. If a campaign recurs, this setting applies to all runs of the campaign. The maximum value is 100.
    */
  var Total: js.UndefOr[integer] = js.undefined
}
object CampaignLimits {
  
  inline def apply(): CampaignLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignLimits]
  }
  
  extension [Self <: CampaignLimits](x: Self) {
    
    inline def setDaily(value: integer): Self = StObject.set(x, "Daily", value.asInstanceOf[js.Any])
    
    inline def setDailyUndefined: Self = StObject.set(x, "Daily", js.undefined)
    
    inline def setMaximumDuration(value: integer): Self = StObject.set(x, "MaximumDuration", value.asInstanceOf[js.Any])
    
    inline def setMaximumDurationUndefined: Self = StObject.set(x, "MaximumDuration", js.undefined)
    
    inline def setMessagesPerSecond(value: integer): Self = StObject.set(x, "MessagesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setMessagesPerSecondUndefined: Self = StObject.set(x, "MessagesPerSecond", js.undefined)
    
    inline def setSession(value: integer): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    inline def setTotal(value: integer): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
