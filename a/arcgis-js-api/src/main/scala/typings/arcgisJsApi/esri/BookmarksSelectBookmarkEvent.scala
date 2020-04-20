package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarksSelectBookmarkEvent extends js.Object {
  var bookmark: Bookmark
}

object BookmarksSelectBookmarkEvent {
  @scala.inline
  def apply(bookmark: Bookmark): BookmarksSelectBookmarkEvent = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksSelectBookmarkEvent]
  }
}

