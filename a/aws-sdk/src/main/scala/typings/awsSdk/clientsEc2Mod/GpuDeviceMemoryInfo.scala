package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GpuDeviceMemoryInfo extends StObject {
  
  /**
    * The size of the memory available to the GPU accelerator, in MiB.
    */
  var SizeInMiB: js.UndefOr[GpuDeviceMemorySize] = js.undefined
}
object GpuDeviceMemoryInfo {
  
  inline def apply(): GpuDeviceMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GpuDeviceMemoryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GpuDeviceMemoryInfo] (val x: Self) extends AnyVal {
    
    inline def setSizeInMiB(value: GpuDeviceMemorySize): Self = StObject.set(x, "SizeInMiB", value.asInstanceOf[js.Any])
    
    inline def setSizeInMiBUndefined: Self = StObject.set(x, "SizeInMiB", js.undefined)
  }
}
