package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcEndpointResponse extends StObject {
  
  /**
    * The endpoint to be updated.
    */
  var VpcEndpoint: typings.awsSdk.clientsOpensearchMod.VpcEndpoint
}
object UpdateVpcEndpointResponse {
  
  inline def apply(VpcEndpoint: VpcEndpoint): UpdateVpcEndpointResponse = {
    val __obj = js.Dynamic.literal(VpcEndpoint = VpcEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVpcEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcEndpoint(value: VpcEndpoint): Self = StObject.set(x, "VpcEndpoint", value.asInstanceOf[js.Any])
  }
}
