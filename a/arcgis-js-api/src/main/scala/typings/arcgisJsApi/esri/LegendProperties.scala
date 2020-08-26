package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendProperties extends WidgetProperties {
  /**
    * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend. The legend widget watches this property to hide or display the layer's legend when an [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) is removed from or added to this collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#activeLayerInfos)
    */
  var activeLayerInfos: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.native
  /**
    * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend. If you set this property to `true` and specify [layerInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos), the basemap layers you want included in the legend must also be specified in `layerInfos`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#basemapLegendVisible)
    *
    * @default false
    */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * Specifies a subset of the layers to display in the legend. This includes any [basemap layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#basemapLegendVisible) you want to be visible in the legend. If this property is not set, all layers in the map will display in the legend, including basemap layers if [basemapLegendVisible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#basemapLegendVisible) is `true`. Objects in this array are defined with the properties listed below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LegendLayerInfos]] = js.native
  /**
    * Determines whether to respect the properties of the layers in the map that control the legend's visibility (`minScale`, `maxScale`, `legendEnabled`). By default, a layer's legend elements **will not render** in the legend given the following conditions:
    *   * The layer's [legendEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#legendEnabled) property is set to `false`.
    *   * If the view's scale is outside the visibility range defined by the layer's [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale) properties.
    *
    *
    * When the `respectLayerVisibility` property of the legend is set to `false`, the legend elements for each layer in the map will always display, thus disregarding the `minScale`, `maxScale`, and `legendEnabled` properties for each layer in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#respectLayerVisibility)
    *
    * @default true
    */
  var respectLayerVisibility: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the style of the legend. The style determines the legend's layout and behavior. You can either specify a string or an object to indicate the style. The known string values are the same values listed in the table within the `type` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    *
    * @default classic
    */
  var style: js.UndefOr[String | LegendStyle] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [LegendViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html) class to access all properties and methods on the widget.
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

