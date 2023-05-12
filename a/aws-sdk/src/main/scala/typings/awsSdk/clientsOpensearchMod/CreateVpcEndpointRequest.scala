package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the domain to create the endpoint for.
    */
  var DomainArn: typings.awsSdk.clientsOpensearchMod.DomainArn
  
  /**
    * Options to specify the subnets and security groups for the endpoint.
    */
  var VpcOptions: VPCOptions
}
object CreateVpcEndpointRequest {
  
  inline def apply(DomainArn: DomainArn, VpcOptions: VPCOptions): CreateVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(DomainArn = DomainArn.asInstanceOf[js.Any], VpcOptions = VpcOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    inline def setVpcOptions(value: VPCOptions): Self = StObject.set(x, "VpcOptions", value.asInstanceOf[js.Any])
  }
}
