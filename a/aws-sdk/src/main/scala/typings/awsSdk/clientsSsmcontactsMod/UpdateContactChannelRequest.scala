package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactChannelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel you want to update.
    */
  var ContactChannelId: SsmContactsArn
  
  /**
    * The details that Incident Manager uses when trying to engage the contact channel. 
    */
  var DeliveryAddress: js.UndefOr[ContactChannelAddress] = js.undefined
  
  /**
    * The name of the contact channel.
    */
  var Name: js.UndefOr[ChannelName] = js.undefined
}
object UpdateContactChannelRequest {
  
  inline def apply(ContactChannelId: SsmContactsArn): UpdateContactChannelRequest = {
    val __obj = js.Dynamic.literal(ContactChannelId = ContactChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContactChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setContactChannelId(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelId", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddress(value: ContactChannelAddress): Self = StObject.set(x, "DeliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddressUndefined: Self = StObject.set(x, "DeliveryAddress", js.undefined)
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
