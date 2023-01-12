package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoipCidrRequest extends StObject {
  
  /**
    *  A customer-owned IP address range that you want to delete. 
    */
  var Cidr: String
  
  /**
    *  The ID of the customer-owned address pool. 
    */
  var CoipPoolId: Ipv4PoolCoipId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DeleteCoipCidrRequest {
  
  inline def apply(Cidr: String, CoipPoolId: Ipv4PoolCoipId): DeleteCoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], CoipPoolId = CoipPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoipCidrRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCoipCidrRequest] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCoipPoolId(value: Ipv4PoolCoipId): Self = StObject.set(x, "CoipPoolId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
