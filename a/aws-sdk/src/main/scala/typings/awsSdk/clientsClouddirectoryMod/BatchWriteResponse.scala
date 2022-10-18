package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteResponse extends StObject {
  
  /**
    * A list of all the responses for each batch write.
    */
  var Responses: js.UndefOr[BatchWriteOperationResponseList] = js.undefined
}
object BatchWriteResponse {
  
  inline def apply(): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteResponse]
  }
  
  extension [Self <: BatchWriteResponse](x: Self) {
    
    inline def setResponses(value: BatchWriteOperationResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    inline def setResponsesVarargs(value: BatchWriteOperationResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
  }
}
