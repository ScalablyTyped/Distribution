package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentStateType extends js.Object

@JSGlobal("connect.AgentStateType")
@js.native
object AgentStateType extends js.Object {
  @js.native
  sealed trait INIT
    extends amazonDashConnectDashStreamsLib.connectNs.AgentStateType
  
  @js.native
  sealed trait NOT_ROUTABLE
    extends amazonDashConnectDashStreamsLib.connectNs.AgentStateType
  
  @js.native
  sealed trait OFFLINE
    extends amazonDashConnectDashStreamsLib.connectNs.AgentStateType
  
  @js.native
  sealed trait ROUTABLE
    extends amazonDashConnectDashStreamsLib.connectNs.AgentStateType
  
  /* "init" */ val INIT: INIT with java.lang.String = js.native
  /* "not_routable" */ val NOT_ROUTABLE: NOT_ROUTABLE with java.lang.String = js.native
  /* "offline" */ val OFFLINE: OFFLINE with java.lang.String = js.native
  /* "routable" */ val ROUTABLE: ROUTABLE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amazonDashConnectDashStreamsLib.connectNs.AgentStateType with java.lang.String] = js.native
}

