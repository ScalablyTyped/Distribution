package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBridgeResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the deleted bridge.
    */
  var BridgeArn: js.UndefOr[string] = js.undefined
}
object DeleteBridgeResponse {
  
  inline def apply(): DeleteBridgeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBridgeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBridgeResponse] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
  }
}
