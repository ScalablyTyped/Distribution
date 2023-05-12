package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactFlowModuleRequest extends StObject {
  
  /**
    * The identifier of the flow module.
    */
  var ContactFlowModuleId: typings.awsSdk.clientsConnectMod.ContactFlowModuleId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object DeleteContactFlowModuleRequest {
  
  inline def apply(ContactFlowModuleId: ContactFlowModuleId, InstanceId: InstanceId): DeleteContactFlowModuleRequest = {
    val __obj = js.Dynamic.literal(ContactFlowModuleId = ContactFlowModuleId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactFlowModuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteContactFlowModuleRequest] (val x: Self) extends AnyVal {
    
    inline def setContactFlowModuleId(value: ContactFlowModuleId): Self = StObject.set(x, "ContactFlowModuleId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
