package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TGWOnDeviceServiceConfiguration extends StObject {
  
  /**
    * The maximum number of virtual tapes to store on one Snow Family device. Due to physical resource limitations, this value must be set to 80 for Snowball Edge.
    */
  var StorageLimit: js.UndefOr[typings.awsSdk.clientsSnowballMod.StorageLimit] = js.undefined
  
  /**
    * The scale unit of the virtual tapes on the device.
    */
  var StorageUnit: js.UndefOr[typings.awsSdk.clientsSnowballMod.StorageUnit] = js.undefined
}
object TGWOnDeviceServiceConfiguration {
  
  inline def apply(): TGWOnDeviceServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TGWOnDeviceServiceConfiguration]
  }
  
  extension [Self <: TGWOnDeviceServiceConfiguration](x: Self) {
    
    inline def setStorageLimit(value: StorageLimit): Self = StObject.set(x, "StorageLimit", value.asInstanceOf[js.Any])
    
    inline def setStorageLimitUndefined: Self = StObject.set(x, "StorageLimit", js.undefined)
    
    inline def setStorageUnit(value: StorageUnit): Self = StObject.set(x, "StorageUnit", value.asInstanceOf[js.Any])
    
    inline def setStorageUnitUndefined: Self = StObject.set(x, "StorageUnit", js.undefined)
  }
}
