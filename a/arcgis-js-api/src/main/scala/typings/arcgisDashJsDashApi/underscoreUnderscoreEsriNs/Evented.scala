package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evented extends js.Object {
  /**
    * Emits an event on the instance. This method should only be used when creating subclasses of this class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#emit)
    *
    * @param type The name of the event.
    * @param event The event payload.
    *
    */
  def emit(`type`: String): Boolean = js.native
  def emit(`type`: String, event: js.Any): Boolean = js.native
  /**
    * Indicates whether there is an event listener on the instance that matches the provided event name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#hasEventListener)
    *
    * @param type The name of the event.
    *
    */
  def hasEventListener(`type`: String): Boolean = js.native
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#on)
    *
    * @param type A event type, or an array of event types, to listen for.
    * @param listener The function to call when the event is fired.
    *
    */
  def on(`type`: String, listener: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], listener: EventHandler): IHandle = js.native
}

@JSGlobal("__esri.Evented")
@js.native
class EventedCls () extends Evented

