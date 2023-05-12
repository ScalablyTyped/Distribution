package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeSourceResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the bridge.
    */
  var BridgeArn: js.UndefOr[string] = js.undefined
  
  var Source: js.UndefOr[BridgeSource] = js.undefined
}
object UpdateBridgeSourceResponse {
  
  inline def apply(): UpdateBridgeSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBridgeSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
    
    inline def setSource(value: BridgeSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
