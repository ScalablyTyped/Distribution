package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceHardware extends StObject {
  
  /**
    * The number of vCPUs the instance has.
    */
  var cpuCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The disks attached to the instance.
    */
  var disks: js.UndefOr[DiskList] = js.undefined
  
  /**
    * The amount of RAM in GB on the instance (e.g., 1.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
}
object InstanceHardware {
  
  inline def apply(): InstanceHardware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceHardware]
  }
  
  extension [Self <: InstanceHardware](x: Self) {
    
    inline def setCpuCount(value: integer): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    inline def setDisks(value: DiskList): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: Disk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setRamSizeInGb(value: float): Self = StObject.set(x, "ramSizeInGb", value.asInstanceOf[js.Any])
    
    inline def setRamSizeInGbUndefined: Self = StObject.set(x, "ramSizeInGb", js.undefined)
  }
}
