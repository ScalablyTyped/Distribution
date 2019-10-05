package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`hide-children`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hide
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisDashJsDashApi.__esri.ArcGISCachedServiceProperties because var conflicts: copyright. Inlined tileInfo
- typings.arcgisDashJsDashApi.__esri.ArcGISMapServiceProperties because var conflicts: fullExtent. Inlined copyright, legendEnabled */ trait TileLayerProperties
  extends LayerProperties
     with RefreshableLayerProperties
     with ScaleRangeLayerProperties
     with PortalLayerProperties {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Resampling is enabled by default in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This means that tile images are resampled at a lower level of detail and displayed at levels where tiles may not be available. Setting this property to `true` disables this behavior. Instead, if a tile is not available, a transparent image is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#resampling)
    *
    * @default true
    */
  var resampling: js.UndefOr[Boolean] = js.undefined
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
  /**
    * An array of tile servers used for changing map tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#tileServers)
    */
  var tileServers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The URL of the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}

object TileLayerProperties {
  @scala.inline
  def apply(
    copyright: String = null,
    fullExtent: ExtentProperties = null,
    id: String = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    listMode: show | hide | `hide-children` = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    opacity: Int | Double = null,
    portalItem: PortalItemProperties = null,
    refreshInterval: Int | Double = null,
    resampling: js.UndefOr[Boolean] = js.undefined,
    tileInfo: TileInfoProperties = null,
    tileServers: js.Array[String] = null,
    title: String = null,
    url: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TileLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(resampling)) __obj.updateDynamic("resampling")(resampling)
    if (tileInfo != null) __obj.updateDynamic("tileInfo")(tileInfo)
    if (tileServers != null) __obj.updateDynamic("tileServers")(tileServers)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TileLayerProperties]
  }
}

