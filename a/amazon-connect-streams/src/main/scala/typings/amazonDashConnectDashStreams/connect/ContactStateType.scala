package typings.amazonDashConnectDashStreams.connect

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
  
  /* "connected" */ val CONNECTED: typings.amazonDashConnectDashStreams.connect.ContactStateType.CONNECTED with String = js.native
  /* "connecting" */ val CONNECTING: typings.amazonDashConnectDashStreams.connect.ContactStateType.CONNECTING with String = js.native
  /* "ended" */ val ENDED: typings.amazonDashConnectDashStreams.connect.ContactStateType.ENDED with String = js.native
  /* "error" */ val ERROR: typings.amazonDashConnectDashStreams.connect.ContactStateType.ERROR with String = js.native
  /* "incoming" */ val INCOMING: typings.amazonDashConnectDashStreams.connect.ContactStateType.INCOMING with String = js.native
  /* "init" */ val INIT: typings.amazonDashConnectDashStreams.connect.ContactStateType.INIT with String = js.native
  /* "missed" */ val MISSED: typings.amazonDashConnectDashStreams.connect.ContactStateType.MISSED with String = js.native
  /* "pending" */ val PENDING: typings.amazonDashConnectDashStreams.connect.ContactStateType.PENDING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContactStateType with String] = js.native
}

