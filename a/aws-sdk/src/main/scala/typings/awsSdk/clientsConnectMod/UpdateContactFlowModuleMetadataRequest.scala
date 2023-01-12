package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactFlowModuleMetadataRequest extends StObject {
  
  /**
    * The identifier of the flow module.
    */
  var ContactFlowModuleId: typings.awsSdk.clientsConnectMod.ContactFlowModuleId
  
  /**
    * The description of the flow module.
    */
  var Description: js.UndefOr[ContactFlowModuleDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the flow module.
    */
  var Name: js.UndefOr[ContactFlowModuleName] = js.undefined
  
  /**
    * The state of flow module.
    */
  var State: js.UndefOr[ContactFlowModuleState] = js.undefined
}
object UpdateContactFlowModuleMetadataRequest {
  
  inline def apply(ContactFlowModuleId: ContactFlowModuleId, InstanceId: InstanceId): UpdateContactFlowModuleMetadataRequest = {
    val __obj = js.Dynamic.literal(ContactFlowModuleId = ContactFlowModuleId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactFlowModuleMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContactFlowModuleMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setContactFlowModuleId(value: ContactFlowModuleId): Self = StObject.set(x, "ContactFlowModuleId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ContactFlowModuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ContactFlowModuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: ContactFlowModuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
