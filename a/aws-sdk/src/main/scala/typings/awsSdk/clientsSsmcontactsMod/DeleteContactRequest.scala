package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact that you're deleting.
    */
  var ContactId: SsmContactsArn
}
object DeleteContactRequest {
  
  inline def apply(ContactId: SsmContactsArn): DeleteContactRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteContactRequest] (val x: Self) extends AnyVal {
    
    inline def setContactId(value: SsmContactsArn): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
  }
}
