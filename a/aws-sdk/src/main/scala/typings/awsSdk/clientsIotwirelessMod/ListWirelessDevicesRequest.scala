package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWirelessDevicesRequest extends StObject {
  
  /**
    * A filter to list only the wireless devices that use this destination.
    */
  var DestinationName: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DestinationName] = js.undefined
  
  /**
    * A filter to list only the wireless devices that use this device profile.
    */
  var DeviceProfileId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceProfileId] = js.undefined
  
  var FuotaTaskId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FuotaTaskId] = js.undefined
  
  /**
    * The maximum number of results to return in this operation.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.MaxResults] = js.undefined
  
  var MulticastGroupId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.MulticastGroupId] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
  
  /**
    * A filter to list only the wireless devices that use this service profile.
    */
  var ServiceProfileId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ServiceProfileId] = js.undefined
  
  /**
    * A filter to list only the wireless devices that use this wireless device type.
    */
  var WirelessDeviceType: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.WirelessDeviceType] = js.undefined
}
object ListWirelessDevicesRequest {
  
  inline def apply(): ListWirelessDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWirelessDevicesRequest]
  }
  
  extension [Self <: ListWirelessDevicesRequest](x: Self) {
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "DestinationName", js.undefined)
    
    inline def setDeviceProfileId(value: DeviceProfileId): Self = StObject.set(x, "DeviceProfileId", value.asInstanceOf[js.Any])
    
    inline def setDeviceProfileIdUndefined: Self = StObject.set(x, "DeviceProfileId", js.undefined)
    
    inline def setFuotaTaskId(value: FuotaTaskId): Self = StObject.set(x, "FuotaTaskId", value.asInstanceOf[js.Any])
    
    inline def setFuotaTaskIdUndefined: Self = StObject.set(x, "FuotaTaskId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMulticastGroupId(value: MulticastGroupId): Self = StObject.set(x, "MulticastGroupId", value.asInstanceOf[js.Any])
    
    inline def setMulticastGroupIdUndefined: Self = StObject.set(x, "MulticastGroupId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceProfileId(value: ServiceProfileId): Self = StObject.set(x, "ServiceProfileId", value.asInstanceOf[js.Any])
    
    inline def setServiceProfileIdUndefined: Self = StObject.set(x, "ServiceProfileId", js.undefined)
    
    inline def setWirelessDeviceType(value: WirelessDeviceType): Self = StObject.set(x, "WirelessDeviceType", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceTypeUndefined: Self = StObject.set(x, "WirelessDeviceType", js.undefined)
  }
}
