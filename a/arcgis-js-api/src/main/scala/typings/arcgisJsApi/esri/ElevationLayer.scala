package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.elevation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationLayer
  extends StObject
     with Layer
     with ArcGISCachedService
     with PortalLayer {
  
  /**
  		 * Creates an elevation sampler for the given [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) by querying the service layer for elevation data and caching it so values may be sampled quickly afterwards.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler)
  		 */
  def createElevationSampler(extent: Extent): js.Promise[ElevationSampler] = js.native
  def createElevationSampler(extent: Extent, options: ElevationLayerCreateElevationSamplerOptions): js.Promise[ElevationSampler] = js.native
  
  /**
  		 * Requests a tile from the service and decodes the data into a linear array of elevation values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#fetchTile)
  		 */
  def fetchTile(level: Double, row: Double, column: Double): js.Promise[ElevationTileData] = js.native
  def fetchTile(level: Double, row: Double, column: Double, options: ElevationLayerFetchTileOptions): js.Promise[ElevationTileData] = js.native
  
  /**
  		 * This method returns a URL to a tile for a given level, row and column.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#getTileUrl)
  		 */
  def getTileUrl(level: Double, row: Double, col: Double): String = js.native
  
  def queryElevation(geometry: Multipoint): js.Promise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Multipoint, options: ElevationLayerQueryElevationOptions): js.Promise[ElevationLayerElevationQueryResult] = js.native
  /**
  		 * Queries the service layer for elevation values for the given geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
  		 */
  def queryElevation(geometry: Point): js.Promise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Point, options: ElevationLayerQueryElevationOptions): js.Promise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline): js.Promise[ElevationLayerElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline, options: ElevationLayerQueryElevationOptions): js.Promise[ElevationLayerElevationQueryResult] = js.native
  
  /**
  		 * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#sourceJSON)
  		 */
  var sourceJSON: Any = js.native
  
  @JSName("type")
  val type_ElevationLayer: elevation = js.native
  
  /**
  		 * URL pointing to the Elevation layer resource on an ArcGIS Image Server.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#url)
  		 */
  var url: String = js.native
}
