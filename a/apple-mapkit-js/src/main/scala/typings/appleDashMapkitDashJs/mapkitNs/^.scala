package typings.appleDashMapkitDashJs.mapkitNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit")
@js.native
object ^ extends js.Object {
  /**
    * The build string.
    */
  val build: String = js.native
  /**
    * A language ID indicating the selected language.
    */
  var language: String = js.native
  /**
    * An array to which maps are automatically added and removed as they are
    * initialized and destroyed.
    */
  val maps: js.Array[Map] = js.native
  /**
    * The version of MapKit JS.
    */
  val version: String = js.native
  /**
    * Subscribes a listener function to an event type.
    *
    * @param type The type of event (e.g., "configuration-change").
    * @param listener The callback function to invoke. listener is passed an
    * Event as its sole argument.
    * @param thisObject An object set as the this keyword on the listener function.
    */
  def addEventListener[T](
    `type`: InitializationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit]
  ): Unit = js.native
  def addEventListener[T](
    `type`: InitializationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit],
    thisObject: T
  ): Unit = js.native
  /**
    *
    * @param data The original GeoJSON data, which may be a URL to a GeoJSON file,
    * or a GeoJSON object.
    * @param callback A callback function that is required if you provide a URL
    * for the data parameter, and optional otherwise.
    */
  def importGeoJSON(data: String): ItemCollection | Error = js.native
  def importGeoJSON(data: String, callback: GeoJSONDelegate): ItemCollection | Error = js.native
  def importGeoJSON(data: String, callback: ImportGeoJSONCallback): ItemCollection | Error = js.native
  def importGeoJSON(data: js.Object): ItemCollection | Error = js.native
  def importGeoJSON(data: js.Object, callback: GeoJSONDelegate): ItemCollection | Error = js.native
  def importGeoJSON(data: js.Object, callback: ImportGeoJSONCallback): ItemCollection | Error = js.native
  /**
    * Initialize a mapkit object by providing an authorization callback and language.
    */
  def init(options: MapKitInitOptions): Unit = js.native
  /**
    * Unsubscribes a listener function from an event type.
    *
    * @param type The type of event (e.g., "configuration-change").
    * @param listener The callback function to remove.
    * @param thisObject An object set as the this keyword on the listener function.
    */
  def removeEventListener[T](
    `type`: InitializationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit]
  ): Unit = js.native
  def removeEventListener[T](
    `type`: InitializationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit],
    thisObject: T
  ): Unit = js.native
}

