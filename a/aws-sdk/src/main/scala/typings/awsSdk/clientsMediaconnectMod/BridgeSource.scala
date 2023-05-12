package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeSource extends StObject {
  
  var FlowSource: js.UndefOr[BridgeFlowSource] = js.undefined
  
  var NetworkSource: js.UndefOr[BridgeNetworkSource] = js.undefined
}
object BridgeSource {
  
  inline def apply(): BridgeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BridgeSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BridgeSource] (val x: Self) extends AnyVal {
    
    inline def setFlowSource(value: BridgeFlowSource): Self = StObject.set(x, "FlowSource", value.asInstanceOf[js.Any])
    
    inline def setFlowSourceUndefined: Self = StObject.set(x, "FlowSource", js.undefined)
    
    inline def setNetworkSource(value: BridgeNetworkSource): Self = StObject.set(x, "NetworkSource", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourceUndefined: Self = StObject.set(x, "NetworkSource", js.undefined)
  }
}
