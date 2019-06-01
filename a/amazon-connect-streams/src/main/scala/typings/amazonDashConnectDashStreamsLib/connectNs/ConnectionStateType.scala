package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionStateType extends js.Object

@JSGlobal("connect.ConnectionStateType")
@js.native
object ConnectionStateType extends js.Object {
  @js.native
  sealed trait CONNECTED
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionStateType
  
  @js.native
  sealed trait CONNECTING
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionStateType
  
  @js.native
  sealed trait DISCONNECTED
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionStateType
  
  @js.native
  sealed trait HOLD
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionStateType
  
  @js.native
  sealed trait INIT
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionStateType
  
  /* "connected" */ val CONNECTED: CONNECTED with java.lang.String = js.native
  /* "connecting" */ val CONNECTING: CONNECTING with java.lang.String = js.native
  /* "disconnected" */ val DISCONNECTED: DISCONNECTED with java.lang.String = js.native
  /* "hold" */ val HOLD: HOLD with java.lang.String = js.native
  /* "init" */ val INIT: INIT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    amazonDashConnectDashStreamsLib.connectNs.ConnectionStateType with java.lang.String
  ] = js.native
}

