package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBridgeOutputRequest extends StObject {
  
  var NetworkOutput: js.UndefOr[AddBridgeNetworkOutputRequest] = js.undefined
}
object AddBridgeOutputRequest {
  
  inline def apply(): AddBridgeOutputRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBridgeOutputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBridgeOutputRequest] (val x: Self) extends AnyVal {
    
    inline def setNetworkOutput(value: AddBridgeNetworkOutputRequest): Self = StObject.set(x, "NetworkOutput", value.asInstanceOf[js.Any])
    
    inline def setNetworkOutputUndefined: Self = StObject.set(x, "NetworkOutput", js.undefined)
  }
}
