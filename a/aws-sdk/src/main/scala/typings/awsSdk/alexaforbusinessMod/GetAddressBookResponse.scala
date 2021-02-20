package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAddressBookResponse extends StObject {
  
  /**
    * The details of the requested address book.
    */
  var AddressBook: js.UndefOr[typings.awsSdk.alexaforbusinessMod.AddressBook] = js.native
}
object GetAddressBookResponse {
  
  @scala.inline
  def apply(): GetAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAddressBookResponse]
  }
  
  @scala.inline
  implicit class GetAddressBookResponseMutableBuilder[Self <: GetAddressBookResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBook(value: AddressBook): Self = StObject.set(x, "AddressBook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressBookUndefined: Self = StObject.set(x, "AddressBook", js.undefined)
  }
}
