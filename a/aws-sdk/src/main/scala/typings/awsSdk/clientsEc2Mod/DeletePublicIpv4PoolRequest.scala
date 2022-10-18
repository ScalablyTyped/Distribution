package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePublicIpv4PoolRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the public IPv4 pool you want to delete.
    */
  var PoolId: Ipv4PoolEc2Id
}
object DeletePublicIpv4PoolRequest {
  
  inline def apply(PoolId: Ipv4PoolEc2Id): DeletePublicIpv4PoolRequest = {
    val __obj = js.Dynamic.literal(PoolId = PoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublicIpv4PoolRequest]
  }
  
  extension [Self <: DeletePublicIpv4PoolRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPoolId(value: Ipv4PoolEc2Id): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
  }
}
