package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  def addResolvingPromise(promiseToLoad: arcgisDashJsDashApiLib.IPromise[_]): arcgisDashJsDashApiLib.IPromise[_] = js.native
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
    *
    */
  def fetchTile(level: scala.Double, row: scala.Double, column: scala.Double): arcgisDashJsDashApiLib.IPromise[ElevationTileData] = js.native
  def fetchTile(
    level: scala.Double,
    row: scala.Double,
    column: scala.Double,
    options: BaseElevationLayerFetchTileOptions
  ): arcgisDashJsDashApiLib.IPromise[ElevationTileData] = js.native
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
  def getTileBounds(level: scala.Double, row: scala.Double, column: scala.Double): js.Array[scala.Double] = js.native
  def getTileBounds(level: scala.Double, row: scala.Double, column: scala.Double, out: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: BaseElevationLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: BaseElevationLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
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

