package typings.amazonDashConnectDashStreams.connectNs

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
  
  /* "connected" */ val CONNECTED: typings.amazonDashConnectDashStreams.connectNs.ConnectionStateType.CONNECTED with String = js.native
  /* "connecting" */ val CONNECTING: typings.amazonDashConnectDashStreams.connectNs.ConnectionStateType.CONNECTING with String = js.native
  /* "disconnected" */ val DISCONNECTED: typings.amazonDashConnectDashStreams.connectNs.ConnectionStateType.DISCONNECTED with String = js.native
  /* "hold" */ val HOLD: typings.amazonDashConnectDashStreams.connectNs.ConnectionStateType.HOLD with String = js.native
  /* "init" */ val INIT: typings.amazonDashConnectDashStreams.connectNs.ConnectionStateType.INIT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionStateType with String] = js.native
}

