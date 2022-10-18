package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimePlatform extends StObject {
  
  /**
    * The CPU architecture. You can run your Linux tasks on an ARM-based platform by setting the value to ARM64. This option is avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
    */
  var cpuArchitecture: js.UndefOr[CPUArchitecture] = js.undefined
  
  /**
    * The operating system.
    */
  var operatingSystemFamily: js.UndefOr[OSFamily] = js.undefined
}
object RuntimePlatform {
  
  inline def apply(): RuntimePlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimePlatform]
  }
  
  extension [Self <: RuntimePlatform](x: Self) {
    
    inline def setCpuArchitecture(value: CPUArchitecture): Self = StObject.set(x, "cpuArchitecture", value.asInstanceOf[js.Any])
    
    inline def setCpuArchitectureUndefined: Self = StObject.set(x, "cpuArchitecture", js.undefined)
    
    inline def setOperatingSystemFamily(value: OSFamily): Self = StObject.set(x, "operatingSystemFamily", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemFamilyUndefined: Self = StObject.set(x, "operatingSystemFamily", js.undefined)
  }
}
