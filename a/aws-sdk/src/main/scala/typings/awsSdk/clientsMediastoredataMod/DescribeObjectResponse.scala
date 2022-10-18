package typings.awsSdk.clientsMediastoredataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObjectResponse extends StObject {
  
  /**
    * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
    */
  var CacheControl: js.UndefOr[StringPrimitive] = js.undefined
  
  /**
    * The length of the object in bytes.
    */
  var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
  
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
}
object DescribeObjectResponse {
  
  inline def apply(): DescribeObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeObjectResponse]
  }
  
  extension [Self <: DescribeObjectResponse](x: Self) {
    
    inline def setCacheControl(value: StringPrimitive): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setContentLength(value: NonNegativeLong): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
  }
}
