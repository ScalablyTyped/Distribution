package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePhoneNumberContactFlowRequest extends StObject {
  
  /**
    * The identifier of the flow.
    */
  var ContactFlowId: typings.awsSdk.clientsConnectMod.ContactFlowId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: typings.awsSdk.clientsConnectMod.PhoneNumberId
}
object AssociatePhoneNumberContactFlowRequest {
  
  inline def apply(ContactFlowId: ContactFlowId, InstanceId: InstanceId, PhoneNumberId: PhoneNumberId): AssociatePhoneNumberContactFlowRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePhoneNumberContactFlowRequest]
  }
  
  extension [Self <: AssociatePhoneNumberContactFlowRequest](x: Self) {
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
