package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarksSelectBookmarkEvent extends js.Object {
  var bookmark: Bookmark = js.native
}

object BookmarksSelectBookmarkEvent {
  @scala.inline
  def apply(bookmark: Bookmark): BookmarksSelectBookmarkEvent = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksSelectBookmarkEvent]
  }
  @scala.inline
  implicit class BookmarksSelectBookmarkEventOps[Self <: BookmarksSelectBookmarkEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBookmark(value: Bookmark): Self = this.set("bookmark", value.asInstanceOf[js.Any])
  }
  
}

