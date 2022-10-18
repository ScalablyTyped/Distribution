package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAddressBookRequest extends StObject {
  
  /**
    * The ARN of the address book to delete.
    */
  var AddressBookArn: Arn
}
object DeleteAddressBookRequest {
  
  inline def apply(AddressBookArn: Arn): DeleteAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAddressBookRequest]
  }
  
  extension [Self <: DeleteAddressBookRequest](x: Self) {
    
    inline def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
  }
}
