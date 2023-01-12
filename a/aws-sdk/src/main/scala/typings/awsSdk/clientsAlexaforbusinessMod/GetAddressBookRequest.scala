package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAddressBookRequest extends StObject {
  
  /**
    * The ARN of the address book for which to request details.
    */
  var AddressBookArn: Arn
}
object GetAddressBookRequest {
  
  inline def apply(AddressBookArn: Arn): GetAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAddressBookRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAddressBookRequest] (val x: Self) extends AnyVal {
    
    inline def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
  }
}
