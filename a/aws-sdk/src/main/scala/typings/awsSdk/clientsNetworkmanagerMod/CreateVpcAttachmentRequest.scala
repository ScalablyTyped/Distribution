package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcAttachmentRequest extends StObject {
  
  /**
    * The client token associated with the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ClientToken] = js.undefined
  
  /**
    * The ID of a core network for the VPC attachment.
    */
  var CoreNetworkId: typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId
  
  /**
    * Options for the VPC attachment.
    */
  var Options: js.UndefOr[VpcOptions] = js.undefined
  
  /**
    * The subnet ARN of the VPC attachment.
    */
  var SubnetArns: SubnetArnList
  
  /**
    * The key-value tags associated with the request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN of the VPC.
    */
  var VpcArn: typings.awsSdk.clientsNetworkmanagerMod.VpcArn
}
object CreateVpcAttachmentRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId, SubnetArns: SubnetArnList, VpcArn: VpcArn): CreateVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any], SubnetArns = SubnetArns.asInstanceOf[js.Any], VpcArn = VpcArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcAttachmentRequest]
  }
  
  extension [Self <: CreateVpcAttachmentRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: VpcOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setSubnetArns(value: SubnetArnList): Self = StObject.set(x, "SubnetArns", value.asInstanceOf[js.Any])
    
    inline def setSubnetArnsVarargs(value: SubnetArn*): Self = StObject.set(x, "SubnetArns", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcArn(value: VpcArn): Self = StObject.set(x, "VpcArn", value.asInstanceOf[js.Any])
  }
}
