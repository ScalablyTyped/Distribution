package typings.adone

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofevents extends js.Object {
  var EventEmitter: TypeofClassEventEmitter = js.native
  def once(emitter: EventEmitter, event: String): js.Promise[js.Array[_]] = js.native
  def once(emitter: EventEmitter, event: js.Symbol): js.Promise[js.Array[_]] = js.native
}

