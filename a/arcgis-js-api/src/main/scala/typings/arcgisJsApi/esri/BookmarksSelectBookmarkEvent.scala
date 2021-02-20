package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BookmarksSelectBookmarkEvent extends StObject {
  
  var bookmark: Bookmark = js.native
}
object BookmarksSelectBookmarkEvent {
  
  @scala.inline
  def apply(bookmark: Bookmark): BookmarksSelectBookmarkEvent = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksSelectBookmarkEvent]
  }
  
  @scala.inline
  implicit class BookmarksSelectBookmarkEventMutableBuilder[Self <: BookmarksSelectBookmarkEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmark(value: Bookmark): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
  }
}
