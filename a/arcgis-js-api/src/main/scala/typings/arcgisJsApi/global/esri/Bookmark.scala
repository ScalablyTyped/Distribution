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
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Bookmark {
  
  @JSGlobal("__esri.Bookmark")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Bookmark = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Bookmark]
}
