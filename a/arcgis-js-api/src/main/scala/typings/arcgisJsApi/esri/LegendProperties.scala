package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#activeLayerInfos)
    */
  var activeLayerInfos: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.undefined
  
  /**
    * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#basemapLegendVisible)
    */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the heading level to use for the legend title.
    *
    * @default 3
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#headingLevel)
    */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * When `true`, layers will only be shown in the legend if they are visible in the view's extent.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#hideLayersNotInCurrentView)
    */
  var hideLayersNotInCurrentView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a subset of the layers to display in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LegendLayerInfos]] = js.undefined
  
  /**
    * Determines whether to respect the properties of the layers in the map that control the legend's visibility (`minScale`, `maxScale`, `legendEnabled`).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#respectLayerVisibility)
    */
  var respectLayerVisibility: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the style of the legend.
    *
    * @default classic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var style: js.UndefOr[String | LegendStyle] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#viewModel)
    */
  var viewModel: js.UndefOr[LegendViewModelProperties] = js.undefined
}
object LegendProperties {
  
  inline def apply(): LegendProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendProperties]
  }
  
  extension [Self <: LegendProperties](x: Self) {
    
    inline def setActiveLayerInfos(value: CollectionProperties[ActiveLayerInfoProperties]): Self = StObject.set(x, "activeLayerInfos", value.asInstanceOf[js.Any])
    
    inline def setActiveLayerInfosUndefined: Self = StObject.set(x, "activeLayerInfos", js.undefined)
    
    inline def setActiveLayerInfosVarargs(value: ActiveLayerInfoProperties*): Self = StObject.set(x, "activeLayerInfos", js.Array(value*))
    
    inline def setBasemapLegendVisible(value: Boolean): Self = StObject.set(x, "basemapLegendVisible", value.asInstanceOf[js.Any])
    
    inline def setBasemapLegendVisibleUndefined: Self = StObject.set(x, "basemapLegendVisible", js.undefined)
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setHideLayersNotInCurrentView(value: Boolean): Self = StObject.set(x, "hideLayersNotInCurrentView", value.asInstanceOf[js.Any])
    
    inline def setHideLayersNotInCurrentViewUndefined: Self = StObject.set(x, "hideLayersNotInCurrentView", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setLayerInfos(value: js.Array[LegendLayerInfos]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    inline def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    inline def setLayerInfosVarargs(value: LegendLayerInfos*): Self = StObject.set(x, "layerInfos", js.Array(value*))
    
    inline def setRespectLayerVisibility(value: Boolean): Self = StObject.set(x, "respectLayerVisibility", value.asInstanceOf[js.Any])
    
    inline def setRespectLayerVisibilityUndefined: Self = StObject.set(x, "respectLayerVisibility", js.undefined)
    
    inline def setStyle(value: String | LegendStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: LegendViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
