package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasemapGalleryProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#activeBasemap)
  		 */
  var activeBasemap: js.UndefOr[BasemapProperties] = js.undefined
  
  /**
  		 * When `true`, sets the widget to a disabled state so the user cannot interact with it.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#disabled)
  		 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates the heading level to use for the message "No basemaps available" when no basemaps are available in the BasemapGallery.
  		 *
  		 * @default 2
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#headingLevel)
  		 */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/BasemapGallery#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * The source for basemaps that the widget will display.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#source)
  		 */
  var source: js.UndefOr[
    LocalBasemapsSourceProperties | PortalBasemapsSourceProperties | CollectionProperties[BasemapProperties] | js.Array[BasemapProperties] | PortalProperties
  ] = js.undefined
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#viewModel)
  		 */
  var viewModel: js.UndefOr[BasemapGalleryViewModelProperties] = js.undefined
}
object BasemapGalleryProperties {
  
  inline def apply(): BasemapGalleryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapGalleryProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasemapGalleryProperties] (val x: Self) extends AnyVal {
    
    inline def setActiveBasemap(value: BasemapProperties): Self = StObject.set(x, "activeBasemap", value.asInstanceOf[js.Any])
    
    inline def setActiveBasemapUndefined: Self = StObject.set(x, "activeBasemap", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setSource(
      value: LocalBasemapsSourceProperties | PortalBasemapsSourceProperties | CollectionProperties[BasemapProperties] | js.Array[BasemapProperties] | PortalProperties
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: BasemapProperties*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: BasemapGalleryViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
