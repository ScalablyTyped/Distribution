package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksSelectBookmarkEvent extends StObject {
  
  var bookmark: Bookmark
}
object BookmarksSelectBookmarkEvent {
  
  inline def apply(bookmark: Bookmark): BookmarksSelectBookmarkEvent = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksSelectBookmarkEvent]
  }
  
  extension [Self <: BookmarksSelectBookmarkEvent](x: Self) {
    
    inline def setBookmark(value: Bookmark): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
  }
}
