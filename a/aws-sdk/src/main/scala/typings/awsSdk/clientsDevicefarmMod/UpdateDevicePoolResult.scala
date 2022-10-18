package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDevicePoolResult extends StObject {
  
  /**
    * The device pool you just updated.
    */
  var devicePool: js.UndefOr[DevicePool] = js.undefined
}
object UpdateDevicePoolResult {
  
  inline def apply(): UpdateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDevicePoolResult]
  }
  
  extension [Self <: UpdateDevicePoolResult](x: Self) {
    
    inline def setDevicePool(value: DevicePool): Self = StObject.set(x, "devicePool", value.asInstanceOf[js.Any])
    
    inline def setDevicePoolUndefined: Self = StObject.set(x, "devicePool", js.undefined)
  }
}
