package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksVisibleElements extends StObject {
  
  /**
    * Indicates whether to button to add a new bookmark displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#VisibleElements)
    */
  var addBookmark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the thumbnail associated with the bookmark displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#VisibleElements)
    */
  var thumbnail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.22_ Indicates whether the time (`h:m:s`) is displayed alongside the date if the bookmark has a [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#timeExtent) defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#VisibleElements)
    */
  var time: js.UndefOr[Boolean] = js.undefined
}
object BookmarksVisibleElements {
  
  inline def apply(): BookmarksVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksVisibleElements]
  }
  
  extension [Self <: BookmarksVisibleElements](x: Self) {
    
    inline def setAddBookmark(value: Boolean): Self = StObject.set(x, "addBookmark", value.asInstanceOf[js.Any])
    
    inline def setAddBookmarkUndefined: Self = StObject.set(x, "addBookmark", js.undefined)
    
    inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
