package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteInfo extends StObject {
  
  /**
    * The height of the sprite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteInfo)
    */
  var height: Double
  
  /**
    * The pixel ratio of the sprite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteInfo)
    */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the sprite is SDF or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteInfo)
    */
  var sdf: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the sprite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteInfo)
    */
  var width: Double
  
  /**
    * The x position of the upper-left corner of the sprite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteInfo)
    */
  var x: Double
  
  /**
    * The y position of the upper-left corner of the sprite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteInfo)
    */
  var y: Double
}
object SpriteInfo {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): SpriteInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteInfo]
  }
  
  extension [Self <: SpriteInfo](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setSdf(value: Double): Self = StObject.set(x, "sdf", value.asInstanceOf[js.Any])
    
    inline def setSdfUndefined: Self = StObject.set(x, "sdf", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
