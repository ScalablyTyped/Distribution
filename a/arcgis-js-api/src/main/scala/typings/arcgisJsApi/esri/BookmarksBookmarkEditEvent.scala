package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BookmarksBookmarkEditEvent extends js.Object {
  
  var bookmark: Bookmark = js.native
}
object BookmarksBookmarkEditEvent {
  
  @scala.inline
  def apply(bookmark: Bookmark): BookmarksBookmarkEditEvent = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksBookmarkEditEvent]
  }
  
  @scala.inline
  implicit class BookmarksBookmarkEditEventOps[Self <: BookmarksBookmarkEditEvent] (val x: Self) extends AnyVal {
    
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
