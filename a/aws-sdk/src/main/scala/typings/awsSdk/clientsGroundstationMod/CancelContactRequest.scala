package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelContactRequest extends StObject {
  
  /**
    * UUID of a contact.
    */
  var contactId: String
}
object CancelContactRequest {
  
  inline def apply(contactId: String): CancelContactRequest = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelContactRequest]
  }
  
  extension [Self <: CancelContactRequest](x: Self) {
    
    inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
  }
}
