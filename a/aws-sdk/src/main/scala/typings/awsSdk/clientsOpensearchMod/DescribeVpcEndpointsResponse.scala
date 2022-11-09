package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointsResponse extends StObject {
  
  /**
    * Any errors associated with the request.
    */
  var VpcEndpointErrors: VpcEndpointErrorList
  
  /**
    * Information about each requested VPC endpoint.
    */
  var VpcEndpoints: typings.awsSdk.clientsOpensearchMod.VpcEndpoints
}
object DescribeVpcEndpointsResponse {
  
  inline def apply(VpcEndpointErrors: VpcEndpointErrorList, VpcEndpoints: VpcEndpoints): DescribeVpcEndpointsResponse = {
    val __obj = js.Dynamic.literal(VpcEndpointErrors = VpcEndpointErrors.asInstanceOf[js.Any], VpcEndpoints = VpcEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointsResponse]
  }
  
  extension [Self <: DescribeVpcEndpointsResponse](x: Self) {
    
    inline def setVpcEndpointErrors(value: VpcEndpointErrorList): Self = StObject.set(x, "VpcEndpointErrors", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointErrorsVarargs(value: VpcEndpointError*): Self = StObject.set(x, "VpcEndpointErrors", js.Array(value*))
    
    inline def setVpcEndpoints(value: VpcEndpoints): Self = StObject.set(x, "VpcEndpoints", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointsVarargs(value: VpcEndpoint*): Self = StObject.set(x, "VpcEndpoints", js.Array(value*))
  }
}
