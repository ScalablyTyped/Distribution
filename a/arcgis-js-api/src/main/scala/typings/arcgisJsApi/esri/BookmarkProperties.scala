package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkProperties extends js.Object {
  /**
    * The extent of the specified bookmark item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * The name of the bookmark item. Used as a label in the [Bookmarks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The URL for a thumbnail image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail)
    */
  var thumbnail: js.UndefOr[BookmarkThumbnail] = js.undefined
}

object BookmarkProperties {
  @scala.inline
  def apply(extent: ExtentProperties = null, name: String = null, thumbnail: BookmarkThumbnail = null): BookmarkProperties = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkProperties]
  }
}

