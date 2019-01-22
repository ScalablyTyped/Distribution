package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal Classes
@js.native
trait EventEmitter[CallbackType, EventType, StateType] extends js.Object {
  def listeners(): js.Array[CallbackType] | scala.Null = js.native
  def listeners(eventName: EventType): js.Array[CallbackType] | scala.Null = js.native
  def off(): scala.Unit = js.native
  def off(eventOrCallback: CallbackType | EventType): scala.Unit = js.native
  def off(eventOrCallback: CallbackType | EventType, callback: CallbackType): scala.Unit = js.native
  def on(eventOrCallback: CallbackType | EventType): scala.Unit = js.native
  def on(eventOrCallback: CallbackType | EventType, callback: CallbackType): scala.Unit = js.native
  def on(eventOrCallback: js.Array[EventType]): scala.Unit = js.native
  def on(eventOrCallback: js.Array[EventType], callback: CallbackType): scala.Unit = js.native
  def once(eventOrCallback: CallbackType | EventType): scala.Unit = js.native
  def once(eventOrCallback: CallbackType | EventType, callback: CallbackType): scala.Unit = js.native
}

