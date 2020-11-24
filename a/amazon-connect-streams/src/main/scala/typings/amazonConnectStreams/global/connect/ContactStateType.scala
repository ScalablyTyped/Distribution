package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration listing the different high-level states that a contact can have. */
@JSGlobal("connect.ContactStateType")
@js.native
object ContactStateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ContactStateType with String] = js.native
  
  /* "connected" */ val CONNECTED: typings.amazonConnectStreams.connect.ContactStateType.CONNECTED with String = js.native
  
  /* "connecting" */ val CONNECTING: typings.amazonConnectStreams.connect.ContactStateType.CONNECTING with String = js.native
  
  /* "ended" */ val ENDED: typings.amazonConnectStreams.connect.ContactStateType.ENDED with String = js.native
  
  /* "error" */ val ERROR: typings.amazonConnectStreams.connect.ContactStateType.ERROR with String = js.native
  
  /* "incoming" */ val INCOMING: typings.amazonConnectStreams.connect.ContactStateType.INCOMING with String = js.native
  
  /* "init" */ val INIT: typings.amazonConnectStreams.connect.ContactStateType.INIT with String = js.native
  
  /* "missed" */ val MISSED: typings.amazonConnectStreams.connect.ContactStateType.MISSED with String = js.native
  
  /* "pending" */ val PENDING: typings.amazonConnectStreams.connect.ContactStateType.PENDING with String = js.native
}
