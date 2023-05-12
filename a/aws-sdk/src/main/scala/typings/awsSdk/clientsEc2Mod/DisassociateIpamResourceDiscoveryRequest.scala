package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateIpamResourceDiscoveryRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A resource discovery association ID.
    */
  var IpamResourceDiscoveryAssociationId: typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryAssociationId
}
object DisassociateIpamResourceDiscoveryRequest {
  
  inline def apply(IpamResourceDiscoveryAssociationId: IpamResourceDiscoveryAssociationId): DisassociateIpamResourceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(IpamResourceDiscoveryAssociationId = IpamResourceDiscoveryAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateIpamResourceDiscoveryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateIpamResourceDiscoveryRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamResourceDiscoveryAssociationId(value: IpamResourceDiscoveryAssociationId): Self = StObject.set(x, "IpamResourceDiscoveryAssociationId", value.asInstanceOf[js.Any])
  }
}
