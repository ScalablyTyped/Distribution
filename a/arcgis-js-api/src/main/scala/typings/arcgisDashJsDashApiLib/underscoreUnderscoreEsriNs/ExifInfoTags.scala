package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExifInfoTags
  extends stdLib.Object {
  /**
    * The tag description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo)
    */
  var description: java.lang.String
  /**
    * The tag name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo)
    */
  var name: java.lang.String
  /**
    * The value of the tag.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo)
    */
  var value: js.Any
}

object ExifInfoTags {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    value: js.Any
  ): ExifInfoTags = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value)
  
    __obj.asInstanceOf[ExifInfoTags]
  }
}

