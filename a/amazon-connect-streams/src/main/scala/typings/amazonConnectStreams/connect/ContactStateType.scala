package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactStateType extends js.Object
/** An enumeration listing the different high-level states that a contact can have. */
@JSGlobal("connect.ContactStateType")
@js.native
object ContactStateType extends js.Object {
  
  /** Indicates the contact is connected. */
  @js.native
  sealed trait CONNECTED extends ContactStateType
  
  /**
    * Indicates that the contact is currently connecting.
    * For `ContactType.VOICE` contacts, this is when the user will accept the incoming call.
    * For all other types, the contact will be accepted during the `ContactStateType.INCOMING` state.
    */
  @js.native
  sealed trait CONNECTING extends ContactStateType
  
  /** Indicates the contact has ended. */
  @js.native
  sealed trait ENDED extends ContactStateType
  
  /** Indicates the contact is in an error state. */
  @js.native
  sealed trait ERROR extends ContactStateType
  
  /**
    * Indicates that the contact is incoming and is waiting for acceptance.
    * This state is skipped for `ContactType.VOICE` contacts but is essential for `ContactType.QUEUE_CALLBACK` contacts.
    */
  @js.native
  sealed trait INCOMING extends ContactStateType
  
  /** Indicates the contact is being initialized. */
  @js.native
  sealed trait INIT extends ContactStateType
  
  /** Indicates the contact timed out before the agent could accept it. */
  @js.native
  sealed trait MISSED extends ContactStateType
  
  /** Indicates the contact is pending. */
  @js.native
  sealed trait PENDING extends ContactStateType
}
