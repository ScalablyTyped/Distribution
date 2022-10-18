package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInputDeviceThumbnailResponse extends StObject {
  
  /**
    * The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
    */
  var Body: js.UndefOr[InputDeviceThumbnail] = js.undefined
  
  /**
    * The length of the content.
    */
  var ContentLength: js.UndefOr[long] = js.undefined
  
  /**
    * Specifies the media type of the thumbnail.
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsMedialiveMod.ContentType] = js.undefined
  
  /**
    * The unique, cacheable version of this thumbnail.
    */
  var ETag: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time the thumbnail was last updated at the device.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
}
object DescribeInputDeviceThumbnailResponse {
  
  inline def apply(): DescribeInputDeviceThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInputDeviceThumbnailResponse]
  }
  
  extension [Self <: DescribeInputDeviceThumbnailResponse](x: Self) {
    
    inline def setBody(value: InputDeviceThumbnail): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setContentLength(value: long): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setETag(value: string): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
  }
}
