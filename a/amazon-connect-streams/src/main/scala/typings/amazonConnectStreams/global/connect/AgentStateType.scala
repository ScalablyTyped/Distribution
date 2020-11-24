package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration lists the different types of agent states. */
@JSGlobal("connect.AgentStateType")
@js.native
object AgentStateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.AgentStateType with String] = js.native
  
  /* "init" */ val INIT: typings.amazonConnectStreams.connect.AgentStateType.INIT with String = js.native
  
  /* "not_routable" */ val NOT_ROUTABLE: typings.amazonConnectStreams.connect.AgentStateType.NOT_ROUTABLE with String = js.native
  
  /* "offline" */ val OFFLINE: typings.amazonConnectStreams.connect.AgentStateType.OFFLINE with String = js.native
  
  /* "routable" */ val ROUTABLE: typings.amazonConnectStreams.connect.AgentStateType.ROUTABLE with String = js.native
}
