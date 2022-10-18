package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuditTasksResponse extends StObject {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The audits that were performed during the specified time period.
    */
  var tasks: js.UndefOr[AuditTaskMetadataList] = js.undefined
}
object ListAuditTasksResponse {
  
  inline def apply(): ListAuditTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditTasksResponse]
  }
  
  extension [Self <: ListAuditTasksResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTasks(value: AuditTaskMetadataList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: AuditTaskMetadata*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
