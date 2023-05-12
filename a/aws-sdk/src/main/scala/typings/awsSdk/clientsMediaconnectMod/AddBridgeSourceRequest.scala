package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBridgeSourceRequest extends StObject {
  
  var FlowSource: js.UndefOr[AddBridgeFlowSourceRequest] = js.undefined
  
  var NetworkSource: js.UndefOr[AddBridgeNetworkSourceRequest] = js.undefined
}
object AddBridgeSourceRequest {
  
  inline def apply(): AddBridgeSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBridgeSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBridgeSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setFlowSource(value: AddBridgeFlowSourceRequest): Self = StObject.set(x, "FlowSource", value.asInstanceOf[js.Any])
    
    inline def setFlowSourceUndefined: Self = StObject.set(x, "FlowSource", js.undefined)
    
    inline def setNetworkSource(value: AddBridgeNetworkSourceRequest): Self = StObject.set(x, "NetworkSource", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourceUndefined: Self = StObject.set(x, "NetworkSource", js.undefined)
  }
}
