package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssociationExecutionTargetsRequest extends StObject {
  
  /**
    * The association ID that includes the execution for which you want to view details.
    */
  var AssociationId: typings.awsSdk.clientsSsmMod.AssociationId
  
  /**
    * The execution ID for which you want to view details.
    */
  var ExecutionId: AssociationExecutionId
  
  /**
    * Filters for the request. You can specify the following filters and values. Status (EQUAL) ResourceId (EQUAL) ResourceType (EQUAL)
    */
  var Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribeAssociationExecutionTargetsRequest {
  
  inline def apply(AssociationId: AssociationId, ExecutionId: AssociationExecutionId): DescribeAssociationExecutionTargetsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], ExecutionId = ExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsRequest]
  }
  
  extension [Self <: DescribeAssociationExecutionTargetsRequest](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setExecutionId(value: AssociationExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: AssociationExecutionTargetsFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: AssociationExecutionTargetsFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
