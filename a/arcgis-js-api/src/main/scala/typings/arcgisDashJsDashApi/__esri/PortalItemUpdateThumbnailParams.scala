package typings.arcgisDashJsDashApi.__esri

import typings.std.Blob
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemUpdateThumbnailParams extends Object {
  /**
    * A URL, Data URI, Blob, or File. The accepted formats are `GIF`, `JPG`, and `PNG`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
    */
  var thumbnail: Blob | String
}

object PortalItemUpdateThumbnailParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    thumbnail: Blob | String
  ): PortalItemUpdateThumbnailParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), thumbnail = thumbnail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PortalItemUpdateThumbnailParams]
  }
}

