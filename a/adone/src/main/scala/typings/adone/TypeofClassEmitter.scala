package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.adone.adoneNs.eventNs.Emitter
import typings.adone.adoneNs.eventNs.INs.PropagateEventsEnder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassEmitter extends Instantiable0[Emitter] {
  var defaultMaxListeners: Double = js.native
  def listenerCount(emitter: Emitter, event: String): Double = js.native
  def listenerCount(emitter: Emitter, event: js.Symbol): Double = js.native
  def propagateEvents(source: Emitter, dest: Emitter, events: js.Array[String]): PropagateEventsEnder = js.native
}

