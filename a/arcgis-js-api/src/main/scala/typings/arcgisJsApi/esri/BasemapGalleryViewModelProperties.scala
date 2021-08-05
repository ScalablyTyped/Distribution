package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasemapGalleryViewModelProperties extends StObject {
  
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#activeBasemap)
    */
  var activeBasemap: js.UndefOr[BasemapProperties] = js.undefined
  
  /**
    * A collection of [BasemapGalleryItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html)s representing basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#items)
    */
  var items: js.UndefOr[CollectionProperties[BasemapGalleryItemProperties]] = js.undefined
  
  /**
    * The source for basemaps that the widget will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#source)
    */
  var source: js.UndefOr[LocalBasemapsSourceProperties | PortalBasemapsSourceProperties] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object BasemapGalleryViewModelProperties {
  
  inline def apply(): BasemapGalleryViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapGalleryViewModelProperties]
  }
  
  extension [Self <: BasemapGalleryViewModelProperties](x: Self) {
    
    inline def setActiveBasemap(value: BasemapProperties): Self = StObject.set(x, "activeBasemap", value.asInstanceOf[js.Any])
    
    inline def setActiveBasemapUndefined: Self = StObject.set(x, "activeBasemap", js.undefined)
    
    inline def setItems(value: CollectionProperties[BasemapGalleryItemProperties]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BasemapGalleryItemProperties*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setSource(value: LocalBasemapsSourceProperties | PortalBasemapsSourceProperties): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
