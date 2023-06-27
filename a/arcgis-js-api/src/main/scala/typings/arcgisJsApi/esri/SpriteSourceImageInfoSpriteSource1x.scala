package typings.arcgisJsApi.esri

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSourceImageInfoSpriteSource1x extends StObject {
  
  /**
  		 * Image containing sprite data for non high-DPI devices.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
  		 */
  var image: HTMLImageElement | HTMLCanvasElement | Any | ImageData | ImageObject
  
  /**
  		 * The JSON representation of an index file containing a description of each image in the sprite for non high-DPI devices.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
  		 */
  var json: SpriteInfo
}
object SpriteSourceImageInfoSpriteSource1x {
  
  inline def apply(image: HTMLImageElement | HTMLCanvasElement | Any | ImageData | ImageObject, json: SpriteInfo): SpriteSourceImageInfoSpriteSource1x = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSourceImageInfoSpriteSource1x]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpriteSourceImageInfoSpriteSource1x] (val x: Self) extends AnyVal {
    
    inline def setImage(value: HTMLImageElement | HTMLCanvasElement | Any | ImageData | ImageObject): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setJson(value: SpriteInfo): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
  }
}
