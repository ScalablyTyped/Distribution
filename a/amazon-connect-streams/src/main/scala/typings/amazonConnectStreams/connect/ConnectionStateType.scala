package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionStateType extends js.Object

@JSGlobal("connect.ConnectionStateType")
@js.native
object ConnectionStateType extends js.Object {
  @js.native
  sealed trait CONNECTED extends ConnectionStateType
  
  @js.native
  sealed trait CONNECTING extends ConnectionStateType
  
  @js.native
  sealed trait DISCONNECTED extends ConnectionStateType
  
  @js.native
  sealed trait HOLD extends ConnectionStateType
  
  @js.native
  sealed trait INIT extends ConnectionStateType
  
}

