package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesResponse extends StObject {
  
  /**
    * The devices returned in the list devices response.
    */
  var Devices: js.UndefOr[DeviceListType] = js.undefined
  
  /**
    * The pagination token for the list device response.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
}
object ListDevicesResponse {
  
  inline def apply(): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesResponse]
  }
  
  extension [Self <: ListDevicesResponse](x: Self) {
    
    inline def setDevices(value: DeviceListType): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDevicesVarargs(value: DeviceType*): Self = StObject.set(x, "Devices", js.Array(value*))
    
    inline def setPaginationToken(value: SearchPaginationTokenType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
