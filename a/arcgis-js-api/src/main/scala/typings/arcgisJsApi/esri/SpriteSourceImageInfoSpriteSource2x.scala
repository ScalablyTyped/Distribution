package typings.arcgisJsApi.esri

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSourceImageInfoSpriteSource2x extends StObject {
  
  /**
    * Image containing sprite data for high-DPI devices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
    */
  var image: HTMLImageElement | HTMLCanvasElement | Any | ImageData | ImageObject
  
  /**
    * The JSON representation of an index file containing a description of each image in the sprite for high-DPI devices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#SpriteSourceImageInfo)
    */
  var json: SpriteInfo
}
object SpriteSourceImageInfoSpriteSource2x {
  
  inline def apply(image: HTMLImageElement | HTMLCanvasElement | Any | ImageData | ImageObject, json: SpriteInfo): SpriteSourceImageInfoSpriteSource2x = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSourceImageInfoSpriteSource2x]
  }
  
  extension [Self <: SpriteSourceImageInfoSpriteSource2x](x: Self) {
    
    inline def setImage(value: HTMLImageElement | HTMLCanvasElement | Any | ImageData | ImageObject): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setJson(value: SpriteInfo): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
  }
}
