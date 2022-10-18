package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBonusPaymentsRequest extends StObject {
  
  /**
    * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
    */
  var AssignmentId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be specified
    */
  var HITId: js.UndefOr[EntityId] = js.undefined
  
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListBonusPaymentsRequest {
  
  inline def apply(): ListBonusPaymentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBonusPaymentsRequest]
  }
  
  extension [Self <: ListBonusPaymentsRequest](x: Self) {
    
    inline def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    inline def setAssignmentIdUndefined: Self = StObject.set(x, "AssignmentId", js.undefined)
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    inline def setHITIdUndefined: Self = StObject.set(x, "HITId", js.undefined)
    
    inline def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
