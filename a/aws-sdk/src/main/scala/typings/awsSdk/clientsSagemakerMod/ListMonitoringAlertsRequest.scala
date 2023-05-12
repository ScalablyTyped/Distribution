package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoringAlertsRequest extends StObject {
  
  /**
    * The maximum number of results to display. The default is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * The name of a monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName
  
  /**
    * If the result of the previous ListMonitoringAlerts request was truncated, the response includes a NextToken. To retrieve the next set of alerts in the history, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListMonitoringAlertsRequest {
  
  inline def apply(MonitoringScheduleName: MonitoringScheduleName): ListMonitoringAlertsRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringAlertsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMonitoringAlertsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
