package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcAttachmentRequest extends StObject {
  
  /**
    * Adds a subnet ARN to the VPC attachment.
    */
  var AddSubnetArns: js.UndefOr[SubnetArnList] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var AttachmentId: typings.awsSdk.clientsNetworkmanagerMod.AttachmentId
  
  /**
    * Additional options for updating the VPC attachment. 
    */
  var Options: js.UndefOr[VpcOptions] = js.undefined
  
  /**
    * Removes a subnet ARN from the attachment.
    */
  var RemoveSubnetArns: js.UndefOr[SubnetArnList] = js.undefined
}
object UpdateVpcAttachmentRequest {
  
  inline def apply(AttachmentId: AttachmentId): UpdateVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcAttachmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVpcAttachmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAddSubnetArns(value: SubnetArnList): Self = StObject.set(x, "AddSubnetArns", value.asInstanceOf[js.Any])
    
    inline def setAddSubnetArnsUndefined: Self = StObject.set(x, "AddSubnetArns", js.undefined)
    
    inline def setAddSubnetArnsVarargs(value: SubnetArn*): Self = StObject.set(x, "AddSubnetArns", js.Array(value*))
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: VpcOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setRemoveSubnetArns(value: SubnetArnList): Self = StObject.set(x, "RemoveSubnetArns", value.asInstanceOf[js.Any])
    
    inline def setRemoveSubnetArnsUndefined: Self = StObject.set(x, "RemoveSubnetArns", js.undefined)
    
    inline def setRemoveSubnetArnsVarargs(value: SubnetArn*): Self = StObject.set(x, "RemoveSubnetArns", js.Array(value*))
  }
}
