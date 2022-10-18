package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowDefinitionRequest extends StObject {
  
  /**
    * The name of the flow definition.
    */
  var FlowDefinitionName: typings.awsSdk.clientsSagemakerMod.FlowDefinitionName
}
object DescribeFlowDefinitionRequest {
  
  inline def apply(FlowDefinitionName: FlowDefinitionName): DescribeFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowDefinitionRequest]
  }
  
  extension [Self <: DescribeFlowDefinitionRequest](x: Self) {
    
    inline def setFlowDefinitionName(value: FlowDefinitionName): Self = StObject.set(x, "FlowDefinitionName", value.asInstanceOf[js.Any])
  }
}
