package typings.areNa.mod

import typings.areNa.anon.Filesize
import typings.areNa.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * MIME type of the image (e.g. 'image/png')
    */
  var content_type: String
  
  /**
    * Only contains url which is a URL of the display sized image
    * (same aspect ratio as original image but with a maximim width
    * of 600px or a maximum height of 600px, whichever comes first)
    */
  var display: Url
  
  /**
    * Name of the file as it appears on the Arena filesystem
    */
  var filename: String
  
  /**
    * Contains url which is a URL of the original image as well file_size
    * (an integer representation in bytes) and file_size_display
    * (a nicer string representation of the file_size)
    */
  var original: Filesize
  
  /**
    * Only contains url which is a URL of the thumbnail sized image (200x200)
    */
  var thumb: Url
  
  /**
    * Timestamp of the last time the file was updated
    */
  var updated_at: Timestamp
}
object Image {
  
  inline def apply(
    content_type: String,
    display: Url,
    filename: String,
    original: Filesize,
    thumb: Url,
    updated_at: Timestamp
  ): Image = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Url): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: Filesize): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setThumb(value: Url): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: Timestamp): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
