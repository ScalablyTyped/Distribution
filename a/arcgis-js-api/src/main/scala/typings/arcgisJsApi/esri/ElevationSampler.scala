package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.changed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationSampler extends StObject {
  
  /**
  		 * The minimum and maximum resolution of the data in the sampler.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#demResolution)
  		 */
  val demResolution: ElevationSamplerDemResolution = js.native
  
  /**
  		 * Get elevation for a coordinate specified in the spatial reference of the sampler.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#elevationAt)
  		 */
  def elevationAt(x: Double, y: Double): Double = js.native
  
  /**
  		 * The extent within which the sampler can be queried.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#extent)
  		 */
  val extent: Extent = js.native
  
  /**
  		 * The value that is used to represent areas where there is no data available.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#noDataValue)
  		 */
  val noDataValue: Double = js.native
  
  @JSName("on")
  def on_changed(name: changed, eventHandler: ElevationSamplerChangedEventHandler): IHandle = js.native
  
  def queryElevation(geometry: Multipoint): Point | Multipoint | Polyline = js.native
  /**
  		 * Query elevation for a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) or [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#queryElevation)
  		 */
  def queryElevation(geometry: Point): Point | Multipoint | Polyline = js.native
  def queryElevation(geometry: Polyline): Point | Multipoint | Polyline = js.native
  
  /**
  		 * The spatial reference of the sampler.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#spatialReference)
  		 */
  val spatialReference: SpatialReference = js.native
}
