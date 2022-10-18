package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesResponse extends StObject {
  
  /**
    * A list of devices.
    */
  var Devices: js.UndefOr[listOfDeviceDescription] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListDevicesResponse {
  
  inline def apply(): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesResponse]
  }
  
  extension [Self <: ListDevicesResponse](x: Self) {
    
    inline def setDevices(value: listOfDeviceDescription): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDevicesVarargs(value: DeviceDescription*): Self = StObject.set(x, "Devices", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
