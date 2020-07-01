package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactType extends js.Object

/** This enumeration lists all of the contact types supported by Connect Streams. */
@JSGlobal("connect.ContactType")
@js.native
object ContactType extends js.Object {
  /** Chat contact. */
  @js.native
  sealed trait CHAT extends ContactType
  
  /**
    * Special outbound voice calls which are routed to agents before being placed.
    * For more information about how to setup and use queued callbacks, see the Amazon Connect user documentation.
    */
  @js.native
  sealed trait QUEUE_CALLBACK extends ContactType
  
  /** Normal incoming and outgoing voice calls. */
  @js.native
  sealed trait VOICE extends ContactType
  
}

