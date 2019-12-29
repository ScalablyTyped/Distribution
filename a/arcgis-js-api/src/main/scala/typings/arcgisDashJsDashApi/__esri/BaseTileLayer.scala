package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`base-tile`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`bing-maps`
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTileLayer
  extends Layer
     with ScaleRangeLayer
     with RefreshableLayer {
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#spatialReference)
    *
    * @default {@link module:esri/geometry/SpatialReference#WebMercator SpatialReference.WebMercator}
    */
  var spatialReference: SpatialReference = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  /**
    * For [BaseTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html) the type is `base-tile`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#type)
    */
  @JSName("type")
  val type_BaseTileLayer: `base-tile` | `bing-maps` = js.native
  /**
    * Adds a promise to the layer's [loadable](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#loadable) chain. This is typically used in the [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#load) method to ensure that all [loadable](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#loadable) resources required for the layer to function are loaded prior to this layer resolving and becoming [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#addResolvingPromise)
    *
    * @param promiseToLoad A promise that must resolve for the layer to resolve and move from the `loading` [status](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#loadStatus) to being [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#loaded).
    *
    */
  def addResolvingPromise(promiseToLoad: js.Promise[_]): js.Promise[_] = js.native
  /**
    * This method fetches a tile for the given level, row and column present in the view. Override this method if the data or image returned from the server needs to be processed before it can be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#fetchTile)
    *
    * @param level Level of detail of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param row The row (y) position of the tile fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param col The column (x) position of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param options Optional settings for the tile request. The options have the following properties.
    * @param options.timestamp Number to append to the tile request to prevent fetching the tile from the browser cache.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. When overriding fetchTile, `signal` should be handled, for example by passing it on to [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html) or by aborting pending operations. An aborted call to fetchTile should reject its returned promise with an instance of [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html).
    *
    */
  def fetchTile(level: Double, row: Double, col: Double): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
  def fetchTile(level: Double, row: Double, col: Double, options: BaseTileLayerFetchTileOptions): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
  /**
    * Returns the bounds of the tile as an array of four numbers that be readily converted to an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object. The value for each item in the array is described in the following table:
    *
    * Index | Value
    * ------|------
    * 0 | Minimum x-value
    * 1 | Minimum y-value
    * 2 | Maximum x-value
    * 3 | Maximum y-value
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#getTileBounds)
    *
    * @param level The level of detail (LOD) of the tile.
    * @param row The tile's row (y) position in the dataset.
    * @param column The tiles column (x) position in the dataset.
    * @param out Array for storing the tile bounds or extent.
    *
    */
  def getTileBounds(level: Double, row: Double, column: Double): js.Array[Double] = js.native
  def getTileBounds(level: Double, row: Double, column: Double, out: js.Array[Double]): js.Array[Double] = js.native
  /**
    * This method returns a URL to an image for a given level, row and column. Override this method to construct the URL for the image based on user interaction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#getTileUrl)
    *
    * @param level Level of detail. This value is provided by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param row Tile row. This value is provided by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param col Tile column. This value is provided by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    *
    */
  def getTileUrl(level: Double, row: Double, col: Double): String = js.native
}

@JSGlobal("__esri.BaseTileLayer")
@js.native
object BaseTileLayer extends TopLevel[BaseTileLayerConstructor]

