package typings.amazonDashConnectDashStreams.connect

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CONTACT_ACTIVE_STATES extends js.Object

@JSGlobal("connect.CONTACT_ACTIVE_STATES")
@js.native
object CONTACT_ACTIVE_STATES extends js.Object {
  @js.native
  sealed trait CONNECTED extends CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait CONNECTING extends CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait INCOMING extends CONTACT_ACTIVE_STATES
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CONTACT_ACTIVE_STATES with String] = js.native
  /* "connected" */ @js.native
  object CONNECTED extends TopLevel[CONNECTED with String]
  
  /* "connecting" */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with String]
  
  /* "incoming" */ @js.native
  object INCOMING extends TopLevel[INCOMING with String]
  
}

