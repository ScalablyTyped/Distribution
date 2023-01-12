package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddressBookResponse extends StObject {
  
  /**
    * The ARN of the newly created address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.undefined
}
object CreateAddressBookResponse {
  
  inline def apply(): CreateAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAddressBookResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAddressBookResponse] (val x: Self) extends AnyVal {
    
    inline def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
    
    inline def setAddressBookArnUndefined: Self = StObject.set(x, "AddressBookArn", js.undefined)
  }
}
