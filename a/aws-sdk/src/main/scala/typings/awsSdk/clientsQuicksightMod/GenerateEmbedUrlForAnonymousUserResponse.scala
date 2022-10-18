package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEmbedUrlForAnonymousUserResponse extends StObject {
  
  /**
    * The embed URL for the dashboard.
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
object GenerateEmbedUrlForAnonymousUserResponse {
  
  inline def apply(EmbedUrl: EmbeddingUrl, RequestId: String, Status: StatusCode): GenerateEmbedUrlForAnonymousUserResponse = {
    val __obj = js.Dynamic.literal(EmbedUrl = EmbedUrl.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEmbedUrlForAnonymousUserResponse]
  }
  
  extension [Self <: GenerateEmbedUrlForAnonymousUserResponse](x: Self) {
    
    inline def setEmbedUrl(value: EmbeddingUrl): Self = StObject.set(x, "EmbedUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
