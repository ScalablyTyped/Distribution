package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceResponse extends StObject {
  
  /**
    * The details of the device requested. Required.
    */
  var Device: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Device] = js.undefined
}
object GetDeviceResponse {
  
  inline def apply(): GetDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceResponse]
  }
  
  extension [Self <: GetDeviceResponse](x: Self) {
    
    inline def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
  }
}
