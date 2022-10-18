package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuditMitigationActionsTasksRequest extends StObject {
  
  /**
    * Specify this filter to limit results to tasks that were applied to results for a specific audit.
    */
  var auditTaskId: js.UndefOr[AuditTaskId] = js.undefined
  
  /**
    * Specify this filter to limit results to tasks that were completed or canceled on or before a specific date and time.
    */
  var endTime: js.Date
  
  /**
    * Specify this filter to limit results to tasks that were applied to a specific audit finding.
    */
  var findingId: js.UndefOr[FindingId] = js.undefined
  
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specify this filter to limit results to tasks that began on or after a specific date and time.
    */
  var startTime: js.Date
  
  /**
    * Specify this filter to limit results to tasks that are in a specific state.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
}
object ListAuditMitigationActionsTasksRequest {
  
  inline def apply(endTime: js.Date, startTime: js.Date): ListAuditMitigationActionsTasksRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsTasksRequest]
  }
  
  extension [Self <: ListAuditMitigationActionsTasksRequest](x: Self) {
    
    inline def setAuditTaskId(value: AuditTaskId): Self = StObject.set(x, "auditTaskId", value.asInstanceOf[js.Any])
    
    inline def setAuditTaskIdUndefined: Self = StObject.set(x, "auditTaskId", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setFindingId(value: FindingId): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
    
    inline def setFindingIdUndefined: Self = StObject.set(x, "findingId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTaskStatus(value: AuditMitigationActionsTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
  }
}
