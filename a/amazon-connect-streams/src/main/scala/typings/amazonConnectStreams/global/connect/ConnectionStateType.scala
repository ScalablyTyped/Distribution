package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration listing the different states that a connection can have. */
@JSGlobal("connect.ConnectionStateType")
@js.native
object ConnectionStateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ConnectionStateType with String] = js.native
  
  /* "connected" */ val CONNECTED: typings.amazonConnectStreams.connect.ConnectionStateType.CONNECTED with String = js.native
  
  /* "connecting" */ val CONNECTING: typings.amazonConnectStreams.connect.ConnectionStateType.CONNECTING with String = js.native
  
  /* "disconnected" */ val DISCONNECTED: typings.amazonConnectStreams.connect.ConnectionStateType.DISCONNECTED with String = js.native
  
  /* "hold" */ val HOLD: typings.amazonConnectStreams.connect.ConnectionStateType.HOLD with String = js.native
  
  /* "init" */ val INIT: typings.amazonConnectStreams.connect.ConnectionStateType.INIT with String = js.native
}
