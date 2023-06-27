package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarkProperties extends StObject {
  
  /**
  		 * The name of the bookmark item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * The URL for a thumbnail image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail)
  		 */
  var thumbnail: js.UndefOr[BookmarkThumbnail] = js.undefined
  
  /**
  		 * The time extent of the bookmark item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#timeExtent)
  		 */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
  		 * The viewpoint of the bookmark item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint)
  		 */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
}
object BookmarkProperties {
  
  inline def apply(): BookmarkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarkProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookmarkProperties] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setThumbnail(value: BookmarkThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
  }
}
