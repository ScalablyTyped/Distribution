package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeStateRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to update.
    */
  var BridgeArn: string
  
  var DesiredState: typings.awsSdk.clientsMediaconnectMod.DesiredState
}
object UpdateBridgeStateRequest {
  
  inline def apply(BridgeArn: string, DesiredState: DesiredState): UpdateBridgeStateRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], DesiredState = DesiredState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBridgeStateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeStateRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setDesiredState(value: DesiredState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
  }
}
