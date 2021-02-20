package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapGalleryViewModelProperties extends StObject {
  
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#activeBasemap)
    */
  var activeBasemap: js.UndefOr[BasemapProperties] = js.native
  
  /**
    * A collection of [BasemapGalleryItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html)s representing basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#items)
    */
  var items: js.UndefOr[CollectionProperties[BasemapGalleryItemProperties]] = js.native
  
  /**
    * The source for basemaps that the widget will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#source)
    */
  var source: js.UndefOr[LocalBasemapsSourceProperties | PortalBasemapsSourceProperties] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object BasemapGalleryViewModelProperties {
  
  @scala.inline
  def apply(): BasemapGalleryViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapGalleryViewModelProperties]
  }
  
  @scala.inline
  implicit class BasemapGalleryViewModelPropertiesMutableBuilder[Self <: BasemapGalleryViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveBasemap(value: BasemapProperties): Self = StObject.set(x, "activeBasemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveBasemapUndefined: Self = StObject.set(x, "activeBasemap", js.undefined)
    
    @scala.inline
    def setItems(value: CollectionProperties[BasemapGalleryItemProperties]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BasemapGalleryItemProperties*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: LocalBasemapsSourceProperties | PortalBasemapsSourceProperties): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
