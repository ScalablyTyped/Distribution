package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppCampaignSchedule extends StObject {
  
  /**
    * The scheduled time after which the in-app message should not be shown. Timestamp is in ISO 8601 format.
    */
  var EndDate: js.UndefOr[string] = js.undefined
  
  /**
    * The event filter the SDK has to use to show the in-app message in the application.
    */
  var EventFilter: js.UndefOr[CampaignEventFilter] = js.undefined
  
  /**
    * Time during which the in-app message should not be shown to the user.
    */
  var QuietTime: js.UndefOr[typings.awsSdk.clientsPinpointMod.QuietTime] = js.undefined
}
object InAppCampaignSchedule {
  
  inline def apply(): InAppCampaignSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppCampaignSchedule]
  }
  
  extension [Self <: InAppCampaignSchedule](x: Self) {
    
    inline def setEndDate(value: string): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setEventFilter(value: CampaignEventFilter): Self = StObject.set(x, "EventFilter", value.asInstanceOf[js.Any])
    
    inline def setEventFilterUndefined: Self = StObject.set(x, "EventFilter", js.undefined)
    
    inline def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
    
    inline def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
  }
}
