package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppMessageCampaign extends StObject {
  
  /**
    * Campaign id of the corresponding campaign.
    */
  var CampaignId: js.UndefOr[string] = js.undefined
  
  /**
    * Daily cap which controls the number of times any in-app messages can be shown to the endpoint during a day.
    */
  var DailyCap: js.UndefOr[integer] = js.undefined
  
  /**
    * In-app message content with all fields required for rendering an in-app message.
    */
  var InAppMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.InAppMessage] = js.undefined
  
  /**
    * Priority of the in-app message.
    */
  var Priority: js.UndefOr[integer] = js.undefined
  
  /**
    * Schedule of the campaign.
    */
  var Schedule: js.UndefOr[InAppCampaignSchedule] = js.undefined
  
  /**
    * Session cap which controls the number of times an in-app message can be shown to the endpoint during an application session.
    */
  var SessionCap: js.UndefOr[integer] = js.undefined
  
  /**
    * Total cap which controls the number of times an in-app message can be shown to the endpoint.
    */
  var TotalCap: js.UndefOr[integer] = js.undefined
  
  /**
    * Treatment id of the campaign.
    */
  var TreatmentId: js.UndefOr[string] = js.undefined
}
object InAppMessageCampaign {
  
  inline def apply(): InAppMessageCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppMessageCampaign]
  }
  
  extension [Self <: InAppMessageCampaign](x: Self) {
    
    inline def setCampaignId(value: string): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "CampaignId", js.undefined)
    
    inline def setDailyCap(value: integer): Self = StObject.set(x, "DailyCap", value.asInstanceOf[js.Any])
    
    inline def setDailyCapUndefined: Self = StObject.set(x, "DailyCap", js.undefined)
    
    inline def setInAppMessage(value: InAppMessage): Self = StObject.set(x, "InAppMessage", value.asInstanceOf[js.Any])
    
    inline def setInAppMessageUndefined: Self = StObject.set(x, "InAppMessage", js.undefined)
    
    inline def setPriority(value: integer): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setSchedule(value: InAppCampaignSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSessionCap(value: integer): Self = StObject.set(x, "SessionCap", value.asInstanceOf[js.Any])
    
    inline def setSessionCapUndefined: Self = StObject.set(x, "SessionCap", js.undefined)
    
    inline def setTotalCap(value: integer): Self = StObject.set(x, "TotalCap", value.asInstanceOf[js.Any])
    
    inline def setTotalCapUndefined: Self = StObject.set(x, "TotalCap", js.undefined)
    
    inline def setTreatmentId(value: string): Self = StObject.set(x, "TreatmentId", value.asInstanceOf[js.Any])
    
    inline def setTreatmentIdUndefined: Self = StObject.set(x, "TreatmentId", js.undefined)
  }
}
