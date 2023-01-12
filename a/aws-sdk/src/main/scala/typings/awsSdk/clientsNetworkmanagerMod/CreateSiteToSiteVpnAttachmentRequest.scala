package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSiteToSiteVpnAttachmentRequest extends StObject {
  
  /**
    * The client token associated with the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ClientToken] = js.undefined
  
  /**
    * The ID of a core network where you're creating a site-to-site VPN attachment.
    */
  var CoreNetworkId: typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId
  
  /**
    * The tags associated with the request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN identifying the VPN attachment.
    */
  var VpnConnectionArn: typings.awsSdk.clientsNetworkmanagerMod.VpnConnectionArn
}
object CreateSiteToSiteVpnAttachmentRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId, VpnConnectionArn: VpnConnectionArn): CreateSiteToSiteVpnAttachmentRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any], VpnConnectionArn = VpnConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSiteToSiteVpnAttachmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSiteToSiteVpnAttachmentRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpnConnectionArn(value: VpnConnectionArn): Self = StObject.set(x, "VpnConnectionArn", value.asInstanceOf[js.Any])
  }
}
