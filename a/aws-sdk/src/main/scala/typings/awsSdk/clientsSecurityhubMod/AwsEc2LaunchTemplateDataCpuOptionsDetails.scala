package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataCpuOptionsDetails extends StObject {
  
  /**
    *  The number of CPU cores for the instance. 
    */
  var CoreCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The number of threads per CPU core. A value of 1 disables multithreading for the instance, The default value is 2. 
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.undefined
}
object AwsEc2LaunchTemplateDataCpuOptionsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataCpuOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataCpuOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataCpuOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setCoreCount(value: Integer): Self = StObject.set(x, "CoreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "CoreCount", js.undefined)
    
    inline def setThreadsPerCore(value: Integer): Self = StObject.set(x, "ThreadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "ThreadsPerCore", js.undefined)
  }
}
