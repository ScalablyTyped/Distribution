package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointResponse extends StObject {
  
  /**
    * Information about the newly created VPC endpoint.
    */
  var VpcEndpoint: typings.awsSdk.clientsEsMod.VpcEndpoint
}
object CreateVpcEndpointResponse {
  
  inline def apply(VpcEndpoint: VpcEndpoint): CreateVpcEndpointResponse = {
    val __obj = js.Dynamic.literal(VpcEndpoint = VpcEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointResponse]
  }
  
  extension [Self <: CreateVpcEndpointResponse](x: Self) {
    
    inline def setVpcEndpoint(value: VpcEndpoint): Self = StObject.set(x, "VpcEndpoint", value.asInstanceOf[js.Any])
  }
}
