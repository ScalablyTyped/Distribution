package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckpointConfiguration extends StObject {
  
  /**
    * Describes the interval in milliseconds between checkpoint operations.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval value of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointInterval: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.CheckpointInterval] = js.undefined
  
  /**
    * Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Describes whether the application uses Kinesis Data Analytics' default checkpointing behavior. You must set this property to CUSTOM in order to set the CheckpointingEnabled, CheckpointInterval, or MinPauseBetweenCheckpoints parameters.  If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationType: typings.awsSdk.clientsKinesisanalyticsv2Mod.ConfigurationType
  
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start. If a checkpoint operation takes longer than the CheckpointInterval, the application otherwise performs continual checkpoint operations. For more information, see  Tuning Checkpointing in the Apache Flink Documentation.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.MinPauseBetweenCheckpoints] = js.undefined
}
object CheckpointConfiguration {
  
  inline def apply(ConfigurationType: ConfigurationType): CheckpointConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfiguration]
  }
  
  extension [Self <: CheckpointConfiguration](x: Self) {
    
    inline def setCheckpointInterval(value: CheckpointInterval): Self = StObject.set(x, "CheckpointInterval", value.asInstanceOf[js.Any])
    
    inline def setCheckpointIntervalUndefined: Self = StObject.set(x, "CheckpointInterval", js.undefined)
    
    inline def setCheckpointingEnabled(value: BooleanObject): Self = StObject.set(x, "CheckpointingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCheckpointingEnabledUndefined: Self = StObject.set(x, "CheckpointingEnabled", js.undefined)
    
    inline def setConfigurationType(value: ConfigurationType): Self = StObject.set(x, "ConfigurationType", value.asInstanceOf[js.Any])
    
    inline def setMinPauseBetweenCheckpoints(value: MinPauseBetweenCheckpoints): Self = StObject.set(x, "MinPauseBetweenCheckpoints", value.asInstanceOf[js.Any])
    
    inline def setMinPauseBetweenCheckpointsUndefined: Self = StObject.set(x, "MinPauseBetweenCheckpoints", js.undefined)
  }
}
