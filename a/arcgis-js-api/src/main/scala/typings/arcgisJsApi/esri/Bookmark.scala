package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookmark
  extends StObject
     with Accessor
     with Identifiable {
  
  /**
    * The name of the bookmark item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#name)
    */
  var name: String = js.native
  
  /**
    * The URL for a thumbnail image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail)
    */
  var thumbnail: BookmarkThumbnail = js.native
  
  /**
    * The time extent of the bookmark item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
  
  /**
    * The viewpoint of the bookmark item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
}
