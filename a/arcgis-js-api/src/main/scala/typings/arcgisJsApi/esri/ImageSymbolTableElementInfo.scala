package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSymbolTableElementInfo
  extends StObject
     with SymbolTableElementType {
  
  /**
    * The height of the image in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The label of the category corresponding to the given image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The opacity of the image (`0` to `1`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var opacity: Double
  
  /**
    * The data URI of the image representing a colored pixel in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var src: String
  
  /**
    * The width of the image in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ImageSymbolTableElementInfo {
  
  inline def apply(opacity: Double, src: String): ImageSymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSymbolTableElementInfo]
  }
  
  extension [Self <: ImageSymbolTableElementInfo](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
