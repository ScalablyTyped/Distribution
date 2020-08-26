package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendViewModelProperties extends js.Object {
  /**
    * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend. Use this property to hide or display the layer's symbols in the legend when an [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) is removed from or added to this collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#activeLayerInfos)
    */
  var activeLayerInfos: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.native
  /**
    * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#basemapLegendVisible)
    *
    * @default filterBasemaps
    */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a subset of the layers in the map to display in the legend. If this property is not set, all operational layers in the map will display in the legend. This property can be used to control layer display order in the legend. Objects in this array are defined with the properties listed below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LegendViewModelLayerInfos]] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object LegendViewModelProperties {
  @scala.inline
  def apply(): LegendViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendViewModelProperties]
  }
  @scala.inline
  implicit class LegendViewModelPropertiesOps[Self <: LegendViewModelProperties] (val x: Self) extends AnyVal {
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
    def setLayerInfosVarargs(value: LegendViewModelLayerInfos*): Self = this.set("layerInfos", js.Array(value :_*))
    @scala.inline
    def setLayerInfos(value: js.Array[LegendViewModelLayerInfos]): Self = this.set("layerInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerInfos: Self = this.set("layerInfos", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

