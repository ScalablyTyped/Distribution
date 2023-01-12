package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointResponse extends StObject {
  
  /**
    * Information about the newly created VPC endpoint.
    */
  var VpcEndpoint: typings.awsSdk.clientsOpensearchMod.VpcEndpoint
}
object CreateVpcEndpointResponse {
  
  inline def apply(VpcEndpoint: VpcEndpoint): CreateVpcEndpointResponse = {
    val __obj = js.Dynamic.literal(VpcEndpoint = VpcEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcEndpoint(value: VpcEndpoint): Self = StObject.set(x, "VpcEndpoint", value.asInstanceOf[js.Any])
  }
}
