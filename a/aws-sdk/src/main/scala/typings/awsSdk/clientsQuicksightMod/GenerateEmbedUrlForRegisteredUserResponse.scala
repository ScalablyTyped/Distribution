package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEmbedUrlForRegisteredUserResponse extends StObject {
  
  /**
    * The embed URL for the Amazon QuickSight dashboard, visual, Q search bar, or console.
    */
  var EmbedUrl: EmbeddingUrl
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: String
  
  /**
    * The HTTP status of the request.
    */
  var Status: StatusCode
}
object GenerateEmbedUrlForRegisteredUserResponse {
  
  inline def apply(EmbedUrl: EmbeddingUrl, RequestId: String, Status: StatusCode): GenerateEmbedUrlForRegisteredUserResponse = {
    val __obj = js.Dynamic.literal(EmbedUrl = EmbedUrl.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEmbedUrlForRegisteredUserResponse]
  }
  
  extension [Self <: GenerateEmbedUrlForRegisteredUserResponse](x: Self) {
    
    inline def setEmbedUrl(value: EmbeddingUrl): Self = StObject.set(x, "EmbedUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
