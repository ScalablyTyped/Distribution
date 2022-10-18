package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowVpcInterfacesResponse extends StObject {
  
  /**
    * The ARN of the flow that these VPC interfaces were added to.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The details of the newly added VPC interfaces.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterface] = js.undefined
}
object AddFlowVpcInterfacesResponse {
  
  inline def apply(): AddFlowVpcInterfacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowVpcInterfacesResponse]
  }
  
  extension [Self <: AddFlowVpcInterfacesResponse](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setVpcInterfaces(value: listOfVpcInterface): Self = StObject.set(x, "VpcInterfaces", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfacesUndefined: Self = StObject.set(x, "VpcInterfaces", js.undefined)
    
    inline def setVpcInterfacesVarargs(value: VpcInterface*): Self = StObject.set(x, "VpcInterfaces", js.Array(value*))
  }
}
