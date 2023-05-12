package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoringAlertHistoryRequest extends StObject {
  
  /**
    * A filter that returns only alerts created on or after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only alerts created on or before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of results to display. The default is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * The name of a monitoring alert.
    */
  var MonitoringAlertName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringAlertName] = js.undefined
  
  /**
    * The name of a monitoring schedule.
    */
  var MonitoringScheduleName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName] = js.undefined
  
  /**
    * If the result of the previous ListMonitoringAlertHistory request was truncated, the response includes a NextToken. To retrieve the next set of alerts in the history, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The field used to sort results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[MonitoringAlertHistorySortKey] = js.undefined
  
  /**
    * The sort order, whether Ascending or Descending, of the alert history. The default is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
  
  /**
    * A filter that retrieves only alerts with a specific status.
    */
  var StatusEquals: js.UndefOr[MonitoringAlertStatus] = js.undefined
}
object ListMonitoringAlertHistoryRequest {
  
  inline def apply(): ListMonitoringAlertHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoringAlertHistoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMonitoringAlertHistoryRequest] (val x: Self) extends AnyVal {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitoringAlertName(value: MonitoringAlertName): Self = StObject.set(x, "MonitoringAlertName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringAlertNameUndefined: Self = StObject.set(x, "MonitoringAlertName", js.undefined)
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleNameUndefined: Self = StObject.set(x, "MonitoringScheduleName", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: MonitoringAlertHistorySortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatusEquals(value: MonitoringAlertStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
