package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactStateType extends js.Object

@JSGlobal("connect.ContactStateType")
@js.native
object ContactStateType extends js.Object {
  @js.native
  sealed trait CONNECTED
    extends amazonDashConnectDashStreamsLib.connectNs.ContactStateType
  
  @js.native
  sealed trait CONNECTING
    extends amazonDashConnectDashStreamsLib.connectNs.ContactStateType
  
  @js.native
  sealed trait ENDED
    extends amazonDashConnectDashStreamsLib.connectNs.ContactStateType
  
  @js.native
  sealed trait ERROR
    extends amazonDashConnectDashStreamsLib.connectNs.ContactStateType
  
  @js.native
  sealed trait INCOMING
    extends amazonDashConnectDashStreamsLib.connectNs.ContactStateType
  
  @js.native
  sealed trait INIT
    extends amazonDashConnectDashStreamsLib.connectNs.ContactStateType
  
  @js.native
  sealed trait MISSED
    extends amazonDashConnectDashStreamsLib.connectNs.ContactStateType
  
  @js.native
  sealed trait PENDING
    extends amazonDashConnectDashStreamsLib.connectNs.ContactStateType
  
  /* "connected" */ val CONNECTED: CONNECTED with java.lang.String = js.native
  /* "connecting" */ val CONNECTING: CONNECTING with java.lang.String = js.native
  /* "ended" */ val ENDED: ENDED with java.lang.String = js.native
  /* "error" */ val ERROR: ERROR with java.lang.String = js.native
  /* "incoming" */ val INCOMING: INCOMING with java.lang.String = js.native
  /* "init" */ val INIT: INIT with java.lang.String = js.native
  /* "missed" */ val MISSED: MISSED with java.lang.String = js.native
  /* "pending" */ val PENDING: PENDING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amazonDashConnectDashStreamsLib.connectNs.ContactStateType with java.lang.String] = js.native
}

