package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactChannelResult extends StObject {
  
  /**
    * A Boolean value indicating if the contact channel has been activated or not.
    */
  var ActivationStatus: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.ActivationStatus] = js.undefined
  
  /**
    * The ARN of the contact that the channel belongs to.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The ARN of the contact channel.
    */
  var ContactChannelArn: SsmContactsArn
  
  /**
    * The details that Incident Manager uses when trying to engage the contact channel. 
    */
  var DeliveryAddress: ContactChannelAddress
  
  /**
    * The name of the contact channel
    */
  var Name: ChannelName
  
  /**
    * The type of contact channel. The type is SMS, VOICE, or EMAIL.
    */
  var Type: ChannelType
}
object GetContactChannelResult {
  
  inline def apply(
    ContactArn: SsmContactsArn,
    ContactChannelArn: SsmContactsArn,
    DeliveryAddress: ContactChannelAddress,
    Name: ChannelName,
    Type: ChannelType
  ): GetContactChannelResult = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any], ContactChannelArn = ContactChannelArn.asInstanceOf[js.Any], DeliveryAddress = DeliveryAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactChannelResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContactChannelResult] (val x: Self) extends AnyVal {
    
    inline def setActivationStatus(value: ActivationStatus): Self = StObject.set(x, "ActivationStatus", value.asInstanceOf[js.Any])
    
    inline def setActivationStatusUndefined: Self = StObject.set(x, "ActivationStatus", js.undefined)
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setContactChannelArn(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelArn", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddress(value: ContactChannelAddress): Self = StObject.set(x, "DeliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChannelType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
