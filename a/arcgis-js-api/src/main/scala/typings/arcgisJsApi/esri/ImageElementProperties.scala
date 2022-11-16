package typings.arcgisJsApi.esri

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageElementProperties
  extends StObject
     with MediaElementBaseProperties {
  
  /**
    * The image element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#image)
    */
  var image: js.UndefOr[String | HTMLImageElement | HTMLCanvasElement | ImageData] = js.undefined
}
object ImageElementProperties {
  
  inline def apply(): ImageElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageElementProperties]
  }
  
  extension [Self <: ImageElementProperties](x: Self) {
    
    inline def setImage(value: String | HTMLImageElement | HTMLCanvasElement | ImageData): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
