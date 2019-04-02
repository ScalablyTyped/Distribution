package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExifInfo
  extends stdLib.Object {
  /**
    * The file name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of tag objects containing the following properties:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo)
    */
  var tags: js.UndefOr[js.Array[ExifInfoTags]] = js.undefined
}

object ExifInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String = null,
    tags: js.Array[ExifInfoTags] = null
  ): ExifInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (name != null) __obj.updateDynamic("name")(name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ExifInfo]
  }
}

