package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendViewModelProperties extends StObject {
  
  /**
  		 * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#activeLayerInfos)
  		 */
  var activeLayerInfos: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.undefined
  
  /**
  		 * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend.
  		 *
  		 * @default filterBasemaps
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#basemapLegendVisible)
  		 */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When `true`, layers will only be shown in the legend if they are visible in the view's extent.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#hideLayersNotInCurrentView)
  		 */
  var hideLayersNotInCurrentView: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies a subset of the layers in the map to display in the legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#layerInfos)
  		 */
  var layerInfos: js.UndefOr[js.Array[LegendViewModelLayerInfos]] = js.undefined
  
  /**
  		 * Determines whether to respect the properties of the layers in the map that control the legend's visibility (`minScale`, `maxScale`, `legendEnabled`).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#respectLayerVisibility)
  		 */
  var respectLayerVisibility: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object LegendViewModelProperties {
  
  inline def apply(): LegendViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setActiveLayerInfos(value: CollectionProperties[ActiveLayerInfoProperties]): Self = StObject.set(x, "activeLayerInfos", value.asInstanceOf[js.Any])
    
    inline def setActiveLayerInfosUndefined: Self = StObject.set(x, "activeLayerInfos", js.undefined)
    
    inline def setActiveLayerInfosVarargs(value: ActiveLayerInfoProperties*): Self = StObject.set(x, "activeLayerInfos", js.Array(value*))
    
    inline def setBasemapLegendVisible(value: Boolean): Self = StObject.set(x, "basemapLegendVisible", value.asInstanceOf[js.Any])
    
    inline def setBasemapLegendVisibleUndefined: Self = StObject.set(x, "basemapLegendVisible", js.undefined)
    
    inline def setHideLayersNotInCurrentView(value: Boolean): Self = StObject.set(x, "hideLayersNotInCurrentView", value.asInstanceOf[js.Any])
    
    inline def setHideLayersNotInCurrentViewUndefined: Self = StObject.set(x, "hideLayersNotInCurrentView", js.undefined)
    
    inline def setLayerInfos(value: js.Array[LegendViewModelLayerInfos]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    inline def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    inline def setLayerInfosVarargs(value: LegendViewModelLayerInfos*): Self = StObject.set(x, "layerInfos", js.Array(value*))
    
    inline def setRespectLayerVisibility(value: Boolean): Self = StObject.set(x, "respectLayerVisibility", value.asInstanceOf[js.Any])
    
    inline def setRespectLayerVisibilityUndefined: Self = StObject.set(x, "respectLayerVisibility", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
