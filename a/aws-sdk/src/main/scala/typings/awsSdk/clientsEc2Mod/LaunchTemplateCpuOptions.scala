package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateCpuOptions extends StObject {
  
  /**
    * Indicates whether the instance is enabled for AMD SEV-SNP.
    */
  var AmdSevSnp: js.UndefOr[AmdSevSnpSpecification] = js.undefined
  
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of threads per CPU core.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.undefined
}
object LaunchTemplateCpuOptions {
  
  inline def apply(): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplateCpuOptions] (val x: Self) extends AnyVal {
    
    inline def setAmdSevSnp(value: AmdSevSnpSpecification): Self = StObject.set(x, "AmdSevSnp", value.asInstanceOf[js.Any])
    
    inline def setAmdSevSnpUndefined: Self = StObject.set(x, "AmdSevSnp", js.undefined)
    
    inline def setCoreCount(value: Integer): Self = StObject.set(x, "CoreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "CoreCount", js.undefined)
    
    inline def setThreadsPerCore(value: Integer): Self = StObject.set(x, "ThreadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "ThreadsPerCore", js.undefined)
  }
}
