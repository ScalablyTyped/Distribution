package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSource extends StObject {
  
  /**
    * The base URL of the sprites source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  var baseUrl: String
  
  /**
    * The device pixel ratio of the sprite source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  var devicePixelRatio: Double
  
  /**
    * Returns the sprite info for the given sprite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  def getSpriteInfo(name: String): SpriteInfo
  /**
    * Returns the sprite info for the given sprite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  @JSName("getSpriteInfo")
  var getSpriteInfo_Original: GetSpriteInfo
  
  /**
    * The height in pixels of the sprite source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  var height: Double
  
  /**
    * The sprite image data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  var image: js.typedarray.Uint8Array
  
  /**
    * Indicates whether the sprite source is loaded successfully.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  var loadStatus: Any
  
  /**
    * The width in pixels of the sprite source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  var width: Double
}
object SpriteSource {
  
  inline def apply(
    baseUrl: String,
    devicePixelRatio: Double,
    getSpriteInfo: /* name */ String => SpriteInfo,
    height: Double,
    image: js.typedarray.Uint8Array,
    loadStatus: Any,
    width: Double
  ): SpriteSource = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], devicePixelRatio = devicePixelRatio.asInstanceOf[js.Any], getSpriteInfo = js.Any.fromFunction1(getSpriteInfo), height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], loadStatus = loadStatus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpriteSource] (val x: Self) extends AnyVal {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setGetSpriteInfo(value: /* name */ String => SpriteInfo): Self = StObject.set(x, "getSpriteInfo", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setLoadStatus(value: Any): Self = StObject.set(x, "loadStatus", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
