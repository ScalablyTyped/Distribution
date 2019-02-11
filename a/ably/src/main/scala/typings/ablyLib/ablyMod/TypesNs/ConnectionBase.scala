package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionBase extends EventEmitter[connectionEventCallback, ConnectionStateChange, ConnectionEvent, ConnectionState] {
  var errorReason: ErrorInfo = js.native
  var id: java.lang.String = js.native
  var key: java.lang.String = js.native
  var recoveryKey: java.lang.String = js.native
  var serial: scala.Double = js.native
  var state: ConnectionState = js.native
  def close(): scala.Unit = js.native
  def connect(): scala.Unit = js.native
}

