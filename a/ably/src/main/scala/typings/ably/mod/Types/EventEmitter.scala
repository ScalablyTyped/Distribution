package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal Classes
// To allow a uniform (callback) interface between on and once even in the
// promisified version of the lib, but still allow once to be used in a way
// that returns a Promise if desired, EventEmitter uses method overloading to
// present both methods
@js.native
trait EventEmitter[CallbackType, ResultType, EventType, StateType] extends js.Object {
  def listeners(): js.Array[CallbackType] | Null = js.native
  def listeners(eventName: EventType): js.Array[CallbackType] | Null = js.native
  def off(): Unit = js.native
  def off(eventOrCallback: CallbackType | EventType): Unit = js.native
  def off(eventOrCallback: js.UndefOr[CallbackType | EventType], callback: CallbackType): Unit = js.native
  def on(eventOrCallback: CallbackType | EventType): Unit = js.native
  def on(eventOrCallback: CallbackType | EventType, callback: CallbackType): Unit = js.native
  def on(eventOrCallback: js.Array[EventType]): Unit = js.native
  def on(eventOrCallback: js.Array[EventType], callback: CallbackType): Unit = js.native
  def once(): js.Promise[ResultType] = js.native
  def once(callback: CallbackType): Unit = js.native
  def once(event: EventType, callback: CallbackType): Unit = js.native
  @JSName("once")
  def once_Promise(event: EventType): js.Promise[ResultType] = js.native
}

