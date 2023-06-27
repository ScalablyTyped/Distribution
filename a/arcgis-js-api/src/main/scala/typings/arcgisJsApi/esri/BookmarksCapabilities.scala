package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksCapabilities extends StObject {
  
  /**
  		 * Indicates whether the time capability is enabled in the Bookmarks widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarksCapabilities)
  		 */
  var time: js.UndefOr[Boolean] = js.undefined
}
object BookmarksCapabilities {
  
  inline def apply(): BookmarksCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookmarksCapabilities] (val x: Self) extends AnyVal {
    
    inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
