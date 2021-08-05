package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksBookmarkSelectEvent extends StObject {
  
  var bookmark: Bookmark
}
object BookmarksBookmarkSelectEvent {
  
  inline def apply(bookmark: Bookmark): BookmarksBookmarkSelectEvent = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksBookmarkSelectEvent]
  }
  
  extension [Self <: BookmarksBookmarkSelectEvent](x: Self) {
    
    inline def setBookmark(value: Bookmark): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
  }
}
