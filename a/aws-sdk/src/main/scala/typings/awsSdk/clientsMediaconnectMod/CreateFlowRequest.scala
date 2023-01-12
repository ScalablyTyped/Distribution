package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowRequest extends StObject {
  
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS Region.
    */
  var AvailabilityZone: js.UndefOr[string] = js.undefined
  
  /**
    * The entitlements that you want to grant on a flow.
    */
  var Entitlements: js.UndefOr[listOfGrantEntitlementRequest] = js.undefined
  
  var Maintenance: js.UndefOr[AddMaintenance] = js.undefined
  
  /**
    * The media streams that you want to add to the flow. You can associate these media streams with sources and outputs on the flow.
    */
  var MediaStreams: js.UndefOr[listOfAddMediaStreamRequest] = js.undefined
  
  /**
    * The name of the flow.
    */
  var Name: string
  
  /**
    * The outputs that you want to add to this flow.
    */
  var Outputs: js.UndefOr[listOfAddOutputRequest] = js.undefined
  
  var Source: js.UndefOr[SetSourceRequest] = js.undefined
  
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.undefined
  
  var Sources: js.UndefOr[listOfSetSourceRequest] = js.undefined
  
  /**
    * The VPC interfaces you want on the flow.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterfaceRequest] = js.undefined
}
object CreateFlowRequest {
  
  inline def apply(Name: string): CreateFlowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFlowRequest] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: string): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setEntitlements(value: listOfGrantEntitlementRequest): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "Entitlements", js.undefined)
    
    inline def setEntitlementsVarargs(value: GrantEntitlementRequest*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setMaintenance(value: AddMaintenance): Self = StObject.set(x, "Maintenance", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceUndefined: Self = StObject.set(x, "Maintenance", js.undefined)
    
    inline def setMediaStreams(value: listOfAddMediaStreamRequest): Self = StObject.set(x, "MediaStreams", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamsUndefined: Self = StObject.set(x, "MediaStreams", js.undefined)
    
    inline def setMediaStreamsVarargs(value: AddMediaStreamRequest*): Self = StObject.set(x, "MediaStreams", js.Array(value*))
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: listOfAddOutputRequest): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: AddOutputRequest*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setSource(value: SetSourceRequest): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfig(value: FailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setSources(value: listOfSetSourceRequest): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: SetSourceRequest*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setVpcInterfaces(value: listOfVpcInterfaceRequest): Self = StObject.set(x, "VpcInterfaces", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfacesUndefined: Self = StObject.set(x, "VpcInterfaces", js.undefined)
    
    inline def setVpcInterfacesVarargs(value: VpcInterfaceRequest*): Self = StObject.set(x, "VpcInterfaces", js.Array(value*))
  }
}
