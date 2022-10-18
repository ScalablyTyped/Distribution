package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryPlanningResponse extends StObject {
  
  /**
    * The ID of the plan query operation can be used to fetch the actual work unit descriptors that are produced as the result of the operation. The ID is also used to get the query state and as an input to the Execute operation.
    */
  var QueryId: QueryIdString
}
object StartQueryPlanningResponse {
  
  inline def apply(QueryId: QueryIdString): StartQueryPlanningResponse = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryPlanningResponse]
  }
  
  extension [Self <: StartQueryPlanningResponse](x: Self) {
    
    inline def setQueryId(value: QueryIdString): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
