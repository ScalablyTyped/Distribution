package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactStateType extends StObject
/** An enumeration listing the different high-level states that a contact can have. */
@JSGlobal("connect.ContactStateType")
@js.native
object ContactStateType extends StObject {
  
  /** Indicates the contact acw. */
  @js.native
  sealed trait ACW
    extends StObject
       with ContactStateType
  
  /** Indicates the contact has cleared. */
  @js.native
  sealed trait CLEARED
    extends StObject
       with ContactStateType
  
  /** Indicates the contact is connected. */
  @js.native
  sealed trait CONNECTED
    extends StObject
       with ContactStateType
  
  /**
    * Indicates that the contact is currently connecting.
    * For `ContactType.VOICE` contacts, this is when the user will accept the incoming call.
    * For all other types, the contact will be accepted during the `ContactStateType.INCOMING` state.
    */
  @js.native
  sealed trait CONNECTING
    extends StObject
       with ContactStateType
  
  /** Indicates the contact has ended. */
  @js.native
  sealed trait ENDED
    extends StObject
       with ContactStateType
  
  /** Indicates the contact is in an error state. */
  @js.native
  sealed trait ERROR
    extends StObject
       with ContactStateType
  
  /**
    * Indicates that the contact is incoming and is waiting for acceptance.
    * This state is skipped for `ContactType.VOICE` contacts but is essential for `ContactType.QUEUE_CALLBACK` contacts.
    */
  @js.native
  sealed trait INCOMING
    extends StObject
       with ContactStateType
  
  /** Indicates the contact is being initialized. */
  @js.native
  sealed trait INIT
    extends StObject
       with ContactStateType
  
  /** Indicates the contact timed out before the agent could accept it. */
  @js.native
  sealed trait MISSED
    extends StObject
       with ContactStateType
  
  /** Indicates the contact is pending. */
  @js.native
  sealed trait PENDING
    extends StObject
       with ContactStateType
  
  /** Indicates the contact is rejected */
  @js.native
  sealed trait REJECTED
    extends StObject
       with ContactStateType
}
