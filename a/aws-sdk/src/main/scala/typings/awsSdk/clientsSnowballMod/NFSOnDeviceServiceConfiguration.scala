package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NFSOnDeviceServiceConfiguration extends StObject {
  
  /**
    * The maximum NFS storage for one Snow Family device.
    */
  var StorageLimit: js.UndefOr[typings.awsSdk.clientsSnowballMod.StorageLimit] = js.undefined
  
  /**
    * The scale unit of the NFS storage on the device. Valid values: TB.
    */
  var StorageUnit: js.UndefOr[typings.awsSdk.clientsSnowballMod.StorageUnit] = js.undefined
}
object NFSOnDeviceServiceConfiguration {
  
  inline def apply(): NFSOnDeviceServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NFSOnDeviceServiceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NFSOnDeviceServiceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setStorageLimit(value: StorageLimit): Self = StObject.set(x, "StorageLimit", value.asInstanceOf[js.Any])
    
    inline def setStorageLimitUndefined: Self = StObject.set(x, "StorageLimit", js.undefined)
    
    inline def setStorageUnit(value: StorageUnit): Self = StObject.set(x, "StorageUnit", value.asInstanceOf[js.Any])
    
    inline def setStorageUnitUndefined: Self = StObject.set(x, "StorageUnit", js.undefined)
  }
}
