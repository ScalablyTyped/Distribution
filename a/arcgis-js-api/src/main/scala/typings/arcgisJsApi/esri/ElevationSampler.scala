package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationSampler extends js.Object {
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
    * Registers an event handler on the instance. Call this method to hook an event with a listener. See the [Events summary table](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#events-summary) for a list of listened events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#on)
    *
    * @param type The name of the event or the events to listen for.
    * @param handler? The function to call when the event is fired, if modifiers were specified.
    *
    */
  def on(`type`: String): js.Any = js.native
  def on(`type`: String, handler: js.Function): js.Any = js.native
  def on(`type`: js.Array[String]): js.Any = js.native
  def on(`type`: js.Array[String], handler: js.Function): js.Any = js.native
  @JSName("on")
  def on_changed(name: changed, eventHandler: ElevationSamplerChangedEventHandler): IHandle = js.native
  def queryElevation(geometry: Multipoint): Point | Multipoint | Polyline = js.native
  /**
    * Query elevation for a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) or [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry. A query will return a new geometry for which the z-values for each coordinate in the geometry are obtained from the elevation sampler. If the geometry used for the query is outside of the elevation sampler extent, then the returned geometry has `0` as z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#queryElevation)
    *
    * @param geometry The geometry to use for sampling elevation data.
    *
    */
  def queryElevation(geometry: Point): Point | Multipoint | Polyline = js.native
  def queryElevation(geometry: Polyline): Point | Multipoint | Polyline = js.native
}

