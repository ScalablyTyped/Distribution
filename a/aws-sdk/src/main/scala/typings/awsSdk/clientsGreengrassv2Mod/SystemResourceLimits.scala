package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemResourceLimits extends StObject {
  
  /**
    * The maximum amount of CPU time that a component's processes can use on the core device. A core device's total CPU time is equivalent to the device's number of CPU cores. For example, on a core device with 4 CPU cores, you can set this value to 2 to limit the component's processes to 50 percent usage of each CPU core. On a device with 1 CPU core, you can set this value to 0.25 to limit the component's processes to 25 percent usage of the CPU. If you set this value to a number greater than the number of CPU cores, the IoT Greengrass Core software doesn't limit the component's CPU usage.
    */
  var cpus: js.UndefOr[CPU] = js.undefined
  
  /**
    * The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on the core device.
    */
  var memory: js.UndefOr[Memory] = js.undefined
}
object SystemResourceLimits {
  
  inline def apply(): SystemResourceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemResourceLimits]
  }
  
  extension [Self <: SystemResourceLimits](x: Self) {
    
    inline def setCpus(value: CPU): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
    
    inline def setMemory(value: Memory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
