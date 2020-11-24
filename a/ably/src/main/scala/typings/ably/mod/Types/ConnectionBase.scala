package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionBase extends EventEmitter[connectionEventCallback, ConnectionStateChange, ConnectionEvent, ConnectionState] {
  
  def close(): Unit = js.native
  
  def connect(): Unit = js.native
  
  var errorReason: ErrorInfo = js.native
  
  var id: String = js.native
  
  var key: String = js.native
  
  var recoveryKey: String = js.native
  
  var serial: Double = js.native
  
  var state: ConnectionState = js.native
}
