package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceProfilesResponse extends StObject {
  
  /**
    * The list of device profiles.
    */
  var DeviceProfileList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceProfileList] = js.undefined
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListDeviceProfilesResponse {
  
  inline def apply(): ListDeviceProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceProfilesResponse]
  }
  
  extension [Self <: ListDeviceProfilesResponse](x: Self) {
    
    inline def setDeviceProfileList(value: DeviceProfileList): Self = StObject.set(x, "DeviceProfileList", value.asInstanceOf[js.Any])
    
    inline def setDeviceProfileListUndefined: Self = StObject.set(x, "DeviceProfileList", js.undefined)
    
    inline def setDeviceProfileListVarargs(value: DeviceProfile*): Self = StObject.set(x, "DeviceProfileList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
