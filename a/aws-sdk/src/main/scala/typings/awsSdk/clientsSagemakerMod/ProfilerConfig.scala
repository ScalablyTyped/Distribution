package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerConfig extends StObject {
  
  /**
    * A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1 second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
    */
  var ProfilingIntervalInMilliseconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProfilingIntervalInMilliseconds] = js.undefined
  
  /**
    * Configuration information for capturing framework metrics. Available key strings for different profiling options are DetailedProfilingConfig, PythonProfilingConfig, and DataLoaderProfilingConfig. The following codes are configuration structures for the ProfilingParameters parameter. To learn more about how to configure the ProfilingParameters parameter, see Use the SageMaker and Debugger Configuration API Operations to Create, Update, and Debug Your Training Job. 
    */
  var ProfilingParameters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProfilingParameters] = js.undefined
  
  /**
    * Path to Amazon S3 storage location for system and framework metrics.
    */
  var S3OutputPath: S3Uri
}
object ProfilerConfig {
  
  inline def apply(S3OutputPath: S3Uri): ProfilerConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfilerConfig] (val x: Self) extends AnyVal {
    
    inline def setProfilingIntervalInMilliseconds(value: ProfilingIntervalInMilliseconds): Self = StObject.set(x, "ProfilingIntervalInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setProfilingIntervalInMillisecondsUndefined: Self = StObject.set(x, "ProfilingIntervalInMilliseconds", js.undefined)
    
    inline def setProfilingParameters(value: ProfilingParameters): Self = StObject.set(x, "ProfilingParameters", value.asInstanceOf[js.Any])
    
    inline def setProfilingParametersUndefined: Self = StObject.set(x, "ProfilingParameters", js.undefined)
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
