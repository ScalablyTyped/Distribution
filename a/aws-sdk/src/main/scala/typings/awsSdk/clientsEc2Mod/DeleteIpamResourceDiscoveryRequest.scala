package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpamResourceDiscoveryRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPAM resource discovery ID.
    */
  var IpamResourceDiscoveryId: typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryId
}
object DeleteIpamResourceDiscoveryRequest {
  
  inline def apply(IpamResourceDiscoveryId: IpamResourceDiscoveryId): DeleteIpamResourceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(IpamResourceDiscoveryId = IpamResourceDiscoveryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIpamResourceDiscoveryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIpamResourceDiscoveryRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamResourceDiscoveryId(value: IpamResourceDiscoveryId): Self = StObject.set(x, "IpamResourceDiscoveryId", value.asInstanceOf[js.Any])
  }
}
