package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerResourceConfig extends StObject {
  
  /**
    * The CPU requirements for every worker instance of the worker type.
    */
  var cpu: CpuSize
  
  /**
    * The disk requirements for every worker instance of the worker type.
    */
  var disk: js.UndefOr[DiskSize] = js.undefined
  
  /**
    * The memory requirements for every worker instance of the worker type.
    */
  var memory: MemorySize
}
object WorkerResourceConfig {
  
  inline def apply(cpu: CpuSize, memory: MemorySize): WorkerResourceConfig = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerResourceConfig]
  }
  
  extension [Self <: WorkerResourceConfig](x: Self) {
    
    inline def setCpu(value: CpuSize): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setDisk(value: DiskSize): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    inline def setMemory(value: MemorySize): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
  }
}
