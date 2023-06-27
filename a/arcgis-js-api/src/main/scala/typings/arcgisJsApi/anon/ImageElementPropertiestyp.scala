package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.image
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ImageElementProperties & {  type :'image'} */
trait ImageElementPropertiestyp extends StObject {
  
  /**
  		 * The geographic location of the image or video element to be placed on the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
  		 */
  var georeference: js.UndefOr[
    ExtentAndRotationGeorefer | CornersGeoreferenceProper | ControlPointsGeoreference
  ] = js.undefined
  
  /**
  		 * The image element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#image)
  		 */
  var image: js.UndefOr[String | HTMLImageElement | HTMLCanvasElement | ImageData] = js.undefined
  
  /**
  		 * The opacity of the element.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
  
  var `type`: image
}
object ImageElementPropertiestyp {
  
  inline def apply(): ImageElementPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageElementPropertiestyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageElementPropertiestyp] (val x: Self) extends AnyVal {
    
    inline def setGeoreference(value: ExtentAndRotationGeorefer | CornersGeoreferenceProper | ControlPointsGeoreference): Self = StObject.set(x, "georeference", value.asInstanceOf[js.Any])
    
    inline def setGeoreferenceUndefined: Self = StObject.set(x, "georeference", js.undefined)
    
    inline def setImage(value: String | HTMLImageElement | HTMLCanvasElement | ImageData): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
