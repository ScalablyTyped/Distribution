package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
    * Adds a promise to the layer's [loadable](https://developers.arcgis.com/javascript/latest/guide/loadable/index.html) chain. This is typically used in the [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#load) method to ensure that all [loadable](https://developers.arcgis.com/javascript/latest/guide/loadable/index.html) resources required for the layer to function are loaded prior to this layer resolving and becoming [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#addResolvingPromise)
    *
    * @param promiseToLoad A promise that must resolve for the layer to resolve and move from the `loading` [status](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#loadStatus) to being [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#loaded).
    *
    */
  def addResolvingPromise(promiseToLoad: arcgisDashJsDashApiLib.IPromise[_]): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * This method fetches a tile for the given level, row and column present in the view. Override this method if the data or image returned from the server needs to be processed before it can be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#fetchTile)
    *
    * @param level Level of detail of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param row The row (y) position of the tile fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param col The column (x) position of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param options Optional settings for the tile request. The options have the following properties.
    *
    */
  def fetchTile(level: scala.Double, row: scala.Double, col: scala.Double): arcgisDashJsDashApiLib.IPromise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
  def fetchTile(level: scala.Double, row: scala.Double, col: scala.Double, options: js.Any): arcgisDashJsDashApiLib.IPromise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
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
  def getTileBounds(level: scala.Double, row: scala.Double, column: scala.Double): js.Array[scala.Double] = js.native
  def getTileBounds(level: scala.Double, row: scala.Double, column: scala.Double, out: js.Array[scala.Double]): js.Array[scala.Double] = js.native
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
  def getTileUrl(level: scala.Double, row: scala.Double, col: scala.Double): java.lang.String = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: BaseTileLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: BaseTileLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.BaseTileLayer")
@js.native
/**
  * This class may be extended to create a custom [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html). Tile layers are composed of images, such as satellite imagery, that are composed of square tiles mosaicked together in columns and rows, giving the layer the appearance that it is one continuous image. These layers have several levels of detail (LOD) that permit users to zoom in to any region of the map and load additional tiles that depict features in higher resolution at larger map scales.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html)
  */
class BaseTileLayerCls () extends BaseTileLayer {
  def this(properties: BaseTileLayerProperties) = this()
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

