package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlinkApplicationConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.CheckpointConfigurationUpdate] = js.undefined
  
  /**
    * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.MonitoringConfigurationUpdate] = js.undefined
  
  /**
    * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ParallelismConfigurationUpdate] = js.undefined
}
object FlinkApplicationConfigurationUpdate {
  
  inline def apply(): FlinkApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfigurationUpdate]
  }
  
  extension [Self <: FlinkApplicationConfigurationUpdate](x: Self) {
    
    inline def setCheckpointConfigurationUpdate(value: CheckpointConfigurationUpdate): Self = StObject.set(x, "CheckpointConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfigurationUpdateUndefined: Self = StObject.set(x, "CheckpointConfigurationUpdate", js.undefined)
    
    inline def setMonitoringConfigurationUpdate(value: MonitoringConfigurationUpdate): Self = StObject.set(x, "MonitoringConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setMonitoringConfigurationUpdateUndefined: Self = StObject.set(x, "MonitoringConfigurationUpdate", js.undefined)
    
    inline def setParallelismConfigurationUpdate(value: ParallelismConfigurationUpdate): Self = StObject.set(x, "ParallelismConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUpdateUndefined: Self = StObject.set(x, "ParallelismConfigurationUpdate", js.undefined)
  }
}
