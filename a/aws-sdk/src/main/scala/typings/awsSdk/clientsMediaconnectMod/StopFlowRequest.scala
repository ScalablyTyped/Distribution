package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopFlowRequest extends StObject {
  
  /**
    * The ARN of the flow that you want to stop.
    */
  var FlowArn: string
}
object StopFlowRequest {
  
  inline def apply(FlowArn: string): StopFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopFlowRequest]
  }
  
  extension [Self <: StopFlowRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
