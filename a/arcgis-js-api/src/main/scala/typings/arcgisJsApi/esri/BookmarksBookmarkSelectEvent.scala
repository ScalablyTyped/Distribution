package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BookmarksBookmarkSelectEvent extends StObject {
  
  var bookmark: Bookmark = js.native
}
object BookmarksBookmarkSelectEvent {
  
  @scala.inline
  def apply(bookmark: Bookmark): BookmarksBookmarkSelectEvent = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksBookmarkSelectEvent]
  }
  
  @scala.inline
  implicit class BookmarksBookmarkSelectEventMutableBuilder[Self <: BookmarksBookmarkSelectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmark(value: Bookmark): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
  }
}
