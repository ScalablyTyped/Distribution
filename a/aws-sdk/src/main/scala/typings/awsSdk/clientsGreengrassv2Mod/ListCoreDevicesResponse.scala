package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoreDevicesResponse extends StObject {
  
  /**
    * A list that summarizes each core device.
    */
  var coreDevices: js.UndefOr[CoreDevicesList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListCoreDevicesResponse {
  
  inline def apply(): ListCoreDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoreDevicesResponse]
  }
  
  extension [Self <: ListCoreDevicesResponse](x: Self) {
    
    inline def setCoreDevices(value: CoreDevicesList): Self = StObject.set(x, "coreDevices", value.asInstanceOf[js.Any])
    
    inline def setCoreDevicesUndefined: Self = StObject.set(x, "coreDevices", js.undefined)
    
    inline def setCoreDevicesVarargs(value: CoreDevice*): Self = StObject.set(x, "coreDevices", js.Array(value*))
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
