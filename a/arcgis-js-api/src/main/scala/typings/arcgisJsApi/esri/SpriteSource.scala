package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSource
  extends StObject
     with Object {
  
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
    * The height in pixels of the sprite source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSource)
    */
  var height: Double
  
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
    constructor: js.Function,
    devicePixelRatio: Double,
    hasOwnProperty: PropertyKey => Boolean,
    height: Double,
    loadStatus: Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): SpriteSource = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], devicePixelRatio = devicePixelRatio.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height.asInstanceOf[js.Any], loadStatus = loadStatus.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSource]
  }
  
  extension [Self <: SpriteSource](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLoadStatus(value: Any): Self = StObject.set(x, "loadStatus", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
