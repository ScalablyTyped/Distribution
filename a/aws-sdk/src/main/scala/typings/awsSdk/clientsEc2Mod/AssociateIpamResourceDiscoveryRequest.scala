package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateIpamResourceDiscoveryRequest extends StObject {
  
  /**
    * A client token.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An IPAM ID.
    */
  var IpamId: typings.awsSdk.clientsEc2Mod.IpamId
  
  /**
    * A resource discovery ID.
    */
  var IpamResourceDiscoveryId: typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryId
  
  /**
    * Tag specifications.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object AssociateIpamResourceDiscoveryRequest {
  
  inline def apply(IpamId: IpamId, IpamResourceDiscoveryId: IpamResourceDiscoveryId): AssociateIpamResourceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(IpamId = IpamId.asInstanceOf[js.Any], IpamResourceDiscoveryId = IpamResourceDiscoveryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateIpamResourceDiscoveryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateIpamResourceDiscoveryRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamId(value: IpamId): Self = StObject.set(x, "IpamId", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryId(value: IpamResourceDiscoveryId): Self = StObject.set(x, "IpamResourceDiscoveryId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
