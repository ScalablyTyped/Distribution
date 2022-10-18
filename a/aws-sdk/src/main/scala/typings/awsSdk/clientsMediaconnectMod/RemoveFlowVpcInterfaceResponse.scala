package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFlowVpcInterfaceResponse extends StObject {
  
  /**
    * The ARN of the flow that is associated with the VPC interface you removed.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to remove.
    */
  var NonDeletedNetworkInterfaceIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The name of the VPC interface that was removed.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.undefined
}
object RemoveFlowVpcInterfaceResponse {
  
  inline def apply(): RemoveFlowVpcInterfaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFlowVpcInterfaceResponse]
  }
  
  extension [Self <: RemoveFlowVpcInterfaceResponse](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setNonDeletedNetworkInterfaceIds(value: listOfString): Self = StObject.set(x, "NonDeletedNetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNonDeletedNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NonDeletedNetworkInterfaceIds", js.undefined)
    
    inline def setNonDeletedNetworkInterfaceIdsVarargs(value: string*): Self = StObject.set(x, "NonDeletedNetworkInterfaceIds", js.Array(value*))
    
    inline def setVpcInterfaceName(value: string): Self = StObject.set(x, "VpcInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceNameUndefined: Self = StObject.set(x, "VpcInterfaceName", js.undefined)
  }
}
