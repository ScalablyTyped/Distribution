package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactType extends StObject
/** This enumeration lists all of the contact types supported by Connect Streams. */
@JSGlobal("connect.ContactType")
@js.native
object ContactType extends StObject {
  
  /** Chat contact. */
  @js.native
  sealed trait CHAT
    extends StObject
       with ContactType
  
  /**
    * Special outbound voice calls which are routed to agents before being placed.
    * For more information about how to setup and use queued callbacks, see the Amazon Connect user documentation.
    */
  @js.native
  sealed trait QUEUE_CALLBACK
    extends StObject
       with ContactType
  
  /** Normal incoming and outgoing voice calls. */
  @js.native
  sealed trait VOICE
    extends StObject
       with ContactType
}
