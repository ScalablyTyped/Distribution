package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBridgeOutputsResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the bridge.
    */
  var BridgeArn: js.UndefOr[string] = js.undefined
  
  /**
    * The outputs that you added to this bridge.
    */
  var Outputs: js.UndefOr[listOfBridgeOutput] = js.undefined
}
object AddBridgeOutputsResponse {
  
  inline def apply(): AddBridgeOutputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBridgeOutputsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBridgeOutputsResponse] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
    
    inline def setOutputs(value: listOfBridgeOutput): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: BridgeOutput*): Self = StObject.set(x, "Outputs", js.Array(value*))
  }
}
