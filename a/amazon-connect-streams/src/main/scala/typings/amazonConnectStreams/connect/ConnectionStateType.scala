package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionStateType with String] = js.native
  /* "connected" */ @js.native
  object CONNECTED extends TopLevel[CONNECTED with String]
  
  /* "connecting" */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with String]
  
  /* "disconnected" */ @js.native
  object DISCONNECTED extends TopLevel[DISCONNECTED with String]
  
  /* "hold" */ @js.native
  object HOLD extends TopLevel[HOLD with String]
  
  /* "init" */ @js.native
  object INIT extends TopLevel[INIT with String]
  
}

