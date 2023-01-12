package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelContactRequest extends StObject {
  
  /**
    * UUID of a contact.
    */
  var contactId: Uuid
}
object CancelContactRequest {
  
  inline def apply(contactId: Uuid): CancelContactRequest = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelContactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelContactRequest] (val x: Self) extends AnyVal {
    
    inline def setContactId(value: Uuid): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
  }
}
