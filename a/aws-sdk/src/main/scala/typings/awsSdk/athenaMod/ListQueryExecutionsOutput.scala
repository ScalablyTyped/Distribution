package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueryExecutionsOutput extends StObject {
  
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The unique IDs of each query execution as an array of strings.
    */
  var QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined
}
object ListQueryExecutionsOutput {
  
  inline def apply(): ListQueryExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueryExecutionsOutput]
  }
  
  extension [Self <: ListQueryExecutionsOutput](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryExecutionIds(value: QueryExecutionIdList): Self = StObject.set(x, "QueryExecutionIds", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionIdsUndefined: Self = StObject.set(x, "QueryExecutionIds", js.undefined)
    
    inline def setQueryExecutionIdsVarargs(value: QueryExecutionId*): Self = StObject.set(x, "QueryExecutionIds", js.Array(value :_*))
  }
}
