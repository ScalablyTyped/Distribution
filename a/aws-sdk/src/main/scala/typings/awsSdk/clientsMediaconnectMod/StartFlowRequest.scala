package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFlowRequest extends StObject {
  
  /**
    * The ARN of the flow that you want to start.
    */
  var FlowArn: string
}
object StartFlowRequest {
  
  inline def apply(FlowArn: string): StartFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFlowRequest]
  }
  
  extension [Self <: StartFlowRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
