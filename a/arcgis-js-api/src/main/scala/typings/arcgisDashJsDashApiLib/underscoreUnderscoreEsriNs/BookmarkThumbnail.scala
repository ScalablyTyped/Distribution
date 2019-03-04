package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkThumbnail
  extends stdLib.Object {
  /**
    * URL to a thumbnail to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object BookmarkThumbnail {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    url: java.lang.String = null
  ): BookmarkThumbnail = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BookmarkThumbnail]
  }
}

