package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseElevationLayer extends Layer {
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#spatialReference)
    *
    * @default {@link module:esri/geometry/SpatialReference#WebMercator SpatialReference.WebMercator}
    */
  var spatialReference: SpatialReference = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  /**
    * Adds a promise to the layer's [loadable](https://developers.arcgis.com/javascript/latest/guide/loadable/index.html) chain. This is typically used in the [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#load) method to ensure that all [loadable](https://developers.arcgis.com/javascript/latest/guide/loadable/index.html) resources required for the layer to function are loaded prior to this layer resolving and becoming [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#addResolvingPromise)
    *
    * @param promiseToLoad A promise that must resolve for the layer to resolve and move from the `loading` [status](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#loadStatus) to being [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#loaded).
    *
    */
  def addResolvingPromise(promiseToLoad: IPromise[_]): IPromise[_] = js.native
  /**
    * Creates an elevation sampler for the given [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) by querying the service layer for elevation data and caching it so values may be sampled quickly afterwards. The resolution of the cached data can be set using the `demResolution` option. In many cases, `auto` demResolution can be used to get high quality elevation samples without the need to know exactly where the data in the service is located. This is particularly useful for services which combine elevation data from many sources (such as the world elevation service). If more control, or higher quality samples are required, use either `finest-contiguous` or a fixed `{number}` resolution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#createElevationSampler)
    *
    * @param extent The extent for which to create the sampler.
    * @param options Additional query options. See the table below.
    * @param options.demResolution Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation) for more details.
    * @param options.noDataValue The value to use when there is no data available.
    *
    */
  def createElevationSampler(extent: Extent): IPromise[ElevationSampler] = js.native
  def createElevationSampler(extent: Extent, options: BaseElevationLayerCreateElevationSamplerOptions): IPromise[ElevationSampler] = js.native
  /**
    * Fetches a tile at the given level, row, and column present in the view. This method must be overwritten to display custom elevation values in the [Map.ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground). Note that this method must return a promise that resolves to an object with the properties defined in [ElevationTileData](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData).  See the following samples for examples of how to overwrite this method:
    *   * [Sample - Custom ElevationLayer: Exaggerating elevation](https://developers.arcgis.com/javascript/latest/sample-code/layers-custom-elevation-exaggerated/index.html)
    *   * [Sample - Custom ElevationLayer: Thematic data as elevation](https://developers.arcgis.com/javascript/latest/sample-code/layers-custom-elevation-thematic/index.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#fetchTile)
    *
    * @param level The level of detail of the tile to fetch.
    * @param row The row (y) position of the tile to fetch.
    * @param column The column (x) position of the tile to fetch.
    * @param options Optional settings for the tile request.
    * @param options.noDataValue The value representing pixels in the tile that don't contain an elevation value.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def fetchTile(level: Double, row: Double, column: Double): IPromise[ElevationTileData] = js.native
  def fetchTile(level: Double, row: Double, column: Double, options: BaseElevationLayerFetchTileOptions): IPromise[ElevationTileData] = js.native
  /**
    * Returns the bounds of the tile as an array of four numbers that can be readily converted to an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object. See the table in the `returns` section below for more details about the values returned by this method.  This function can be used inside [fetchTile()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#fetchTile) so you can get the bounds of the current tile, convert it to an extent object, and request the desired data for the given extent. See the [Custom ElevationLayer: Thematic data as elevation](https://developers.arcgis.com/javascript/latest/sample-code/layers-custom-elevation-thematic/index.html) sample for an example of how this method works.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#getTileBounds)
    *
    * @param level The level of detail (LOD) of the tile.
    * @param row The tile's row (y) position in the dataset.
    * @param column The tiles column (x) position in the dataset.
    * @param out Array for storing the tile bounds or extent.
    *
    */
  def getTileBounds(level: Double, row: Double, column: Double): js.Array[Double] = js.native
  def getTileBounds(level: Double, row: Double, column: Double, out: js.Array[Double]): js.Array[Double] = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: BaseElevationLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: BaseElevationLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: BaseElevationLayerLayerviewDestroyEventHandler): IHandle = js.native
  def queryElevation(geometry: Multipoint): IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Multipoint, options: BaseElevationLayerQueryElevationOptions): IPromise[ElevationLayerElevationQueryResult] = js.native
  /**
    * Queries the service layer for elevation values for the given geometry. The returned result contains a copy of the geometry with z-values sampled from elevation data from the service. The resolution from which the elevation is queried can be set using the `demResolution` option. In many cases, `auto` demResolution can be used to get high quality elevation samples without the need to know exactly where the data in the service is located. This is particularly useful for services which combine elevation data from many sources (such as the world elevation service). If more control, or higher quality samples are required, use either `finest-contiguous` or a fixed `{number}` resolution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
    *
    * @param geometry The geometry to use for sampling elevation data.
    * @param options Additional query options. See the table below.
    * @param options.demResolution
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See the table below for more details on the different settings.
    *
    * demResolution          | Description
    * -----------------------|-------------
    * `auto`                 | Automatically chooses an appropriate resolution for each coordinate of the input geometry. The current implementation will try to use the finest available resolution given that the total required number of tile requests does not exceed a certain maximum amount (currently 20). Note that this may result in values being sampled from different resolutions.
    * `finest-contiguous`    | Sample elevation from the finest available resolution (cell size) across the entire geometry.
    * `{number}`             | Sample elevation from the resolution closest to the specified resolution (in meters).
    * @param options.returnSampleInfo Indicates whether to return additional sample information for each coordinate.
    * @param options.noDataValue The value to use when there is no data available.
    *
    */
  def queryElevation(geometry: Point): IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Point, options: BaseElevationLayerQueryElevationOptions): IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline): IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline, options: BaseElevationLayerQueryElevationOptions): IPromise[ElevationLayerElevationQueryResult] = js.native
}

@JSGlobal("__esri.BaseElevationLayer")
@js.native
/**
  * BaseElevationLayer is intended to be extended for creating custom elevation layers. You create a custom [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) by calling [createSubclass()](https://dojotoolkit.org/reference-guide/1.10/dojo/_base/declare.html#createsubclass) on the `BaseElevationLayer`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html)
  */
class BaseElevationLayerCls () extends BaseElevationLayer {
  def this(properties: BaseElevationLayerProperties) = this()
}

