package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceInstancesResult extends StObject {
  
  /**
    * An object that contains information about your device instances.
    */
  var deviceInstances: js.UndefOr[DeviceInstances] = js.undefined
  
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDeviceInstancesResult {
  
  inline def apply(): ListDeviceInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceInstancesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeviceInstancesResult] (val x: Self) extends AnyVal {
    
    inline def setDeviceInstances(value: DeviceInstances): Self = StObject.set(x, "deviceInstances", value.asInstanceOf[js.Any])
    
    inline def setDeviceInstancesUndefined: Self = StObject.set(x, "deviceInstances", js.undefined)
    
    inline def setDeviceInstancesVarargs(value: DeviceInstance*): Self = StObject.set(x, "deviceInstances", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
