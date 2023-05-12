package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSingleWirelessDeviceImportTaskRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the Sidewalk destination that describes the IoT rule to route messages from the device in the import task that will be onboarded to AWS IoT Wireless.
    */
  var DestinationName: typings.awsSdk.clientsIotwirelessMod.DestinationName
  
  /**
    * The name of the wireless device for which an import task is being started.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceName] = js.undefined
  
  /**
    * The Sidewalk-related parameters for importing a single wireless device.
    */
  var Sidewalk: SidewalkSingleStartImportInfo
  
  var Tags: js.UndefOr[TagList] = js.undefined
}
object StartSingleWirelessDeviceImportTaskRequest {
  
  inline def apply(DestinationName: DestinationName, Sidewalk: SidewalkSingleStartImportInfo): StartSingleWirelessDeviceImportTaskRequest = {
    val __obj = js.Dynamic.literal(DestinationName = DestinationName.asInstanceOf[js.Any], Sidewalk = Sidewalk.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSingleWirelessDeviceImportTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSingleWirelessDeviceImportTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setSidewalk(value: SidewalkSingleStartImportInfo): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
