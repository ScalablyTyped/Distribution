package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.elevation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationLayer
  extends Layer
     with ArcGISCachedService
     with PortalLayer {
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#properties-summary) are exposed on the ElevationLayer class directly, this property gives access to all information returned by the elevation image service. This property is useful if working in an application built using an older version of the API which requires access to elevation image service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  @JSName("type")
  val type_ElevationLayer: elevation = js.native
  /**
    * URL pointing to the Elevation layer resource on an ArcGIS Image Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#url)
    */
  var url: String = js.native
  /**
    * Creates an elevation sampler for the given [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) by querying the service layer for elevation data and caching it so values may be sampled quickly afterwards. The resolution of the cached data can be set using the `demResolution` option. In many cases, `auto` demResolution can be used to get high quality elevation samples without the need to know exactly where the data in the service is located. This is particularly useful for services which combine elevation data from many sources (such as the world elevation service). If more control, or higher quality samples are required, use either `finest-contiguous` or a fixed `{number}` resolution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler)
    *
    * @param extent The extent for which to create the sampler.
    * @param options Additional query options. See the table below.
    * @param options.demResolution Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation) for more details.
    * @param options.noDataValue The value to use when there is no data available.
    *
    */
  def createElevationSampler(extent: Extent): IPromise[ElevationSampler] = js.native
  def createElevationSampler(extent: Extent, options: ElevationLayerCreateElevationSamplerOptions): IPromise[ElevationSampler] = js.native
  /**
    * Requests a tile from the service and decodes the data into a linear array of elevation values.  The returned promise resolves with a plain object describing the obtained elevation data for the tile. The object has the following properties:
    *
    * Property  | Type         | Description
    * ----------|--------------|------------
    * values    | Float32Array | The elevation values contained in the tile.
    * width     | number       | The number of elevation values in one row of the tile.
    * height    | number       | The number of elevation values in one column of the tile.
    * maxZError | number       | The upper bound for the compression error on the elevation values.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#fetchTile)
    *
    * @param level the tile level.
    * @param row the tile row.
    * @param column the tile column.
    * @param options Optional settings for the tile request.
    * @param options.noDataValue The value representing pixels in the tile that don't contain an elevation value.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def fetchTile(level: Double, row: Double, column: Double): IPromise[ElevationTileData] = js.native
  def fetchTile(level: Double, row: Double, column: Double, options: ElevationLayerFetchTileOptions): IPromise[ElevationTileData] = js.native
  /**
    * This method returns a URL to a tile for a given level, row and column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#getTileUrl)
    *
    * @param level The requested tile's level.
    * @param row The requested tile's row.
    * @param col The requested tile's column.
    *
    */
  def getTileUrl(level: Double, row: Double, col: Double): String = js.native
  def queryElevation(geometry: Multipoint): IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Multipoint, options: ElevationLayerQueryElevationOptions): IPromise[ElevationLayerElevationQueryResult] = js.native
  /**
    * Queries the service layer for elevation values for the given geometry. The returned result contains a copy of the geometry with z-values sampled from elevation data from the service. The resolution from which the elevation is queried can be set using the `demResolution` option. In many cases, `auto` demResolution can be used to get high quality elevation samples without the need to know exactly where the data in the service is located. This is particularly useful for services which combine elevation data from many sources (such as the world elevation service). If more control, or higher quality samples are required, use either `finest-contiguous` or a fixed `{number}` resolution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
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
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def queryElevation(geometry: Point): IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Point, options: ElevationLayerQueryElevationOptions): IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline): IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline, options: ElevationLayerQueryElevationOptions): IPromise[ElevationLayerElevationQueryResult] = js.native
}

@JSGlobal("__esri.ElevationLayer")
@js.native
object ElevationLayer extends TopLevel[ElevationLayerConstructor]

