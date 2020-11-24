package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionCallbacks extends ConnectionBase {
  
  def ping(): Unit = js.native
  def ping(callback: StandardCallback[Double]): Unit = js.native
  
  def whenState(targetState: ConnectionState, callback: connectionEventCallback): Unit = js.native
}
