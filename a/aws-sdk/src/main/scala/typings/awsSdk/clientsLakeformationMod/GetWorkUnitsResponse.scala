package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkUnitsResponse extends StObject {
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The ID of the plan query operation.
    */
  var QueryId: QueryIdString
  
  /**
    * A WorkUnitRangeList object that specifies the valid range of work unit IDs for querying the execution service.
    */
  var WorkUnitRanges: WorkUnitRangeList
}
object GetWorkUnitsResponse {
  
  inline def apply(QueryId: QueryIdString, WorkUnitRanges: WorkUnitRangeList): GetWorkUnitsResponse = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any], WorkUnitRanges = WorkUnitRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkUnitsResponse]
  }
  
  extension [Self <: GetWorkUnitsResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryId(value: QueryIdString): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setWorkUnitRanges(value: WorkUnitRangeList): Self = StObject.set(x, "WorkUnitRanges", value.asInstanceOf[js.Any])
    
    inline def setWorkUnitRangesVarargs(value: WorkUnitRange*): Self = StObject.set(x, "WorkUnitRanges", js.Array(value*))
  }
}
