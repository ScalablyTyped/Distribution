package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplateThumbnail extends Object {
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
  @scala.inline
  def apply(
    constructor: js.Function,
    contentType: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    height: Double,
    imageData: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): FeatureTemplateThumbnail = {
    val __obj = js.Dynamic.literal(constructor = constructor, contentType = contentType, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height, imageData = imageData, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width)
  
    __obj.asInstanceOf[FeatureTemplateThumbnail]
  }
}

