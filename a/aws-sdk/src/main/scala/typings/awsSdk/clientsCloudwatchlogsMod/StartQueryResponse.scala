package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryResponse extends StObject {
  
  /**
    * The unique ID of the query. 
    */
  var queryId: js.UndefOr[QueryId] = js.undefined
}
object StartQueryResponse {
  
  inline def apply(): StartQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryResponse]
  }
  
  extension [Self <: StartQueryResponse](x: Self) {
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
  }
}
