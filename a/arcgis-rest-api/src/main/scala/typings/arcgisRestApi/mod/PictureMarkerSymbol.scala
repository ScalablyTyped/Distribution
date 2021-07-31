package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriPMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisRestApi.mod.PictureSourced because var conflicts: angle, xoffset, yoffset. Inlined url, imageData, contentType, width, height */ trait PictureMarkerSymbol
  extends StObject
     with MarkerSymbol {
  
  // "<base64EncodedImageData>";
  var contentType: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  // Relative URL for static layers and full URL for dynamic layers. Access relative URL using http://<mapservice-url>/<layerId1>/images/<imageUrl11>
  var imageData: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_PictureMarkerSymbol: esriPMS
  
  var url: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PictureMarkerSymbol {
  
  @scala.inline
  def apply(): PictureMarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("esriPMS")
    __obj.asInstanceOf[PictureMarkerSymbol]
  }
  
  @scala.inline
  implicit class PictureMarkerSymbolMutableBuilder[Self <: PictureMarkerSymbol] (val x: Self) extends AnyVal {
    
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
    def setType(value: esriPMS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
