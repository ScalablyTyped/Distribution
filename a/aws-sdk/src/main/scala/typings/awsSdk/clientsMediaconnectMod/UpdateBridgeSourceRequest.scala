package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeSourceRequest extends StObject {
  
  /**
    * The ARN of the bridge that you want to update.
    */
  var BridgeArn: string
  
  var FlowSource: js.UndefOr[UpdateBridgeFlowSourceRequest] = js.undefined
  
  var NetworkSource: js.UndefOr[UpdateBridgeNetworkSourceRequest] = js.undefined
  
  /**
    * The name of the source that you want to update.
    */
  var SourceName: string
}
object UpdateBridgeSourceRequest {
  
  inline def apply(BridgeArn: string, SourceName: string): UpdateBridgeSourceRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBridgeSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setFlowSource(value: UpdateBridgeFlowSourceRequest): Self = StObject.set(x, "FlowSource", value.asInstanceOf[js.Any])
    
    inline def setFlowSourceUndefined: Self = StObject.set(x, "FlowSource", js.undefined)
    
    inline def setNetworkSource(value: UpdateBridgeNetworkSourceRequest): Self = StObject.set(x, "NetworkSource", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourceUndefined: Self = StObject.set(x, "NetworkSource", js.undefined)
    
    inline def setSourceName(value: string): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
  }
}
