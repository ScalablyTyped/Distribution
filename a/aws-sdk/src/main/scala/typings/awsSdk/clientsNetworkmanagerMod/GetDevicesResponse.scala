package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicesResponse extends StObject {
  
  /**
    * The devices.
    */
  var Devices: js.UndefOr[DeviceList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetDevicesResponse {
  
  inline def apply(): GetDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDevicesResponse] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: DeviceList): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "Devices", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
