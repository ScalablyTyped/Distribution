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
  
  /**
    * Registers an event handler on the instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#on)
    */
  def on(`type`: String): js.Any = js.native
  def on(`type`: String, handler: js.Function): js.Any = js.native
  def on(`type`: js.Array[String]): js.Any = js.native
  def on(`type`: js.Array[String], handler: js.Function): js.Any = js.native
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
}
