package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendViewModelProperties extends js.Object {
  /**
    * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend. Use this property to hide or display the layer's symbols in the legend when an [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) is removed from or added to this collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#activeLayerInfos)
    */
  var activeLayerInfos: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.undefined
  /**
    * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#basemapLegendVisible)
    *
    * @default filterBasemaps
    */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies a subset of the layers in the map to display in the legend. If this property is not set, all operational layers in the map will display in the legend. This property can be used to control layer display order in the legend. Objects in this array are defined with the properties listed below.
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
  def apply(
    activeLayerInfos: CollectionProperties[ActiveLayerInfoProperties] = null,
    basemapLegendVisible: js.UndefOr[Boolean] = js.undefined,
    layerInfos: js.Array[LegendViewModelLayerInfos] = null,
    view: MapViewProperties | SceneViewProperties = null
  ): LegendViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (activeLayerInfos != null) __obj.updateDynamic("activeLayerInfos")(activeLayerInfos.asInstanceOf[js.Any])
    if (!js.isUndefined(basemapLegendVisible)) __obj.updateDynamic("basemapLegendVisible")(basemapLegendVisible)
    if (layerInfos != null) __obj.updateDynamic("layerInfos")(layerInfos)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendViewModelProperties]
  }
}

