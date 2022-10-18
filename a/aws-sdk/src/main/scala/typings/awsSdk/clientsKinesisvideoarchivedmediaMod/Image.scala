package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * The error message shown when the image for the provided timestamp was not extracted due to a non-tryable error. An error will be returned if:    There is no media that exists for the specified Timestamp.     The media for the specified time does not allow an image to be extracted. In this case the media is audio only, or the incorrect media has been ingested.  
    */
  var Error: js.UndefOr[ImageError] = js.undefined
  
  /**
    * An attribute of the Image object that is Base64 encoded.
    */
  var ImageContent: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.ImageContent] = js.undefined
  
  /**
    * An attribute of the Image object that is used to extract an image from the video stream. This field is used to manage gaps on images or to better understand the pagination window.
    */
  var TimeStamp: js.UndefOr[js.Date] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setError(value: ImageError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setImageContent(value: ImageContent): Self = StObject.set(x, "ImageContent", value.asInstanceOf[js.Any])
    
    inline def setImageContentUndefined: Self = StObject.set(x, "ImageContent", js.undefined)
    
    inline def setTimeStamp(value: js.Date): Self = StObject.set(x, "TimeStamp", value.asInstanceOf[js.Any])
    
    inline def setTimeStampUndefined: Self = StObject.set(x, "TimeStamp", js.undefined)
  }
}
