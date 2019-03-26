package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  def emit(`type`: java.lang.String): scala.Unit = js.native
  def emit(`type`: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
    * Indicates whether there is an event listener on the instance that matches the provided event name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#hasEventListener)
    *
    * @param type The name of the event.
    *
    */
  def hasEventListener(`type`: java.lang.String): scala.Boolean = js.native
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#on)
    *
    * @param type The name of event to listen for.
    * @param listener The function to call when the event is fired.
    *
    */
  def on(`type`: java.lang.String, listener: EventHandler): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.Evented")
@js.native
class EventedCls () extends Evented

