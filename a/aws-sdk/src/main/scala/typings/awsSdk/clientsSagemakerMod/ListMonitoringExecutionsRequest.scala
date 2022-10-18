package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoringExecutionsRequest extends StObject {
  
  /**
    * A filter that returns only jobs created after a specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only jobs created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Name of a specific endpoint to fetch jobs for.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointName] = js.undefined
  
  /**
    * A filter that returns only jobs modified before a specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only jobs modified after a specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * Gets a list of the monitoring job runs of the specified monitoring job definitions.
    */
  var MonitoringJobDefinitionName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringJobDefinitionName] = js.undefined
  
  /**
    * Name of a specific schedule to fetch jobs for.
    */
  var MonitoringScheduleName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName] = js.undefined
  
  /**
    * A filter that returns only the monitoring job runs of the specified monitoring type.
    */
  var MonitoringTypeEquals: js.UndefOr[MonitoringType] = js.undefined
  
  /**
    * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * Filter for jobs scheduled after a specified time.
    */
  var ScheduledTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter for jobs scheduled before a specified time.
    */
  var ScheduledTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Whether to sort results by Status, CreationTime, ScheduledTime field. The default is CreationTime.
    */
  var SortBy: js.UndefOr[MonitoringExecutionSortKey] = js.undefined
  
  /**
    * Whether to sort the results in Ascending or Descending order. The default is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
  
  /**
    * A filter that retrieves only jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[ExecutionStatus] = js.undefined
}
object ListMonitoringExecutionsRequest {
  
  inline def apply(): ListMonitoringExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoringExecutionsRequest]
  }
  
  extension [Self <: ListMonitoringExecutionsRequest](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setLastModifiedTimeAfter(value: js.Date): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    inline def setLastModifiedTimeBefore(value: js.Date): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitoringJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "MonitoringJobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionNameUndefined: Self = StObject.set(x, "MonitoringJobDefinitionName", js.undefined)
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleNameUndefined: Self = StObject.set(x, "MonitoringScheduleName", js.undefined)
    
    inline def setMonitoringTypeEquals(value: MonitoringType): Self = StObject.set(x, "MonitoringTypeEquals", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTypeEqualsUndefined: Self = StObject.set(x, "MonitoringTypeEquals", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledTimeAfter(value: js.Date): Self = StObject.set(x, "ScheduledTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimeAfterUndefined: Self = StObject.set(x, "ScheduledTimeAfter", js.undefined)
    
    inline def setScheduledTimeBefore(value: js.Date): Self = StObject.set(x, "ScheduledTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimeBeforeUndefined: Self = StObject.set(x, "ScheduledTimeBefore", js.undefined)
    
    inline def setSortBy(value: MonitoringExecutionSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatusEquals(value: ExecutionStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
