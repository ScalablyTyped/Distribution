package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuditFindingsRequest extends StObject {
  
  /**
    * A filter to limit results to the findings for the specified audit check.
    */
  var checkName: js.UndefOr[AuditCheckName] = js.undefined
  
  /**
    * A filter to limit results to those found before the specified time. You must specify either the startTime and endTime or the taskId, but not both.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Boolean flag indicating whether only the suppressed findings or the unsuppressed findings should be listed. If this parameter isn't provided, the response will list both suppressed and unsuppressed findings. 
    */
  var listSuppressedFindings: js.UndefOr[ListSuppressedFindings] = js.undefined
  
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Information identifying the noncompliant resource.
    */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
  
  /**
    * A filter to limit results to those found after the specified time. You must specify either the startTime and endTime or the taskId, but not both.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter to limit results to the audit with the specified ID. You must specify either the taskId or the startTime and endTime, but not both.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.undefined
}
object ListAuditFindingsRequest {
  
  inline def apply(): ListAuditFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditFindingsRequest]
  }
  
  extension [Self <: ListAuditFindingsRequest](x: Self) {
    
    inline def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    inline def setCheckNameUndefined: Self = StObject.set(x, "checkName", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setListSuppressedFindings(value: ListSuppressedFindings): Self = StObject.set(x, "listSuppressedFindings", value.asInstanceOf[js.Any])
    
    inline def setListSuppressedFindingsUndefined: Self = StObject.set(x, "listSuppressedFindings", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
