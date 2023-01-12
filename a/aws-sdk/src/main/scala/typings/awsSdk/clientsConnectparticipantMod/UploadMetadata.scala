package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadMetadata extends StObject {
  
  /**
    * The headers to be provided while uploading the file to the URL.
    */
  var HeadersToInclude: js.UndefOr[UploadMetadataSignedHeaders] = js.undefined
  
  /**
    * This is the pre-signed URL that can be used for uploading the file to Amazon S3 when used in response to StartAttachmentUpload.
    */
  var Url: js.UndefOr[UploadMetadataUrl] = js.undefined
  
  /**
    * The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var UrlExpiry: js.UndefOr[ISO8601Datetime] = js.undefined
}
object UploadMetadata {
  
  inline def apply(): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadMetadata] (val x: Self) extends AnyVal {
    
    inline def setHeadersToInclude(value: UploadMetadataSignedHeaders): Self = StObject.set(x, "HeadersToInclude", value.asInstanceOf[js.Any])
    
    inline def setHeadersToIncludeUndefined: Self = StObject.set(x, "HeadersToInclude", js.undefined)
    
    inline def setUrl(value: UploadMetadataUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlExpiry(value: ISO8601Datetime): Self = StObject.set(x, "UrlExpiry", value.asInstanceOf[js.Any])
    
    inline def setUrlExpiryUndefined: Self = StObject.set(x, "UrlExpiry", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
