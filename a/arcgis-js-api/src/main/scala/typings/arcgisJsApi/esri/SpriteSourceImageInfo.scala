package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSourceImageInfo extends StObject {
  
  /**
  		 * The device pixel ratio of the sprite source.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
  		 */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Sprite source for non high-DPI devices.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
  		 */
  var spriteSource1x: js.UndefOr[SpriteSourceImageInfoSpriteSource1x] = js.undefined
  
  /**
  		 * Sprite source for high-DPI devices.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
  		 */
  var spriteSource2x: js.UndefOr[SpriteSourceImageInfoSpriteSource2x] = js.undefined
  
  /**
  		 * The sprite source url.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
  		 */
  var spriteUrl: js.UndefOr[String] = js.undefined
  
  /**
  		 * For SpriteSourceImageInfo the type is always "image".
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
  		 */
  var `type`: String
}
object SpriteSourceImageInfo {
  
  inline def apply(`type`: String): SpriteSourceImageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSourceImageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpriteSourceImageInfo] (val x: Self) extends AnyVal {
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setSpriteSource1x(value: SpriteSourceImageInfoSpriteSource1x): Self = StObject.set(x, "spriteSource1x", value.asInstanceOf[js.Any])
    
    inline def setSpriteSource1xUndefined: Self = StObject.set(x, "spriteSource1x", js.undefined)
    
    inline def setSpriteSource2x(value: SpriteSourceImageInfoSpriteSource2x): Self = StObject.set(x, "spriteSource2x", value.asInstanceOf[js.Any])
    
    inline def setSpriteSource2xUndefined: Self = StObject.set(x, "spriteSource2x", js.undefined)
    
    inline def setSpriteUrl(value: String): Self = StObject.set(x, "spriteUrl", value.asInstanceOf[js.Any])
    
    inline def setSpriteUrlUndefined: Self = StObject.set(x, "spriteUrl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
