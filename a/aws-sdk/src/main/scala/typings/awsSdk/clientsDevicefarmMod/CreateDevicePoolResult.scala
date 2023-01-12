package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDevicePoolResult extends StObject {
  
  /**
    * The newly created device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.undefined
}
object CreateDevicePoolResult {
  
  inline def apply(): CreateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDevicePoolResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDevicePoolResult] (val x: Self) extends AnyVal {
    
    inline def setDevicePool(value: DevicePool): Self = StObject.set(x, "devicePool", value.asInstanceOf[js.Any])
    
    inline def setDevicePoolUndefined: Self = StObject.set(x, "devicePool", js.undefined)
  }
}
