package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebTileLayer
  extends Layer
     with ScaleRangeLayer
     with RefreshableLayer {
  /**
    * The attribution information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#copyright)
    */
  var copyright: java.lang.String = js.native
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#spatialReference)
    *
    * @default Web Mercator Auxiliary Sphere (wkid: 3857)
    */
  val spatialReference: SpatialReference = js.native
  /**
    * A string of subDomain names where tiles are served to speed up tile retrieval. If subDomains are specified, the [urlTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate) should include a `{subDomain}` place holder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains)
    */
  var subDomains: js.Array[java.lang.String] = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  /**
    * The list of tile server urls for the layer. It's computed from the [urlTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate) and the list of [subDomains](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#tileServers)
    */
  val tileServers: js.Array[java.lang.String] = js.native
  /**
    * For [WebTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) the type is `web-tile`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#type)
    */
  @JSName("type")
  val type_WebTileLayer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`web-tile` = js.native
  /**
    * URL template for the hosted tiles. The `urlTemplate` should contain a `{subDomain}` place holder if [subDomains](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains) are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate)
    */
  var urlTemplate: java.lang.String = js.native
  /**
    * This method fetches a tile for the given level, row and column present in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#fetchTile)
    *
    * @param level Level of detail of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param row The row(y) position of the tile fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param column The column(x) position of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param options Optional settings for the tile request. The options have the following properties.
    * @param options.timestamp A timestamp to append to the tile url to avoid loading a cached version of the tile.
    *
    */
  def fetchTile(level: scala.Double, row: scala.Double, column: scala.Double): arcgisDashJsDashApiLib.IPromise[stdLib.HTMLImageElement] = js.native
  def fetchTile(
    level: scala.Double,
    row: scala.Double,
    column: scala.Double,
    options: WebTileLayerFetchTileOptions
  ): arcgisDashJsDashApiLib.IPromise[stdLib.HTMLImageElement] = js.native
  /**
    * This method returns a URL to a tile for a given level, row and column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#getTileUrl)
    *
    * @param level The requested tile's level.
    * @param row The requested tile's row.
    * @param column The requested tile's column.
    *
    */
  def getTileUrl(level: scala.Double, row: scala.Double, column: scala.Double): java.lang.String = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: WebTileLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: WebTileLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.WebTileLayer")
@js.native
/**
  * WebTileLayer provides a simple way to add non-ArcGIS Server map tiles as a layer to a map. The constructor takes a URL template that usually follows a pattern of `http://some.domain.com/{level}/{col}/{row}/` where `level` corresponds to a zoom level, and `column` and `row` represent tile column and row, respectively. This pattern is not required, but is the most common one currently on the web.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html)
  */
class WebTileLayerCls () extends WebTileLayer {
  def this(properties: WebTileLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: scala.Double = js.native
  /**
    * Refresh interval of the layer in minutes. Minimum refresh interval is 0.1 minute (6 seconds). Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  /* CompleteClass */
  override var refreshInterval: scala.Double = js.native
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  /* CompleteClass */
  override def refresh(): scala.Unit = js.native
}

