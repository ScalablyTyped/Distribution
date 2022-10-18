package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition you create.
    */
  var FlowDefinitionArn: typings.awsSdk.clientsSagemakerMod.FlowDefinitionArn
}
object CreateFlowDefinitionResponse {
  
  inline def apply(FlowDefinitionArn: FlowDefinitionArn): CreateFlowDefinitionResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowDefinitionResponse]
  }
  
  extension [Self <: CreateFlowDefinitionResponse](x: Self) {
    
    inline def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
  }
}
