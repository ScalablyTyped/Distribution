package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplateThumbnail
  extends stdLib.Object {
  /**
    * The MIME type of the image.  **Possible Values:** image | png | jpg | jpeg
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var contentType: js.Any
  /**
    * The height of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var height: scala.Double
  /**
    * The [base64EncodedImageData](https://developer.mozilla.org/en-US/docs/Web/API/WindowBase64/Base64_encoding_and_decoding) presenting the thumbnail image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var imageData: java.lang.String
  /**
    * The width of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var width: scala.Double
}

object FeatureTemplateThumbnail {
  @scala.inline
  def apply(
    constructor: js.Function,
    contentType: js.Any,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    height: scala.Double,
    imageData: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    width: scala.Double
  ): FeatureTemplateThumbnail = {
    val __obj = js.Dynamic.literal(constructor = constructor, contentType = contentType, hasOwnProperty = hasOwnProperty, height = height, imageData = imageData, propertyIsEnumerable = propertyIsEnumerable, width = width)
  
    __obj.asInstanceOf[FeatureTemplateThumbnail]
  }
}

