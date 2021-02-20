package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapGalleryItemProperties extends StObject {
  
  /**
    * The item's associated basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#basemap)
    */
  var basemap: js.UndefOr[BasemapProperties] = js.native
  
  /**
    * The view associated with this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object BasemapGalleryItemProperties {
  
  @scala.inline
  def apply(): BasemapGalleryItemProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapGalleryItemProperties]
  }
  
  @scala.inline
  implicit class BasemapGalleryItemPropertiesMutableBuilder[Self <: BasemapGalleryItemProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemap(value: BasemapProperties): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
