package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GpuDeviceInfo extends StObject {
  
  /**
    * The number of GPUs for the instance type.
    */
  var Count: js.UndefOr[GpuDeviceCount] = js.undefined
  
  /**
    * The manufacturer of the GPU accelerator.
    */
  var Manufacturer: js.UndefOr[GpuDeviceManufacturerName] = js.undefined
  
  /**
    * Describes the memory available to the GPU accelerator.
    */
  var MemoryInfo: js.UndefOr[GpuDeviceMemoryInfo] = js.undefined
  
  /**
    * The name of the GPU accelerator.
    */
  var Name: js.UndefOr[GpuDeviceName] = js.undefined
}
object GpuDeviceInfo {
  
  inline def apply(): GpuDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GpuDeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GpuDeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setCount(value: GpuDeviceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setManufacturer(value: GpuDeviceManufacturerName): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
    
    inline def setMemoryInfo(value: GpuDeviceMemoryInfo): Self = StObject.set(x, "MemoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "MemoryInfo", js.undefined)
    
    inline def setName(value: GpuDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
