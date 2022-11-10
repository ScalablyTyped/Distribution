package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactRequest extends StObject {
  
  /**
    * UUID of a contact.
    */
  var contactId: Uuid
}
object DescribeContactRequest {
  
  inline def apply(contactId: Uuid): DescribeContactRequest = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContactRequest]
  }
  
  extension [Self <: DescribeContactRequest](x: Self) {
    
    inline def setContactId(value: Uuid): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
  }
}
