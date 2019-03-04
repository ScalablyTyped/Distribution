package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemUpdateThumbnailParams
  extends stdLib.Object {
  /**
    * A URL, Data URI, Blob, or File. The accepted formats are `GIF`, `JPG`, and `PNG`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
    */
  var thumbnail: stdLib.Blob | java.lang.String
}

object PortalItemUpdateThumbnailParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    thumbnail: stdLib.Blob | java.lang.String
  ): PortalItemUpdateThumbnailParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, thumbnail = thumbnail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PortalItemUpdateThumbnailParams]
  }
}

