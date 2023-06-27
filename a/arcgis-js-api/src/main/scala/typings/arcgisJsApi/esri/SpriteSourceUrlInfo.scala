package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.arcgisJsApi.arcgisJsApiStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSourceUrlInfo extends StObject {
  
  /**
  		 * The device pixel ratio used to fetch the appropriate sprite source.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceUrlInfo)
  		 */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The sprite image format.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceUrlInfo)
  		 */
  var spriteFormat: js.UndefOr[png | webp] = js.undefined
  
  /**
  		 * The sprite source url.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceUrlInfo)
  		 */
  var spriteUrl: String
  
  /**
  		 * For SpriteSourceUrlInfo the type is always "url".
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceUrlInfo)
  		 */
  var `type`: String
}
object SpriteSourceUrlInfo {
  
  inline def apply(spriteUrl: String, `type`: String): SpriteSourceUrlInfo = {
    val __obj = js.Dynamic.literal(spriteUrl = spriteUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSourceUrlInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpriteSourceUrlInfo] (val x: Self) extends AnyVal {
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setSpriteFormat(value: png | webp): Self = StObject.set(x, "spriteFormat", value.asInstanceOf[js.Any])
    
    inline def setSpriteFormatUndefined: Self = StObject.set(x, "spriteFormat", js.undefined)
    
    inline def setSpriteUrl(value: String): Self = StObject.set(x, "spriteUrl", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
