package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Bookmark
import typings.arcgisJsApi.esri.BookmarkProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebmapBookmarkMod {
  
  @JSImport("esri/webmap/Bookmark", JSImport.Namespace)
  @js.native
  /**
    * A bookmark is a saved map extent that allows end users to quickly navigate to a particular area of interest using the [Bookmarks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)
    */
  open class ^ ()
    extends StObject
       with Bookmark {
    def this(properties: BookmarkProperties) = this()
  }
}
