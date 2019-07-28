package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookmark extends Accessor {
  /**
    * The extent of the specified bookmark item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#extent)
    */
  var extent: Extent = js.native
  /**
    * The name of the bookmark item. Used as a label in the [Bookmarks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#name)
    */
  var name: String = js.native
  /**
    * The URL for a thumbnail image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail)
    */
  var thumbnail: BookmarkThumbnail = js.native
}

@JSGlobal("__esri.Bookmark")
@js.native
class BookmarkCls () extends Bookmark {
  def this(properties: BookmarkProperties) = this()
}

