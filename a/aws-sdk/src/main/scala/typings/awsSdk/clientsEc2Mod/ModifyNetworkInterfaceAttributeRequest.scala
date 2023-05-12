package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyNetworkInterfaceAttributeRequest extends StObject {
  
  /**
    * Information about the interface attachment. If modifying the delete on termination attribute, you must specify the ID of the interface attachment.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachmentChanges] = js.undefined
  
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Updates the ENA Express configuration for the network interface that’s attached to the instance.
    */
  var EnaSrdSpecification: js.UndefOr[typings.awsSdk.clientsEc2Mod.EnaSrdSpecification] = js.undefined
  
  /**
    * Changes the security groups for the network interface. The new set of groups you specify replaces the current set. You must specify at least one group, even if it's just the default security group in the VPC. You must specify the ID of the security group, not the name.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.clientsEc2Mod.NetworkInterfaceId
  
  /**
    * Enable or disable source/destination checks, which ensure that the instance is either the source or the destination of any traffic that it receives. If the value is true, source/destination checks are enabled; otherwise, they are disabled. The default value is true. You must disable source/destination checks if the instance runs services such as network address translation, routing, or firewalls.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
}
object ModifyNetworkInterfaceAttributeRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId): ModifyNetworkInterfaceAttributeRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyNetworkInterfaceAttributeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyNetworkInterfaceAttributeRequest] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: NetworkInterfaceAttachmentChanges): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setDescription(value: AttributeValue): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEnaSrdSpecification(value: EnaSrdSpecification): Self = StObject.set(x, "EnaSrdSpecification", value.asInstanceOf[js.Any])
    
    inline def setEnaSrdSpecificationUndefined: Self = StObject.set(x, "EnaSrdSpecification", js.undefined)
    
    inline def setGroups(value: SecurityGroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheck(value: AttributeBooleanValue): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
  }
}
