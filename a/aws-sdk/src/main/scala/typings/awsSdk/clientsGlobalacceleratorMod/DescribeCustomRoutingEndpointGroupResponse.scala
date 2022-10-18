package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomRoutingEndpointGroupResponse extends StObject {
  
  /**
    * The description of an endpoint group for a custom routing accelerator.
    */
  var EndpointGroup: js.UndefOr[CustomRoutingEndpointGroup] = js.undefined
}
object DescribeCustomRoutingEndpointGroupResponse {
  
  inline def apply(): DescribeCustomRoutingEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomRoutingEndpointGroupResponse]
  }
  
  extension [Self <: DescribeCustomRoutingEndpointGroupResponse](x: Self) {
    
    inline def setEndpointGroup(value: CustomRoutingEndpointGroup): Self = StObject.set(x, "EndpointGroup", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupUndefined: Self = StObject.set(x, "EndpointGroup", js.undefined)
  }
}
