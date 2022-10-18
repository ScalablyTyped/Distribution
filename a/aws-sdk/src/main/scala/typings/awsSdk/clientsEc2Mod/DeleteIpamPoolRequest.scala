package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpamPoolRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the pool to delete.
    */
  var IpamPoolId: typings.awsSdk.clientsEc2Mod.IpamPoolId
}
object DeleteIpamPoolRequest {
  
  inline def apply(IpamPoolId: IpamPoolId): DeleteIpamPoolRequest = {
    val __obj = js.Dynamic.literal(IpamPoolId = IpamPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIpamPoolRequest]
  }
  
  extension [Self <: DeleteIpamPoolRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
  }
}
