package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeOutputRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to update.
    */
  var BridgeArn: string
  
  var NetworkOutput: js.UndefOr[UpdateBridgeNetworkOutputRequest] = js.undefined
  
  /**
    * The name of the bridge output that you want to update.
    */
  var OutputName: string
}
object UpdateBridgeOutputRequest {
  
  inline def apply(BridgeArn: string, OutputName: string): UpdateBridgeOutputRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], OutputName = OutputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBridgeOutputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeOutputRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkOutput(value: UpdateBridgeNetworkOutputRequest): Self = StObject.set(x, "NetworkOutput", value.asInstanceOf[js.Any])
    
    inline def setNetworkOutputUndefined: Self = StObject.set(x, "NetworkOutput", js.undefined)
    
    inline def setOutputName(value: string): Self = StObject.set(x, "OutputName", value.asInstanceOf[js.Any])
  }
}
