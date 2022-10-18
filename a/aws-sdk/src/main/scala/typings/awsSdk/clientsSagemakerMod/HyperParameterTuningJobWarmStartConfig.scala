package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobWarmStartConfig extends StObject {
  
  /**
    * An array of hyperparameter tuning jobs that are used as the starting point for the new hyperparameter tuning job. For more information about warm starting a hyperparameter tuning job, see Using a Previous Hyperparameter Tuning Job as a Starting Point. Hyperparameter tuning jobs created before October 1, 2018 cannot be used as parent jobs for warm start tuning jobs.
    */
  var ParentHyperParameterTuningJobs: typings.awsSdk.clientsSagemakerMod.ParentHyperParameterTuningJobs
  
  /**
    * Specifies one of the following:  IDENTICAL_DATA_AND_ALGORITHM  The new hyperparameter tuning job uses the same input data and training image as the parent tuning jobs. You can change the hyperparameter ranges to search and the maximum number of training jobs that the hyperparameter tuning job launches. You cannot use a new version of the training algorithm, unless the changes in the new version do not affect the algorithm itself. For example, changes that improve logging or adding support for a different data format are allowed. You can also change hyperparameters from tunable to static, and from static to tunable, but the total number of static plus tunable hyperparameters must remain the same as it is in all parent jobs. The objective metric for the new tuning job must be the same as for all parent jobs.  TRANSFER_LEARNING  The new hyperparameter tuning job can include input data, hyperparameter ranges, maximum number of concurrent training jobs, and maximum number of training jobs that are different than those of its parent hyperparameter tuning jobs. The training image can also be a different version from the version used in the parent hyperparameter tuning job. You can also change hyperparameters from tunable to static, and from static to tunable, but the total number of static plus tunable hyperparameters must remain the same as it is in all parent jobs. The objective metric for the new tuning job must be the same as for all parent jobs.  
    */
  var WarmStartType: HyperParameterTuningJobWarmStartType
}
object HyperParameterTuningJobWarmStartConfig {
  
  inline def apply(
    ParentHyperParameterTuningJobs: ParentHyperParameterTuningJobs,
    WarmStartType: HyperParameterTuningJobWarmStartType
  ): HyperParameterTuningJobWarmStartConfig = {
    val __obj = js.Dynamic.literal(ParentHyperParameterTuningJobs = ParentHyperParameterTuningJobs.asInstanceOf[js.Any], WarmStartType = WarmStartType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobWarmStartConfig]
  }
  
  extension [Self <: HyperParameterTuningJobWarmStartConfig](x: Self) {
    
    inline def setParentHyperParameterTuningJobs(value: ParentHyperParameterTuningJobs): Self = StObject.set(x, "ParentHyperParameterTuningJobs", value.asInstanceOf[js.Any])
    
    inline def setParentHyperParameterTuningJobsVarargs(value: ParentHyperParameterTuningJob*): Self = StObject.set(x, "ParentHyperParameterTuningJobs", js.Array(value*))
    
    inline def setWarmStartType(value: HyperParameterTuningJobWarmStartType): Self = StObject.set(x, "WarmStartType", value.asInstanceOf[js.Any])
  }
}
