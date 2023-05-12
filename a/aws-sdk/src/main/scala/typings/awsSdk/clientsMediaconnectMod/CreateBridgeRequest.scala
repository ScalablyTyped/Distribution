package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBridgeRequest extends StObject {
  
  /**
    * Create a bridge with the egress bridge type. An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect flow and is delivered to your premises.
    */
  var EgressGatewayBridge: js.UndefOr[AddEgressGatewayBridgeRequest] = js.undefined
  
  /**
    * Create a bridge with the ingress bridge type. An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is delivered to the cloud.
    */
  var IngressGatewayBridge: js.UndefOr[AddIngressGatewayBridgeRequest] = js.undefined
  
  /**
    * The name of the bridge. This name can not be modified after the bridge is created.
    */
  var Name: string
  
  /**
    * The outputs that you want to add to this bridge.
    */
  var Outputs: js.UndefOr[listOfAddBridgeOutputRequest] = js.undefined
  
  /**
    * The bridge placement Amazon Resource Number (ARN).
    */
  var PlacementArn: string
  
  /**
    * The settings for source failover.
    */
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.undefined
  
  /**
    * The sources that you want to add to this bridge.
    */
  var Sources: listOfAddBridgeSourceRequest
}
object CreateBridgeRequest {
  
  inline def apply(Name: string, PlacementArn: string, Sources: listOfAddBridgeSourceRequest): CreateBridgeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PlacementArn = PlacementArn.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBridgeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBridgeRequest] (val x: Self) extends AnyVal {
    
    inline def setEgressGatewayBridge(value: AddEgressGatewayBridgeRequest): Self = StObject.set(x, "EgressGatewayBridge", value.asInstanceOf[js.Any])
    
    inline def setEgressGatewayBridgeUndefined: Self = StObject.set(x, "EgressGatewayBridge", js.undefined)
    
    inline def setIngressGatewayBridge(value: AddIngressGatewayBridgeRequest): Self = StObject.set(x, "IngressGatewayBridge", value.asInstanceOf[js.Any])
    
    inline def setIngressGatewayBridgeUndefined: Self = StObject.set(x, "IngressGatewayBridge", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: listOfAddBridgeOutputRequest): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: AddBridgeOutputRequest*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setPlacementArn(value: string): Self = StObject.set(x, "PlacementArn", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfig(value: FailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
    
    inline def setSources(value: listOfAddBridgeSourceRequest): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: AddBridgeSourceRequest*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
