package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddressBookRequest extends StObject {
  
  /**
    * A unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * The description of the address book.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.undefined
  
  /**
    * The name of the address book.
    */
  var Name: AddressBookName
}
object CreateAddressBookRequest {
  
  @scala.inline
  def apply(Name: AddressBookName): CreateAddressBookRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressBookRequest]
  }
  
  @scala.inline
  implicit class CreateAddressBookRequestMutableBuilder[Self <: CreateAddressBookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setDescription(value: AddressBookDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: AddressBookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
