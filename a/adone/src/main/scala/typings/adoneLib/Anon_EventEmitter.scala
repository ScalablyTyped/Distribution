package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventEmitter extends js.Object {
  var EventEmitter: Anon_DefaultMaxListeners
  val internalNs: js.Any
}

object Anon_EventEmitter {
  @scala.inline
  def apply(EventEmitter: Anon_DefaultMaxListeners, internalNs: js.Any): Anon_EventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EventEmitter")(EventEmitter)
    __obj.updateDynamic("internalNs")(internalNs)
    __obj.asInstanceOf[Anon_EventEmitter]
  }
}

