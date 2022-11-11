package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointsRequest extends StObject {
  
  /**
    * The unique identifiers of the endpoints to get information about.
    */
  var VpcEndpointIds: VpcEndpointIdList
}
object DescribeVpcEndpointsRequest {
  
  inline def apply(VpcEndpointIds: VpcEndpointIdList): DescribeVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointIds = VpcEndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointsRequest]
  }
  
  extension [Self <: DescribeVpcEndpointsRequest](x: Self) {
    
    inline def setVpcEndpointIds(value: VpcEndpointIdList): Self = StObject.set(x, "VpcEndpointIds", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdsVarargs(value: VpcEndpointId*): Self = StObject.set(x, "VpcEndpointIds", js.Array(value*))
  }
}
