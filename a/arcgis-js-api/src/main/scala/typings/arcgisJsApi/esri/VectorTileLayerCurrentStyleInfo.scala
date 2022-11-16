package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorTileLayerCurrentStyleInfo extends StObject {
  
  /**
    * Absolute template URL for font sets included in a style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var glyphsUrl: String
  
  /**
    * Vector tile service information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var layerDefinition: Any
  
  /**
    * Absolute URL for a vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var serviceUrl: String
  
  /**
    * Absolute URL for sprites included in a style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var spriteUrl: String
  
  /**
    * Style JSON object for vector tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var style: Any
  
  /**
    * Absolute URL for vector tile service style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var styleUrl: String
}
object VectorTileLayerCurrentStyleInfo {
  
  inline def apply(
    glyphsUrl: String,
    layerDefinition: Any,
    serviceUrl: String,
    spriteUrl: String,
    style: Any,
    styleUrl: String
  ): VectorTileLayerCurrentStyleInfo = {
    val __obj = js.Dynamic.literal(glyphsUrl = glyphsUrl.asInstanceOf[js.Any], layerDefinition = layerDefinition.asInstanceOf[js.Any], serviceUrl = serviceUrl.asInstanceOf[js.Any], spriteUrl = spriteUrl.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleUrl = styleUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCurrentStyleInfo]
  }
  
  extension [Self <: VectorTileLayerCurrentStyleInfo](x: Self) {
    
    inline def setGlyphsUrl(value: String): Self = StObject.set(x, "glyphsUrl", value.asInstanceOf[js.Any])
    
    inline def setLayerDefinition(value: Any): Self = StObject.set(x, "layerDefinition", value.asInstanceOf[js.Any])
    
    inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
    
    inline def setSpriteUrl(value: String): Self = StObject.set(x, "spriteUrl", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
  }
}
