package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bridge extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the bridge.
    */
  var BridgeArn: string
  
  var BridgeMessages: js.UndefOr[listOfMessageDetail] = js.undefined
  
  var BridgeState: typings.awsSdk.clientsMediaconnectMod.BridgeState
  
  var EgressGatewayBridge: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.EgressGatewayBridge] = js.undefined
  
  var IngressGatewayBridge: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.IngressGatewayBridge] = js.undefined
  
  /**
    * The name of the bridge.
    */
  var Name: string
  
  /**
    * The outputs on this bridge.
    */
  var Outputs: js.UndefOr[listOfBridgeOutput] = js.undefined
  
  /**
    * The placement Amazon Resource Number (ARN) of the bridge.
    */
  var PlacementArn: string
  
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.undefined
  
  /**
    * The sources on this bridge.
    */
  var Sources: js.UndefOr[listOfBridgeSource] = js.undefined
}
object Bridge {
  
  inline def apply(BridgeArn: string, BridgeState: BridgeState, Name: string, PlacementArn: string): Bridge = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], BridgeState = BridgeState.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlacementArn = PlacementArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bridge] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeMessages(value: listOfMessageDetail): Self = StObject.set(x, "BridgeMessages", value.asInstanceOf[js.Any])
    
    inline def setBridgeMessagesUndefined: Self = StObject.set(x, "BridgeMessages", js.undefined)
    
    inline def setBridgeMessagesVarargs(value: MessageDetail*): Self = StObject.set(x, "BridgeMessages", js.Array(value*))
    
    inline def setBridgeState(value: BridgeState): Self = StObject.set(x, "BridgeState", value.asInstanceOf[js.Any])
    
    inline def setEgressGatewayBridge(value: EgressGatewayBridge): Self = StObject.set(x, "EgressGatewayBridge", value.asInstanceOf[js.Any])
    
    inline def setEgressGatewayBridgeUndefined: Self = StObject.set(x, "EgressGatewayBridge", js.undefined)
    
    inline def setIngressGatewayBridge(value: IngressGatewayBridge): Self = StObject.set(x, "IngressGatewayBridge", value.asInstanceOf[js.Any])
    
    inline def setIngressGatewayBridgeUndefined: Self = StObject.set(x, "IngressGatewayBridge", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: listOfBridgeOutput): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: BridgeOutput*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setPlacementArn(value: string): Self = StObject.set(x, "PlacementArn", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfig(value: FailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
    
    inline def setSources(value: listOfBridgeSource): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: BridgeSource*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
