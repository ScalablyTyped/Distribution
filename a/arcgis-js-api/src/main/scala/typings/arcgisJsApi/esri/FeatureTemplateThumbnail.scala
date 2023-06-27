package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.image
import typings.arcgisJsApi.arcgisJsApiStrings.jpeg
import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTemplateThumbnail extends StObject {
  
  /**
  		 * The MIME type of the image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
  		 */
  var contentType: image | png | jpg | jpeg
  
  /**
  		 * The height of the thumbnail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
  		 */
  var height: Double
  
  /**
  		 * The [base64EncodedImageData](https://developer.mozilla.org/en-US/docs/Web/API/WindowBase64/Base64_encoding_and_decoding) presenting the thumbnail image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
  		 */
  var imageData: String
  
  /**
  		 * The width of the thumbnail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
  		 */
  var width: Double
}
object FeatureTemplateThumbnail {
  
  inline def apply(contentType: image | png | jpg | jpeg, height: Double, imageData: String, width: Double): FeatureTemplateThumbnail = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageData = imageData.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplateThumbnail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureTemplateThumbnail] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: image | png | jpg | jpeg): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageData(value: String): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
