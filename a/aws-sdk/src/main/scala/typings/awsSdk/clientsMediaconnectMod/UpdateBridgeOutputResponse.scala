package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeOutputResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the bridge.
    */
  var BridgeArn: js.UndefOr[string] = js.undefined
  
  /**
    * The output that you updated.
    */
  var Output: js.UndefOr[BridgeOutput] = js.undefined
}
object UpdateBridgeOutputResponse {
  
  inline def apply(): UpdateBridgeOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBridgeOutputResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeOutputResponse] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
    
    inline def setOutput(value: BridgeOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
  }
}
