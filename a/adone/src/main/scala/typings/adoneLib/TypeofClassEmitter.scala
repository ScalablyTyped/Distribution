package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassEmitter
  extends org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.eventNs.Emitter] {
  var defaultMaxListeners: scala.Double = js.native
  def listenerCount(emitter: adoneLib.adoneNs.eventNs.Emitter, event: java.lang.String): scala.Double = js.native
  def listenerCount(emitter: adoneLib.adoneNs.eventNs.Emitter, event: js.Symbol): scala.Double = js.native
  def propagateEvents(
    source: adoneLib.adoneNs.eventNs.Emitter,
    dest: adoneLib.adoneNs.eventNs.Emitter,
    events: js.Array[java.lang.String]
  ): adoneLib.adoneNs.eventNs.INs.PropagateEventsEnder = js.native
}

