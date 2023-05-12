package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBridgeOutputRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to update.
    */
  var BridgeArn: string
  
  /**
    * The name of the bridge output that you want to remove.
    */
  var OutputName: string
}
object RemoveBridgeOutputRequest {
  
  inline def apply(BridgeArn: string, OutputName: string): RemoveBridgeOutputRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], OutputName = OutputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveBridgeOutputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveBridgeOutputRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setOutputName(value: string): Self = StObject.set(x, "OutputName", value.asInstanceOf[js.Any])
  }
}
