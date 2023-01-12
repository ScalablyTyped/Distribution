package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectPeerRequest extends StObject {
  
  /**
    * The Connect peer BGP options.
    */
  var BgpOptions: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.BgpOptions] = js.undefined
  
  /**
    * The client token associated with the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ClientToken] = js.undefined
  
  /**
    * The ID of the connection attachment.
    */
  var ConnectAttachmentId: AttachmentId
  
  /**
    * A Connect peer core network address.
    */
  var CoreNetworkAddress: js.UndefOr[IPAddress] = js.undefined
  
  /**
    * The inside IP addresses used for BGP peering.
    */
  var InsideCidrBlocks: ConstrainedStringList
  
  /**
    * The Connect peer address.
    */
  var PeerAddress: IPAddress
  
  /**
    * The tags associated with the peer request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateConnectPeerRequest {
  
  inline def apply(ConnectAttachmentId: AttachmentId, InsideCidrBlocks: ConstrainedStringList, PeerAddress: IPAddress): CreateConnectPeerRequest = {
    val __obj = js.Dynamic.literal(ConnectAttachmentId = ConnectAttachmentId.asInstanceOf[js.Any], InsideCidrBlocks = InsideCidrBlocks.asInstanceOf[js.Any], PeerAddress = PeerAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectPeerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConnectPeerRequest] (val x: Self) extends AnyVal {
    
    inline def setBgpOptions(value: BgpOptions): Self = StObject.set(x, "BgpOptions", value.asInstanceOf[js.Any])
    
    inline def setBgpOptionsUndefined: Self = StObject.set(x, "BgpOptions", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setConnectAttachmentId(value: AttachmentId): Self = StObject.set(x, "ConnectAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkAddress(value: IPAddress): Self = StObject.set(x, "CoreNetworkAddress", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkAddressUndefined: Self = StObject.set(x, "CoreNetworkAddress", js.undefined)
    
    inline def setInsideCidrBlocks(value: ConstrainedStringList): Self = StObject.set(x, "InsideCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setInsideCidrBlocksVarargs(value: ConstrainedString*): Self = StObject.set(x, "InsideCidrBlocks", js.Array(value*))
    
    inline def setPeerAddress(value: IPAddress): Self = StObject.set(x, "PeerAddress", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
