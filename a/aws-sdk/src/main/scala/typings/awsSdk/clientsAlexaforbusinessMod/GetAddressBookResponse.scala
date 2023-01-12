package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAddressBookResponse extends StObject {
  
  /**
    * The details of the requested address book.
    */
  var AddressBook: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.AddressBook] = js.undefined
}
object GetAddressBookResponse {
  
  inline def apply(): GetAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAddressBookResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAddressBookResponse] (val x: Self) extends AnyVal {
    
    inline def setAddressBook(value: AddressBook): Self = StObject.set(x, "AddressBook", value.asInstanceOf[js.Any])
    
    inline def setAddressBookUndefined: Self = StObject.set(x, "AddressBook", js.undefined)
  }
}
