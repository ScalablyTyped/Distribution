package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddressBookRequest extends StObject {
  
  /**
    * A unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * The description of the address book.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.undefined
  
  /**
    * The name of the address book.
    */
  var Name: AddressBookName
  
  /**
    * The tags to be added to the specified resource. Do not provide system tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAddressBookRequest {
  
  inline def apply(Name: AddressBookName): CreateAddressBookRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressBookRequest]
  }
  
  extension [Self <: CreateAddressBookRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: AddressBookDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: AddressBookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
