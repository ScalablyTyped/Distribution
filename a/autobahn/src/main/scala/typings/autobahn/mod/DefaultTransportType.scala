package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.autobahn.autobahnStrings.websocket
  - typings.autobahn.autobahnStrings.longpoll
  - typings.autobahn.autobahnStrings.rawsocket
*/
trait DefaultTransportType extends js.Object

object DefaultTransportType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def longpoll: typings.autobahn.autobahnStrings.longpoll = this.cast("longpoll")
  @scala.inline
  def rawsocket: typings.autobahn.autobahnStrings.rawsocket = this.cast("rawsocket")
  @scala.inline
  def websocket: typings.autobahn.autobahnStrings.websocket = this.cast("websocket")
}

