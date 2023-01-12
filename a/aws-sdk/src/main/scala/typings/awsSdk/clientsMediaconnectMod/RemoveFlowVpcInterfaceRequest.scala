package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFlowVpcInterfaceRequest extends StObject {
  
  /**
    * The flow that you want to remove a VPC interface from.
    */
  var FlowArn: string
  
  /**
    * The name of the VPC interface that you want to remove.
    */
  var VpcInterfaceName: string
}
object RemoveFlowVpcInterfaceRequest {
  
  inline def apply(FlowArn: string, VpcInterfaceName: string): RemoveFlowVpcInterfaceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], VpcInterfaceName = VpcInterfaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowVpcInterfaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveFlowVpcInterfaceRequest] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceName(value: string): Self = StObject.set(x, "VpcInterfaceName", value.asInstanceOf[js.Any])
  }
}
