package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesForWirelessDeviceImportTaskResponse extends StObject {
  
  /**
    * The name of the Sidewalk destination that describes the IoT rule to route messages received from devices in an import task that are onboarded to AWS IoT Wireless.
    */
  var DestinationName: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DestinationName] = js.undefined
  
  /**
    * List of wireless devices in an import task and their onboarding status.
    */
  var ImportedWirelessDeviceList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ImportedWirelessDeviceList] = js.undefined
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListDevicesForWirelessDeviceImportTaskResponse {
  
  inline def apply(): ListDevicesForWirelessDeviceImportTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesForWirelessDeviceImportTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDevicesForWirelessDeviceImportTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "DestinationName", js.undefined)
    
    inline def setImportedWirelessDeviceList(value: ImportedWirelessDeviceList): Self = StObject.set(x, "ImportedWirelessDeviceList", value.asInstanceOf[js.Any])
    
    inline def setImportedWirelessDeviceListUndefined: Self = StObject.set(x, "ImportedWirelessDeviceList", js.undefined)
    
    inline def setImportedWirelessDeviceListVarargs(value: ImportedWirelessDevice*): Self = StObject.set(x, "ImportedWirelessDeviceList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
