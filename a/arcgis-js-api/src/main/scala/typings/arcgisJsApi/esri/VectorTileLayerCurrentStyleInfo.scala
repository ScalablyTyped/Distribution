package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTileLayerCurrentStyleInfo extends Object {
  
  /**
    * Absolute template URL for font sets included in a style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var glyphsUrl: String = js.native
  
  /**
    * Vector tile service information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var layerDefinition: js.Any = js.native
  
  /**
    * Absolute URL for a vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var serviceUrl: String = js.native
  
  /**
    * Absolute URL for sprites included in a style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var spriteUrl: String = js.native
  
  /**
    * Style JSON object for vector tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var style: js.Any = js.native
  
  /**
    * Absolute URL for vector tile service style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var styleUrl: String = js.native
}
object VectorTileLayerCurrentStyleInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    glyphsUrl: String,
    hasOwnProperty: PropertyKey => Boolean,
    layerDefinition: js.Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    serviceUrl: String,
    spriteUrl: String,
    style: js.Any,
    styleUrl: String
  ): VectorTileLayerCurrentStyleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], glyphsUrl = glyphsUrl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerDefinition = layerDefinition.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), serviceUrl = serviceUrl.asInstanceOf[js.Any], spriteUrl = spriteUrl.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleUrl = styleUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCurrentStyleInfo]
  }
  
  @scala.inline
  implicit class VectorTileLayerCurrentStyleInfoMutableBuilder[Self <: VectorTileLayerCurrentStyleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlyphsUrl(value: String): Self = StObject.set(x, "glyphsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerDefinition(value: js.Any): Self = StObject.set(x, "layerDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteUrl(value: String): Self = StObject.set(x, "spriteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
  }
}
