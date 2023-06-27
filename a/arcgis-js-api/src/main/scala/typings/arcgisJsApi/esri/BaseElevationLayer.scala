package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`base-elevation`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseElevationLayer
  extends StObject
     with Layer {
  
  /**
  		 * Adds a promise to the layer's [loadable](https://developers.arcgis.com/javascript/latest/programming-patterns/#loadable) chain.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#addResolvingPromise)
  		 */
  def addResolvingPromise(promiseToLoad: js.Promise[Any]): js.Promise[Any] = js.native
  
  /**
  		 * Creates an elevation sampler for the given [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) by querying the service layer for elevation data and caching it so values may be sampled quickly afterwards.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#createElevationSampler)
  		 */
  def createElevationSampler(extent: Extent): js.Promise[ElevationSampler] = js.native
  def createElevationSampler(extent: Extent, options: BaseElevationLayerCreateElevationSamplerOptions): js.Promise[ElevationSampler] = js.native
  
  /**
  		 * Fetches a tile at the given level, row, and column present in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#fetchTile)
  		 */
  def fetchTile(level: Double, row: Double, column: Double): js.Promise[ElevationTileData] = js.native
  def fetchTile(level: Double, row: Double, column: Double, options: BaseElevationLayerFetchTileOptions): js.Promise[ElevationTileData] = js.native
  
  /**
  		 * Returns the bounds of the tile as an array of four numbers that can be readily converted to an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#getTileBounds)
  		 */
  def getTileBounds(level: Double, row: Double, column: Double): js.Array[Double] = js.native
  def getTileBounds(level: Double, row: Double, column: Double, out: js.Array[Double]): js.Array[Double] = js.native
  
  def queryElevation(geometry: Multipoint): js.Promise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Multipoint, options: BaseElevationLayerQueryElevationOptions): js.Promise[ElevationLayerElevationQueryResult] = js.native
  /**
  		 * Queries the service layer for elevation values for the given geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
  		 */
  def queryElevation(geometry: Point): js.Promise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Point, options: BaseElevationLayerQueryElevationOptions): js.Promise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline): js.Promise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline, options: BaseElevationLayerQueryElevationOptions): js.Promise[ElevationLayerElevationQueryResult] = js.native
  
  /**
  		 * The spatial reference of the layer.
  		 *
  		 * @default {@link module:esri/geometry/SpatialReference#WebMercator SpatialReference.WebMercator}
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#spatialReference)
  		 */
  var spatialReference: SpatialReference = js.native
  
  /**
  		 * The tiling scheme information for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#tileInfo)
  		 */
  var tileInfo: TileInfo = js.native
  
  @JSName("type")
  val type_BaseElevationLayer: `base-elevation` = js.native
}
