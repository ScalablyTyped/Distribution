package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the bridge that you want to update.
    */
  var BridgeArn: string
  
  var EgressGatewayBridge: js.UndefOr[UpdateEgressGatewayBridgeRequest] = js.undefined
  
  var IngressGatewayBridge: js.UndefOr[UpdateIngressGatewayBridgeRequest] = js.undefined
  
  var SourceFailoverConfig: js.UndefOr[UpdateFailoverConfig] = js.undefined
}
object UpdateBridgeRequest {
  
  inline def apply(BridgeArn: string): UpdateBridgeRequest = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBridgeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setEgressGatewayBridge(value: UpdateEgressGatewayBridgeRequest): Self = StObject.set(x, "EgressGatewayBridge", value.asInstanceOf[js.Any])
    
    inline def setEgressGatewayBridgeUndefined: Self = StObject.set(x, "EgressGatewayBridge", js.undefined)
    
    inline def setIngressGatewayBridge(value: UpdateIngressGatewayBridgeRequest): Self = StObject.set(x, "IngressGatewayBridge", value.asInstanceOf[js.Any])
    
    inline def setIngressGatewayBridgeUndefined: Self = StObject.set(x, "IngressGatewayBridge", js.undefined)
    
    inline def setSourceFailoverConfig(value: UpdateFailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
  }
}
