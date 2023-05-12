package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeStateResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the bridge.
    */
  var BridgeArn: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the bridge. ACTIVE or STANDBY.
    */
  var DesiredState: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.DesiredState] = js.undefined
}
object UpdateBridgeStateResponse {
  
  inline def apply(): UpdateBridgeStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBridgeStateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeStateResponse] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
    
    inline def setDesiredState(value: DesiredState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
  }
}
