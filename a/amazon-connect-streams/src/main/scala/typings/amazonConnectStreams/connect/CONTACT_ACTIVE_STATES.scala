package typings.amazonConnectStreams.connect

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
  
}

