package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHealthEventsInput extends StObject {
  
  /**
    * The time when a health event ended. If the health event is still ongoing, then the end time is not set.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of a health event.
    */
  var EventStatus: js.UndefOr[HealthEventStatus] = js.undefined
  
  /**
    * The number of health event objects that you want to return with this call. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.MaxResults] = js.undefined
  
  /**
    * The name of the monitor.
    */
  var MonitorName: ResourceName
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The time when a health event started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object ListHealthEventsInput {
  
  inline def apply(MonitorName: ResourceName): ListHealthEventsInput = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHealthEventsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHealthEventsInput] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEventStatus(value: HealthEventStatus): Self = StObject.set(x, "EventStatus", value.asInstanceOf[js.Any])
    
    inline def setEventStatusUndefined: Self = StObject.set(x, "EventStatus", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitorName(value: ResourceName): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
