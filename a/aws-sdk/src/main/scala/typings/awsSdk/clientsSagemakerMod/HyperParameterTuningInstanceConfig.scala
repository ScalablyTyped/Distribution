package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningInstanceConfig extends StObject {
  
  /**
    * The number of instances of the type specified by InstanceType. Choose an instance count larger than 1 for distributed training algorithms. See SageMaker distributed training jobs for more information.
    */
  var InstanceCount: TrainingInstanceCount
  
  /**
    * The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no GPUs) instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs) instance types: ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see instance type descriptions.
    */
  var InstanceType: TrainingInstanceType
  
  /**
    * The volume size in GB of the data to be processed for hyperparameter optimization (optional).
    */
  var VolumeSizeInGB: typings.awsSdk.clientsSagemakerMod.VolumeSizeInGB
}
object HyperParameterTuningInstanceConfig {
  
  inline def apply(
    InstanceCount: TrainingInstanceCount,
    InstanceType: TrainingInstanceType,
    VolumeSizeInGB: VolumeSizeInGB
  ): HyperParameterTuningInstanceConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], VolumeSizeInGB = VolumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningInstanceConfig]
  }
  
  extension [Self <: HyperParameterTuningInstanceConfig](x: Self) {
    
    inline def setInstanceCount(value: TrainingInstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: TrainingInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGB(value: VolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
  }
}
