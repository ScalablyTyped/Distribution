package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicePoolResult extends StObject {
  
  /**
    * An object that contains information about the requested device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.undefined
}
object GetDevicePoolResult {
  
  inline def apply(): GetDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicePoolResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDevicePoolResult] (val x: Self) extends AnyVal {
    
    inline def setDevicePool(value: DevicePool): Self = StObject.set(x, "devicePool", value.asInstanceOf[js.Any])
    
    inline def setDevicePoolUndefined: Self = StObject.set(x, "devicePool", js.undefined)
  }
}
