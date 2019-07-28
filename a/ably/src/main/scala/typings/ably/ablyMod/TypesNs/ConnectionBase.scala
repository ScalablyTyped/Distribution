package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionBase extends EventEmitter[connectionEventCallback, ConnectionStateChange, ConnectionEvent, ConnectionState] {
  var errorReason: ErrorInfo = js.native
  var id: String = js.native
  var key: String = js.native
  var recoveryKey: String = js.native
  var serial: Double = js.native
  var state: ConnectionState = js.native
  def close(): Unit = js.native
  def connect(): Unit = js.native
}

