package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageryTileMixin extends StObject {
  
  /**
  		 * Defines a band combination using 0-based band indexes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#bandIds)
  		 */
  var bandIds: js.Array[Double] = js.native
  
  /**
  		 * The copyright text as defined by the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#copyright)
  		 */
  var copyright: String = js.native
  
  /**
  		 * Fetches pixels for a given extent.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#fetchPixels)
  		 */
  def fetchPixels(extent: Extent, width: Double, height: Double): js.Promise[Any] = js.native
  def fetchPixels(extent: Extent, width: Double, height: Double, options: ImageryTileMixinFetchPixelsOptions): js.Promise[Any] = js.native
  
  /**
  		 * Identify pixel values at a given location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#identify)
  		 */
  def identify(point: Point): js.Promise[RasterIdentifyResult] = js.native
  def identify(point: PointProperties): js.Promise[RasterIdentifyResult] = js.native
  def identify(point: PointProperties, options: RasterIdentifyOptions): js.Promise[RasterIdentifyResult] = js.native
  def identify(point: Point, options: RasterIdentifyOptions): js.Promise[RasterIdentifyResult] = js.native
  
  /**
  		 * The multidimensional definitions associated with the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#multidimensionalDefinition)
  		 */
  var multidimensionalDefinition: js.Array[DimensionalDefinition] = js.native
  
  /**
  		 * Raster information retrieved from data source.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#rasterInfo)
  		 */
  val rasterInfo: RasterInfo = js.native
  
  /**
  		 * The renderer assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#renderer)
  		 */
  var renderer: ClassBreaksRenderer | UniqueValueRenderer | RasterStretchRenderer | RasterShadedReliefRenderer | RasterColormapRenderer | VectorFieldRenderer | FlowRenderer = js.native
}
