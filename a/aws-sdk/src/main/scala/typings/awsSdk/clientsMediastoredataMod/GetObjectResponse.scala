package typings.awsSdk.clientsMediastoredataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectResponse extends StObject {
  
  /**
    * The bytes of the object. 
    */
  var Body: js.UndefOr[PayloadBlob] = js.undefined
  
  /**
    * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP spec at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
    */
  var CacheControl: js.UndefOr[StringPrimitive] = js.undefined
  
  /**
    * The length of the object in bytes.
    */
  var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The range of bytes to retrieve.
    */
  var ContentRange: js.UndefOr[ContentRangePattern] = js.undefined
  
  /**
    * The content type of the object.
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsMediastoredataMod.ContentType] = js.undefined
  
  /**
    * The ETag that represents a unique instance of the object.
    */
  var ETag: js.UndefOr[typings.awsSdk.clientsMediastoredataMod.ETag] = js.undefined
  
  /**
    * The date and time that the object was last modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other status codes indicate the type of error that occurred.
    */
  var StatusCode: statusCode
}
object GetObjectResponse {
  
  inline def apply(StatusCode: statusCode): GetObjectResponse = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectResponse]
  }
  
  extension [Self <: GetObjectResponse](x: Self) {
    
    inline def setBody(value: PayloadBlob): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setCacheControl(value: StringPrimitive): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setContentLength(value: NonNegativeLong): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentRange(value: ContentRangePattern): Self = StObject.set(x, "ContentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "ContentRange", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setStatusCode(value: statusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
  }
}
