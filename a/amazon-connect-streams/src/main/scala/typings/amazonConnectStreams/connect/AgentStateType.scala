package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AgentStateType with String] = js.native
  /* "init" */ @js.native
  object INIT extends TopLevel[INIT with String]
  
  /* "not_routable" */ @js.native
  object NOT_ROUTABLE extends TopLevel[NOT_ROUTABLE with String]
  
  /* "offline" */ @js.native
  object OFFLINE extends TopLevel[OFFLINE with String]
  
  /* "routable" */ @js.native
  object ROUTABLE extends TopLevel[ROUTABLE with String]
  
}

