package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksVisibleElements
  extends StObject
     with Object {
  
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
}
object BookmarksVisibleElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BookmarksVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BookmarksVisibleElements]
  }
  
  extension [Self <: BookmarksVisibleElements](x: Self) {
    
    inline def setAddBookmark(value: Boolean): Self = StObject.set(x, "addBookmark", value.asInstanceOf[js.Any])
    
    inline def setAddBookmarkUndefined: Self = StObject.set(x, "addBookmark", js.undefined)
    
    inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
