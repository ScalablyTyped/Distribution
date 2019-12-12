package typings.amazonDashConnectDashStreams.connect

import org.scalablytyped.runtime.TopLevel
import typings.amazonDashConnectDashStreams.connect.ContactStateType.CONNECTED
import typings.amazonDashConnectDashStreams.connect.ContactStateType.CONNECTING
import typings.amazonDashConnectDashStreams.connect.ContactStateType.ENDED
import typings.amazonDashConnectDashStreams.connect.ContactStateType.ERROR
import typings.amazonDashConnectDashStreams.connect.ContactStateType.INCOMING
import typings.amazonDashConnectDashStreams.connect.ContactStateType.INIT
import typings.amazonDashConnectDashStreams.connect.ContactStateType.MISSED
import typings.amazonDashConnectDashStreams.connect.ContactStateType.PENDING
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContactStateType with String] = js.native
  /* "connected" */ @js.native
  object CONNECTED extends TopLevel[CONNECTED with String]
  
  /* "connecting" */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with String]
  
  /* "ended" */ @js.native
  object ENDED extends TopLevel[ENDED with String]
  
  /* "error" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  /* "incoming" */ @js.native
  object INCOMING extends TopLevel[INCOMING with String]
  
  /* "init" */ @js.native
  object INIT extends TopLevel[INIT with String]
  
  /* "missed" */ @js.native
  object MISSED extends TopLevel[MISSED with String]
  
  /* "pending" */ @js.native
  object PENDING extends TopLevel[PENDING with String]
  
}

