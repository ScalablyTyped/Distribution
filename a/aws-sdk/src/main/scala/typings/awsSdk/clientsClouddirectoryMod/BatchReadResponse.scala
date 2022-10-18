package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchReadResponse extends StObject {
  
  /**
    * A list of all the responses for each batch read.
    */
  var Responses: js.UndefOr[BatchReadOperationResponseList] = js.undefined
}
object BatchReadResponse {
  
  inline def apply(): BatchReadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadResponse]
  }
  
  extension [Self <: BatchReadResponse](x: Self) {
    
    inline def setResponses(value: BatchReadOperationResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    inline def setResponsesVarargs(value: BatchReadOperationResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
  }
}
