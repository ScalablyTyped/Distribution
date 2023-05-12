package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBridgeOutputsRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to update.
    */
  var BridgeArn: string
  
  /**
    * The outputs that you want to add to this bridge.
    */
  var Outputs: listOfAddBridgeOutputRequest
}
object AddBridgeOutputsRequest {
  
  inline def apply(BridgeArn: string, Outputs: listOfAddBridgeOutputRequest): AddBridgeOutputsRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddBridgeOutputsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBridgeOutputsRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: listOfAddBridgeOutputRequest): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: AddBridgeOutputRequest*): Self = StObject.set(x, "Outputs", js.Array(value*))
  }
}
