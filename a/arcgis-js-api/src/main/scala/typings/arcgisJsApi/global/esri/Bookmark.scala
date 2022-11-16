package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BookmarkProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Bookmark")
@js.native
/**
  * A bookmark is a saved map extent that allows end users to quickly navigate to a particular area of interest using the [Bookmarks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)
  */
open class Bookmark ()
  extends StObject
     with typings.arcgisJsApi.esri.Bookmark {
  def this(properties: BookmarkProperties) = this()
}
