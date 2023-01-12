package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelismConfigurationDescription extends StObject {
  
  /**
    * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. 
    */
  var ConfigurationType: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ConfigurationType] = js.undefined
  
  /**
    * Describes the current number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, Kinesis Data Analytics can increase this value in response to application load. The service can increase this value up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var CurrentParallelism: js.UndefOr[Parallelism] = js.undefined
  
  /**
    * Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, then Kinesis Data Analytics can increase the CurrentParallelism value in response to application load. The service can increase CurrentParallelism up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var Parallelism: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.Parallelism] = js.undefined
  
  /**
    * Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPU: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ParallelismPerKPU] = js.undefined
}
object ParallelismConfigurationDescription {
  
  inline def apply(): ParallelismConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelismConfigurationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParallelismConfigurationDescription] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingEnabled(value: BooleanObject): Self = StObject.set(x, "AutoScalingEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingEnabledUndefined: Self = StObject.set(x, "AutoScalingEnabled", js.undefined)
    
    inline def setConfigurationType(value: ConfigurationType): Self = StObject.set(x, "ConfigurationType", value.asInstanceOf[js.Any])
    
    inline def setConfigurationTypeUndefined: Self = StObject.set(x, "ConfigurationType", js.undefined)
    
    inline def setCurrentParallelism(value: Parallelism): Self = StObject.set(x, "CurrentParallelism", value.asInstanceOf[js.Any])
    
    inline def setCurrentParallelismUndefined: Self = StObject.set(x, "CurrentParallelism", js.undefined)
    
    inline def setParallelism(value: Parallelism): Self = StObject.set(x, "Parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismPerKPU(value: ParallelismPerKPU): Self = StObject.set(x, "ParallelismPerKPU", value.asInstanceOf[js.Any])
    
    inline def setParallelismPerKPUUndefined: Self = StObject.set(x, "ParallelismPerKPU", js.undefined)
    
    inline def setParallelismUndefined: Self = StObject.set(x, "Parallelism", js.undefined)
  }
}
