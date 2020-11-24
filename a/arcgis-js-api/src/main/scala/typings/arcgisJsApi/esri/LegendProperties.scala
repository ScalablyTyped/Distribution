package typings.arcgisJsApi.esri

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
  implicit class LegendPropertiesOps[Self <: LegendProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveLayerInfosVarargs(value: ActiveLayerInfoProperties*): Self = this.set("activeLayerInfos", js.Array(value :_*))
    
    @scala.inline
    def setActiveLayerInfos(value: CollectionProperties[ActiveLayerInfoProperties]): Self = this.set("activeLayerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveLayerInfos: Self = this.set("activeLayerInfos", js.undefined)
    
    @scala.inline
    def setBasemapLegendVisible(value: Boolean): Self = this.set("basemapLegendVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasemapLegendVisible: Self = this.set("basemapLegendVisible", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setLayerInfosVarargs(value: LegendLayerInfos*): Self = this.set("layerInfos", js.Array(value :_*))
    
    @scala.inline
    def setLayerInfos(value: js.Array[LegendLayerInfos]): Self = this.set("layerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerInfos: Self = this.set("layerInfos", js.undefined)
    
    @scala.inline
    def setRespectLayerVisibility(value: Boolean): Self = this.set("respectLayerVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespectLayerVisibility: Self = this.set("respectLayerVisibility", js.undefined)
    
    @scala.inline
    def setStyle(value: String | LegendStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: LegendViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
