package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
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
  var source: js.UndefOr[
    LocalBasemapsSourceProperties | PortalBasemapsSourceProperties | CollectionProperties[BasemapProperties] | js.Array[BasemapProperties] | PortalProperties
  ] = js.undefined
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object BasemapGalleryViewModelProperties {
  
  inline def apply(): BasemapGalleryViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapGalleryViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasemapGalleryViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setActiveBasemap(value: BasemapProperties): Self = StObject.set(x, "activeBasemap", value.asInstanceOf[js.Any])
    
    inline def setActiveBasemapUndefined: Self = StObject.set(x, "activeBasemap", js.undefined)
    
    inline def setItems(value: CollectionProperties[BasemapGalleryItemProperties]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BasemapGalleryItemProperties*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSource(
      value: LocalBasemapsSourceProperties | PortalBasemapsSourceProperties | CollectionProperties[BasemapProperties] | js.Array[BasemapProperties] | PortalProperties
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: BasemapProperties*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
