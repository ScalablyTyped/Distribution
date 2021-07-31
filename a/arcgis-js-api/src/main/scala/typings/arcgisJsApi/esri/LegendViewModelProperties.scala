package typings.arcgisJsApi.esri

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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#basemapLegendVisible)
    */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a subset of the layers in the map to display in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LegendViewModelLayerInfos]] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object LegendViewModelProperties {
  
  @scala.inline
  def apply(): LegendViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendViewModelProperties]
  }
  
  @scala.inline
  implicit class LegendViewModelPropertiesMutableBuilder[Self <: LegendViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveLayerInfos(value: CollectionProperties[ActiveLayerInfoProperties]): Self = StObject.set(x, "activeLayerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveLayerInfosUndefined: Self = StObject.set(x, "activeLayerInfos", js.undefined)
    
    @scala.inline
    def setActiveLayerInfosVarargs(value: ActiveLayerInfoProperties*): Self = StObject.set(x, "activeLayerInfos", js.Array(value :_*))
    
    @scala.inline
    def setBasemapLegendVisible(value: Boolean): Self = StObject.set(x, "basemapLegendVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapLegendVisibleUndefined: Self = StObject.set(x, "basemapLegendVisible", js.undefined)
    
    @scala.inline
    def setLayerInfos(value: js.Array[LegendViewModelLayerInfos]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    @scala.inline
    def setLayerInfosVarargs(value: LegendViewModelLayerInfos*): Self = StObject.set(x, "layerInfos", js.Array(value :_*))
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
