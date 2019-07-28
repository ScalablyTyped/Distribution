package typings.adone.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "events")
@js.native
object eventsNs extends js.Object {
  @js.native
  class EventEmitter ()
    extends typings.node.eventsMod.EventEmitter
  
  def once(emitter: typings.node.eventsMod.EventEmitter, event: String): js.Promise[js.Array[_]] = js.native
  def once(emitter: typings.node.eventsMod.EventEmitter, event: js.Symbol): js.Promise[js.Array[_]] = js.native
  /* static members */
  @js.native
  object EventEmitter extends js.Object {
    var defaultMaxListeners: Double = js.native
    /** @deprecated since v4.0.0 */
    def listenerCount(emitter: typings.node.eventsMod.EventEmitter, event: String): Double = js.native
    def listenerCount(emitter: typings.node.eventsMod.EventEmitter, event: js.Symbol): Double = js.native
  }
  
}

