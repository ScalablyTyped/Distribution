package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeOutput extends StObject {
  
  var FlowOutput: js.UndefOr[BridgeFlowOutput] = js.undefined
  
  var NetworkOutput: js.UndefOr[BridgeNetworkOutput] = js.undefined
}
object BridgeOutput {
  
  inline def apply(): BridgeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BridgeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BridgeOutput] (val x: Self) extends AnyVal {
    
    inline def setFlowOutput(value: BridgeFlowOutput): Self = StObject.set(x, "FlowOutput", value.asInstanceOf[js.Any])
    
    inline def setFlowOutputUndefined: Self = StObject.set(x, "FlowOutput", js.undefined)
    
    inline def setNetworkOutput(value: BridgeNetworkOutput): Self = StObject.set(x, "NetworkOutput", value.asInstanceOf[js.Any])
    
    inline def setNetworkOutputUndefined: Self = StObject.set(x, "NetworkOutput", js.undefined)
  }
}
