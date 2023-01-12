package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuOptions extends StObject {
  
  /**
    * The number of cores that the CPU can use.
    */
  var coreCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of threads per core in the CPU.
    */
  var threadsPerCore: js.UndefOr[Integer] = js.undefined
}
object CpuOptions {
  
  inline def apply(): CpuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CpuOptions] (val x: Self) extends AnyVal {
    
    inline def setCoreCount(value: Integer): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    inline def setThreadsPerCore(value: Integer): Self = StObject.set(x, "threadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "threadsPerCore", js.undefined)
  }
}
