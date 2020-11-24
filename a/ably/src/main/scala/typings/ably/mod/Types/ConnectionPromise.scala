package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionPromise extends ConnectionBase {
  
  def ping(): js.Promise[Double] = js.native
  
  def whenState(targetState: ConnectionState): js.Promise[ConnectionStateChange] = js.native
}
