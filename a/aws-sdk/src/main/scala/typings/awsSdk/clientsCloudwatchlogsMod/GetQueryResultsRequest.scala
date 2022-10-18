package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryResultsRequest extends StObject {
  
  /**
    * The ID number of the query.
    */
  var queryId: QueryId
}
object GetQueryResultsRequest {
  
  inline def apply(queryId: QueryId): GetQueryResultsRequest = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsRequest]
  }
  
  extension [Self <: GetQueryResultsRequest](x: Self) {
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
  }
}
