package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendProperties extends WidgetProperties {
  
  /**
    * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#activeLayerInfos)
    */
  var activeLayerInfos: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.native
  
  /**
    * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#basemapLegendVisible)
    */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * Specifies a subset of the layers to display in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LegendLayerInfos]] = js.native
  
  /**
    * Determines whether to respect the properties of the layers in the map that control the legend's visibility (`minScale`, `maxScale`, `legendEnabled`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#respectLayerVisibility)
    */
  var respectLayerVisibility: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the style of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var style: js.UndefOr[String | LegendStyle] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#viewModel)
    */
  var viewModel: js.UndefOr[LegendViewModelProperties] = js.native
}
object LegendProperties {
  
  @scala.inline
  def apply(): LegendProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendProperties]
  }
  
  @scala.inline
  implicit class LegendPropertiesMutableBuilder[Self <: LegendProperties] (val x: Self) extends AnyVal {
    
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
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setLayerInfos(value: js.Array[LegendLayerInfos]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    @scala.inline
    def setLayerInfosVarargs(value: LegendLayerInfos*): Self = StObject.set(x, "layerInfos", js.Array(value :_*))
    
    @scala.inline
    def setRespectLayerVisibility(value: Boolean): Self = StObject.set(x, "respectLayerVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespectLayerVisibilityUndefined: Self = StObject.set(x, "respectLayerVisibility", js.undefined)
    
    @scala.inline
    def setStyle(value: String | LegendStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: LegendViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
