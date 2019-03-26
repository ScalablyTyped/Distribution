package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationLayer
  extends Layer
     with ArcGISCachedService
     with PortalLayer {
  /**
    * URL pointing to the Elevation layer resource on an ArcGIS Image Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#url)
    */
  var url: java.lang.String = js.native
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
  def createElevationSampler(extent: Extent): arcgisDashJsDashApiLib.IPromise[ElevationSampler] = js.native
  def createElevationSampler(extent: Extent, options: ElevationLayerCreateElevationSamplerOptions): arcgisDashJsDashApiLib.IPromise[ElevationSampler] = js.native
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
    * @param noDataValue the value to use when a tile is partially missing data.
    *
    */
  def fetchTile(level: scala.Double, row: scala.Double, column: scala.Double): arcgisDashJsDashApiLib.IPromise[ElevationTileData] = js.native
  def fetchTile(level: scala.Double, row: scala.Double, column: scala.Double, noDataValue: scala.Double): arcgisDashJsDashApiLib.IPromise[ElevationTileData] = js.native
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
  def getTileUrl(level: scala.Double, row: scala.Double, col: scala.Double): java.lang.String = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: ElevationLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: ElevationLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  def queryElevation(geometry: Multipoint): arcgisDashJsDashApiLib.IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Multipoint, options: ElevationLayerQueryElevationOptions): arcgisDashJsDashApiLib.IPromise[ElevationLayerElevationQueryResult] = js.native
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
    *
    */
  def queryElevation(geometry: Point): arcgisDashJsDashApiLib.IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Point, options: ElevationLayerQueryElevationOptions): arcgisDashJsDashApiLib.IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline): arcgisDashJsDashApiLib.IPromise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline, options: ElevationLayerQueryElevationOptions): arcgisDashJsDashApiLib.IPromise[ElevationLayerElevationQueryResult] = js.native
}

@JSGlobal("__esri.ElevationLayer")
@js.native
/**
  * ElevationLayer is a tile layer used for rendering elevations in [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A default [world elevation layer](https://www.arcgis.com/home/item.html?id=7029fb60158543ad845c7e1527af11e4) can be added to the map by setting the [map's ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground) property to `world-elevation`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html)
  */
class ElevationLayerCls () extends ElevationLayer {
  def this(properties: ElevationLayerProperties) = this()
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  /* CompleteClass */
  override var copyright: java.lang.String = js.native
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: PortalItem = js.native
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#spatialReference)
    */
  /* CompleteClass */
  override val spatialReference: SpatialReference = js.native
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  /* CompleteClass */
  override var tileInfo: TileInfo = js.native
}

