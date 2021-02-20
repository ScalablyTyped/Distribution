package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureSourced extends StObject {
  
  var angle: js.UndefOr[Double] = js.native
  
  // "<base64EncodedImageData>";
  var contentType: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  // Relative URL for static layers and full URL for dynamic layers. Access relative URL using http://<mapservice-url>/<layerId1>/images/<imageUrl11>
  var imageData: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var xoffset: js.UndefOr[Double] = js.native
  
  var yoffset: js.UndefOr[Double] = js.native
}
object PictureSourced {
  
  @scala.inline
  def apply(): PictureSourced = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureSourced]
  }
  
  @scala.inline
  implicit class PictureSourcedMutableBuilder[Self <: PictureSourced] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImageData(value: String): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXoffsetUndefined: Self = StObject.set(x, "xoffset", js.undefined)
    
    @scala.inline
    def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoffsetUndefined: Self = StObject.set(x, "yoffset", js.undefined)
  }
}
