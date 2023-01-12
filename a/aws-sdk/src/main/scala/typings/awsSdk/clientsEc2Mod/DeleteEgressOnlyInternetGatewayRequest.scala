package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEgressOnlyInternetGatewayRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: typings.awsSdk.clientsEc2Mod.EgressOnlyInternetGatewayId
}
object DeleteEgressOnlyInternetGatewayRequest {
  
  inline def apply(EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId): DeleteEgressOnlyInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(EgressOnlyInternetGatewayId = EgressOnlyInternetGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEgressOnlyInternetGatewayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEgressOnlyInternetGatewayRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = StObject.set(x, "EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
  }
}
