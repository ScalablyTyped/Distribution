package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorContactRequest extends StObject {
  
  /**
    * Specify which monitoring actions the user is allowed to take. For example, whether the user is allowed to escalate from silent monitoring to barge.
    */
  var AllowedMonitorCapabilities: js.UndefOr[typings.awsSdk.clientsConnectMod.AllowedMonitorCapabilities] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * The identifier of the contact.
    */
  var ContactId: typings.awsSdk.clientsConnectMod.ContactId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier of the user account.
    */
  var UserId: AgentResourceId
}
object MonitorContactRequest {
  
  inline def apply(ContactId: ContactId, InstanceId: InstanceId, UserId: AgentResourceId): MonitorContactRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorContactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorContactRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowedMonitorCapabilities(value: AllowedMonitorCapabilities): Self = StObject.set(x, "AllowedMonitorCapabilities", value.asInstanceOf[js.Any])
    
    inline def setAllowedMonitorCapabilitiesUndefined: Self = StObject.set(x, "AllowedMonitorCapabilities", js.undefined)
    
    inline def setAllowedMonitorCapabilitiesVarargs(value: MonitorCapability*): Self = StObject.set(x, "AllowedMonitorCapabilities", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: AgentResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
