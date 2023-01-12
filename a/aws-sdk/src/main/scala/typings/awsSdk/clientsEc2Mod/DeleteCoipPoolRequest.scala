package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoipPoolRequest extends StObject {
  
  /**
    * The ID of the CoIP pool that you want to delete. 
    */
  var CoipPoolId: Ipv4PoolCoipId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DeleteCoipPoolRequest {
  
  inline def apply(CoipPoolId: Ipv4PoolCoipId): DeleteCoipPoolRequest = {
    val __obj = js.Dynamic.literal(CoipPoolId = CoipPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoipPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCoipPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setCoipPoolId(value: Ipv4PoolCoipId): Self = StObject.set(x, "CoipPoolId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
