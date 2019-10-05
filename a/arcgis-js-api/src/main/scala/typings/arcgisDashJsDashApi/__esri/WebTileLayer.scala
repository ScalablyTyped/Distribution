package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`web-tile`
import typings.std.HTMLImageElement
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
  var copyright: String = js.native
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
  var subDomains: js.Array[String] = js.native
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
  val tileServers: js.Array[String] = js.native
  /**
    * For [WebTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) the type is `web-tile`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#type)
    */
  @JSName("type")
  val type_WebTileLayer: `web-tile` = js.native
  /**
    * URL template for the hosted tiles. The `urlTemplate` should contain a `{subDomain}` place holder if [subDomains](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains) are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate)
    */
  var urlTemplate: String = js.native
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
    * @param options.signal [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def fetchTile(level: Double, row: Double, column: Double): IPromise[HTMLImageElement] = js.native
  def fetchTile(level: Double, row: Double, column: Double, options: WebTileLayerFetchTileOptions): IPromise[HTMLImageElement] = js.native
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
  def getTileUrl(level: Double, row: Double, column: Double): String = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: WebTileLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: WebTileLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: WebTileLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.WebTileLayer")
@js.native
object WebTileLayer extends TopLevel[WebTileLayerConstructor]

