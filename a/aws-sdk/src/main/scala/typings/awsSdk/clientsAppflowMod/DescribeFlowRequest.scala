package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowRequest extends StObject {
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName
}
object DescribeFlowRequest {
  
  inline def apply(flowName: FlowName): DescribeFlowRequest = {
    val __obj = js.Dynamic.literal(flowName = flowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowRequest]
  }
  
  extension [Self <: DescribeFlowRequest](x: Self) {
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
  }
}
