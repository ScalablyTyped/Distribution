package typings.awsSdk.alexaforbusinessMod

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
  
  extension [Self <: GetAddressBookRequest](x: Self) {
    
    inline def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
  }
}
