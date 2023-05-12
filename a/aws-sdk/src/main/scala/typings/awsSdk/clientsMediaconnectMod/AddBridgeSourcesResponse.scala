package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBridgeSourcesResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the bridge.
    */
  var BridgeArn: js.UndefOr[string] = js.undefined
  
  /**
    * The sources that you added to this bridge.
    */
  var Sources: js.UndefOr[listOfBridgeSource] = js.undefined
}
object AddBridgeSourcesResponse {
  
  inline def apply(): AddBridgeSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBridgeSourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBridgeSourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
    
    inline def setSources(value: listOfBridgeSource): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: BridgeSource*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
