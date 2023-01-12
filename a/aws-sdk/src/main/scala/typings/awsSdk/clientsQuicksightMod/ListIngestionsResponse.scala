package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIngestionsResponse extends StObject {
  
  /**
    * A list of the ingestions.
    */
  var Ingestions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Ingestions] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListIngestionsResponse {
  
  inline def apply(): ListIngestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIngestionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIngestionsResponse] (val x: Self) extends AnyVal {
    
    inline def setIngestions(value: Ingestions): Self = StObject.set(x, "Ingestions", value.asInstanceOf[js.Any])
    
    inline def setIngestionsUndefined: Self = StObject.set(x, "Ingestions", js.undefined)
    
    inline def setIngestionsVarargs(value: Ingestion*): Self = StObject.set(x, "Ingestions", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
