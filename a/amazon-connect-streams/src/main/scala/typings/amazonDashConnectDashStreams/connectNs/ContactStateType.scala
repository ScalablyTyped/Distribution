package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactStateType extends js.Object

@JSGlobal("connect.ContactStateType")
@js.native
object ContactStateType extends js.Object {
  @js.native
  sealed trait CONNECTED extends ContactStateType
  
  @js.native
  sealed trait CONNECTING extends ContactStateType
  
  @js.native
  sealed trait ENDED extends ContactStateType
  
  @js.native
  sealed trait ERROR extends ContactStateType
  
  @js.native
  sealed trait INCOMING extends ContactStateType
  
  @js.native
  sealed trait INIT extends ContactStateType
  
  @js.native
  sealed trait MISSED extends ContactStateType
  
  @js.native
  sealed trait PENDING extends ContactStateType
  
  /* "connected" */ val CONNECTED: typings.amazonDashConnectDashStreams.connectNs.ContactStateType.CONNECTED with String = js.native
  /* "connecting" */ val CONNECTING: typings.amazonDashConnectDashStreams.connectNs.ContactStateType.CONNECTING with String = js.native
  /* "ended" */ val ENDED: typings.amazonDashConnectDashStreams.connectNs.ContactStateType.ENDED with String = js.native
  /* "error" */ val ERROR: typings.amazonDashConnectDashStreams.connectNs.ContactStateType.ERROR with String = js.native
  /* "incoming" */ val INCOMING: typings.amazonDashConnectDashStreams.connectNs.ContactStateType.INCOMING with String = js.native
  /* "init" */ val INIT: typings.amazonDashConnectDashStreams.connectNs.ContactStateType.INIT with String = js.native
  /* "missed" */ val MISSED: typings.amazonDashConnectDashStreams.connectNs.ContactStateType.MISSED with String = js.native
  /* "pending" */ val PENDING: typings.amazonDashConnectDashStreams.connectNs.ContactStateType.PENDING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContactStateType with String] = js.native
}

