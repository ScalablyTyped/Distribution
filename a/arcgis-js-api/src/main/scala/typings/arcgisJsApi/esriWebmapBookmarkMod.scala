package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Bookmark
import typings.arcgisJsApi.esri.BookmarkConstructor
import typings.arcgisJsApi.esri.BookmarkProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebmapBookmarkMod extends Shortcut {
  
  @JSImport("esri/webmap/Bookmark", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BookmarkConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webmap/Bookmark", JSImport.Namespace)
  @js.native
  /**
    * A bookmark is a saved map extent that allows end users to quickly navigate to a particular area of interest using the [Bookmarks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)
    */
  open class Class ()
    extends StObject
       with Bookmark {
    def this(properties: BookmarkProperties) = this()
  }
  
  type _To = js.Object & BookmarkConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebmapBookmarkMod.foo` */
  override def _to: js.Object & BookmarkConstructor = ^
}
