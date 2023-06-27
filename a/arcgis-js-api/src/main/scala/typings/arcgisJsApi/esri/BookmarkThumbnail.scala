package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarkThumbnail extends StObject {
  
  /**
  		 * URL to a thumbnail to display.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail)
  		 */
  var url: js.UndefOr[String] = js.undefined
}
object BookmarkThumbnail {
  
  inline def apply(): BookmarkThumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarkThumbnail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookmarkThumbnail] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
