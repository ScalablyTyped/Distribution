package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "events")
@js.native
object eventsNs extends js.Object {
  @js.native
  class EventEmitter ()
    extends nodeLib.eventsMod.EventEmitter
  
  def once(emitter: nodeLib.eventsMod.EventEmitter, event: java.lang.String): js.Promise[js.Array[_]] = js.native
  def once(emitter: nodeLib.eventsMod.EventEmitter, event: js.Symbol): js.Promise[js.Array[_]] = js.native
  /* static members */
  @js.native
  object EventEmitter extends js.Object {
    var defaultMaxListeners: scala.Double = js.native
    /** @deprecated since v4.0.0 */
    def listenerCount(emitter: nodeLib.eventsMod.EventEmitter, event: java.lang.String): scala.Double = js.native
    def listenerCount(emitter: nodeLib.eventsMod.EventEmitter, event: js.Symbol): scala.Double = js.native
  }
  
}

