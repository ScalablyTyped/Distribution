package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssociationExecutionsRequest extends StObject {
  
  /**
    * The association ID for which you want to view execution history details.
    */
  var AssociationId: typings.awsSdk.clientsSsmMod.AssociationId
  
  /**
    * Filters for the request. You can specify the following filters and values. ExecutionId (EQUAL) Status (EQUAL) CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
    */
  var Filters: js.UndefOr[AssociationExecutionFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribeAssociationExecutionsRequest {
  
  inline def apply(AssociationId: AssociationId): DescribeAssociationExecutionsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssociationExecutionsRequest]
  }
  
  extension [Self <: DescribeAssociationExecutionsRequest](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: AssociationExecutionFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: AssociationExecutionFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
