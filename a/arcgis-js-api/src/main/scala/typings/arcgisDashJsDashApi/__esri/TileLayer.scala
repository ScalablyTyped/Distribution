package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.tile
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisDashJsDashApi.__esri.ArcGISCachedService because var conflicts: copyright. Inlined tileInfo
- typings.arcgisDashJsDashApi.__esri.ArcGISMapService because var conflicts: fullExtent. Inlined capabilities, copyright, legendEnabled, spatialReference, version */ @js.native
trait TileLayer
  extends Layer
     with SublayersOwner
     with RefreshableLayer
     with ScaleRangeLayer
     with PortalLayer {
  /**
    * A flat [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of all the [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#sublayers) in the TileLayer including the sublayers of its sublayers. All sublayers are referenced in the order in which they are drawn in the view (bottom to top).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#allSublayers)
    */
  val allSublayers: Collection[Sublayer] = js.native
  /**
    * The URL that points to the location of the layer's attribution data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#attributionDataUrl)
    */
  val attributionDataUrl: String = js.native
  /**
    * Indicates the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  val capabilities: ArcGISMapServiceCapabilities = js.native
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  var copyright: String = js.native
  /**
    * Indicates if the layer has attribution data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#hasAttributionData)
    */
  val hasAttributionData: Boolean = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: Boolean = js.native
  /**
    * Resampling is enabled by default in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This means that tile images are resampled at a lower level of detail and displayed at levels where tiles may not be available. Setting this property to `false` disables this behavior. Instead, if a tile is not available, a transparent image is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#resampling)
    *
    * @default true
    */
  var resampling: Boolean = js.native
  /**
    * The [tiled map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#properties-summary) are exposed on the TileLayer class directly, this property gives access to all information returned by the tiled map service. This property is useful if working in an application built using an older version of the API which requires access to tiled map service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects. All sublayers are referenced in the order in which they are drawn in the view (bottom to top). Sublayer properties on TileLayer are read-only, with the following exceptions:
    *   * [legendEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#legendEnabled)
    *   * [popupEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupEnabled)
    *   * [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupTemplate)
    *   * [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#title)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#sublayers)
    */
  val sublayers: Collection[Sublayer] = js.native
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  /**
    * An array of tile servers used for changing map tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#tileServers)
    */
  var tileServers: js.Array[String] = js.native
  @JSName("type")
  val type_TileLayer: tile = js.native
  /**
    * The URL of the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#url)
    */
  var url: String = js.native
  /**
    * The version of ArcGIS Server in which the map service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#version)
    */
  val version: Double = js.native
  /**
    * This method fetches a tile for the given level, row and column present in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#fetchTile)
    *
    * @param level Level of detail of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param row The row(y) position of the tile fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param col The column(x) position of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param options Optional settings for the tile request. The options have the following properties.
    * @param options.timestamp Number to append to the tile request to prevent fetching the tile from the browser cache.
    * @param options.signal [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def fetchTile(level: Double, row: Double, col: Double): js.Promise[HTMLImageElement] = js.native
  def fetchTile(level: Double, row: Double, col: Double, options: TileLayerFetchTileOptions): js.Promise[HTMLImageElement] = js.native
  /**
    * This method returns a URL to a tile for a given level, row and column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#getTileUrl)
    *
    * @param level The requested tile's level.
    * @param row The requested tile's row.
    * @param col The requested tile's column.
    *
    */
  def getTileUrl(level: Double, row: Double, col: Double): String = js.native
}

@JSGlobal("__esri.TileLayer")
@js.native
object TileLayer extends TopLevel[TileLayerConstructor]

