package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuOptionsRequest extends StObject {
  
  /**
    * Indicates whether to enable the instance for AMD SEV-SNP. AMD SEV-SNP is supported with M6a, R6a, and C6a instance types only.
    */
  var AmdSevSnp: js.UndefOr[AmdSevSnpSpecification] = js.undefined
  
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of threads per CPU core. To disable multithreading for the instance, specify a value of 1. Otherwise, specify the default value of 2.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.undefined
}
object CpuOptionsRequest {
  
  inline def apply(): CpuOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CpuOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAmdSevSnp(value: AmdSevSnpSpecification): Self = StObject.set(x, "AmdSevSnp", value.asInstanceOf[js.Any])
    
    inline def setAmdSevSnpUndefined: Self = StObject.set(x, "AmdSevSnp", js.undefined)
    
    inline def setCoreCount(value: Integer): Self = StObject.set(x, "CoreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "CoreCount", js.undefined)
    
    inline def setThreadsPerCore(value: Integer): Self = StObject.set(x, "ThreadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "ThreadsPerCore", js.undefined)
  }
}
