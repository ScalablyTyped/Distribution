package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayConnectPeerRequest extends StObject {
  
  /**
    * The BGP options for the Connect peer.
    */
  var BgpOptions: js.UndefOr[TransitGatewayConnectRequestBgpOptions] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR block from the 169.254.0.0/16 range. The first address from the range must be configured on the appliance as the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the fd00::/8 range.
    */
  var InsideCidrBlocks: InsideCidrBlocksStringList
  
  /**
    * The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.
    */
  var PeerAddress: String
  
  /**
    * The tags to apply to the Connect peer.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first available IP address from the transit gateway CIDR block.
    */
  var TransitGatewayAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Connect attachment.
    */
  var TransitGatewayAttachmentId: typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId
}
object CreateTransitGatewayConnectPeerRequest {
  
  inline def apply(
    InsideCidrBlocks: InsideCidrBlocksStringList,
    PeerAddress: String,
    TransitGatewayAttachmentId: TransitGatewayAttachmentId
  ): CreateTransitGatewayConnectPeerRequest = {
    val __obj = js.Dynamic.literal(InsideCidrBlocks = InsideCidrBlocks.asInstanceOf[js.Any], PeerAddress = PeerAddress.asInstanceOf[js.Any], TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayConnectPeerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTransitGatewayConnectPeerRequest] (val x: Self) extends AnyVal {
    
    inline def setBgpOptions(value: TransitGatewayConnectRequestBgpOptions): Self = StObject.set(x, "BgpOptions", value.asInstanceOf[js.Any])
    
    inline def setBgpOptionsUndefined: Self = StObject.set(x, "BgpOptions", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInsideCidrBlocks(value: InsideCidrBlocksStringList): Self = StObject.set(x, "InsideCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setInsideCidrBlocksVarargs(value: String*): Self = StObject.set(x, "InsideCidrBlocks", js.Array(value*))
    
    inline def setPeerAddress(value: String): Self = StObject.set(x, "PeerAddress", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTransitGatewayAddress(value: String): Self = StObject.set(x, "TransitGatewayAddress", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAddressUndefined: Self = StObject.set(x, "TransitGatewayAddress", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
  }
}
