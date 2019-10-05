package typings.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentStateType extends js.Object

@JSGlobal("connect.AgentStateType")
@js.native
object AgentStateType extends js.Object {
  @js.native
  sealed trait INIT extends AgentStateType
  
  @js.native
  sealed trait NOT_ROUTABLE extends AgentStateType
  
  @js.native
  sealed trait OFFLINE extends AgentStateType
  
  @js.native
  sealed trait ROUTABLE extends AgentStateType
  
  /* "init" */ val INIT: typings.amazonDashConnectDashStreams.connect.AgentStateType.INIT with String = js.native
  /* "not_routable" */ val NOT_ROUTABLE: typings.amazonDashConnectDashStreams.connect.AgentStateType.NOT_ROUTABLE with String = js.native
  /* "offline" */ val OFFLINE: typings.amazonDashConnectDashStreams.connect.AgentStateType.OFFLINE with String = js.native
  /* "routable" */ val ROUTABLE: typings.amazonDashConnectDashStreams.connect.AgentStateType.ROUTABLE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AgentStateType with String] = js.native
}

