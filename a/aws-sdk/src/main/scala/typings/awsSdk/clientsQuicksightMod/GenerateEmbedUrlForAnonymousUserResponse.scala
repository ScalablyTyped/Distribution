package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEmbedUrlForAnonymousUserResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) to use for the anonymous Amazon QuickSight user.
    */
  var AnonymousUserArn: Arn
  
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
  
  inline def apply(AnonymousUserArn: Arn, EmbedUrl: EmbeddingUrl, RequestId: String, Status: StatusCode): GenerateEmbedUrlForAnonymousUserResponse = {
    val __obj = js.Dynamic.literal(AnonymousUserArn = AnonymousUserArn.asInstanceOf[js.Any], EmbedUrl = EmbedUrl.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEmbedUrlForAnonymousUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateEmbedUrlForAnonymousUserResponse] (val x: Self) extends AnyVal {
    
    inline def setAnonymousUserArn(value: Arn): Self = StObject.set(x, "AnonymousUserArn", value.asInstanceOf[js.Any])
    
    inline def setEmbedUrl(value: EmbeddingUrl): Self = StObject.set(x, "EmbedUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
