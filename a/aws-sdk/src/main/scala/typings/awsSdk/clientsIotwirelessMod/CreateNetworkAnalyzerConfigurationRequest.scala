package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkAnalyzerConfigurationRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientRequestToken] = js.undefined
  
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  var Name: NetworkAnalyzerConfigurationName
  
  var Tags: js.UndefOr[TagList] = js.undefined
  
  var TraceContent: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.TraceContent] = js.undefined
  
  /**
    * Wireless device resources to add to the network analyzer configuration. Provide the WirelessDeviceId of the resource to add in the input array.
    */
  var WirelessDevices: js.UndefOr[WirelessDeviceList] = js.undefined
  
  /**
    * Wireless gateway resources to add to the network analyzer configuration. Provide the WirelessGatewayId of the resource to add in the input array.
    */
  var WirelessGateways: js.UndefOr[WirelessGatewayList] = js.undefined
}
object CreateNetworkAnalyzerConfigurationRequest {
  
  inline def apply(Name: NetworkAnalyzerConfigurationName): CreateNetworkAnalyzerConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkAnalyzerConfigurationRequest]
  }
  
  extension [Self <: CreateNetworkAnalyzerConfigurationRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NetworkAnalyzerConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTraceContent(value: TraceContent): Self = StObject.set(x, "TraceContent", value.asInstanceOf[js.Any])
    
    inline def setTraceContentUndefined: Self = StObject.set(x, "TraceContent", js.undefined)
    
    inline def setWirelessDevices(value: WirelessDeviceList): Self = StObject.set(x, "WirelessDevices", value.asInstanceOf[js.Any])
    
    inline def setWirelessDevicesUndefined: Self = StObject.set(x, "WirelessDevices", js.undefined)
    
    inline def setWirelessDevicesVarargs(value: WirelessDeviceId*): Self = StObject.set(x, "WirelessDevices", js.Array(value*))
    
    inline def setWirelessGateways(value: WirelessGatewayList): Self = StObject.set(x, "WirelessGateways", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewaysUndefined: Self = StObject.set(x, "WirelessGateways", js.undefined)
    
    inline def setWirelessGatewaysVarargs(value: WirelessGatewayId*): Self = StObject.set(x, "WirelessGateways", js.Array(value*))
  }
}
