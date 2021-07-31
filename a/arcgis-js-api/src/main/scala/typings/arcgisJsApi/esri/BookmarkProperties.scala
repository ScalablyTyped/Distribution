package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarkProperties extends StObject {
  
  /**
    * The extent of the specified bookmark item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
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
    * The viewpoint of the bookmark item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
}
object BookmarkProperties {
  
  @scala.inline
  def apply(): BookmarkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarkProperties]
  }
  
  @scala.inline
  implicit class BookmarkPropertiesMutableBuilder[Self <: BookmarkProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setThumbnail(value: BookmarkThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
  }
}
