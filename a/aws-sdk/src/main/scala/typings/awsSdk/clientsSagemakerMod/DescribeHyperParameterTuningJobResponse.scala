package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHyperParameterTuningJobResponse extends StObject {
  
  /**
    * A TrainingJobSummary object that describes the training job that completed with the best current HyperParameterTuningJobObjective.
    */
  var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined
  
  /**
    * The date and time that the tuning job started.
    */
  var CreationTime: js.Date
  
  /**
    * If the tuning job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobArn
  
  /**
    * The HyperParameterTuningJobConfig object that specifies the configuration of the tuning job.
    */
  var HyperParameterTuningJobConfig: typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobConfig
  
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobName
  
  /**
    * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
    */
  var HyperParameterTuningJobStatus: typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobStatus
  
  /**
    * The date and time that the status of the tuning job was modified. 
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ObjectiveStatusCounters object that specifies the number of training jobs, categorized by the status of their final objective metric, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typings.awsSdk.clientsSagemakerMod.ObjectiveStatusCounters
  
  /**
    * If the hyperparameter tuning job is an warm start tuning job with a WarmStartType of IDENTICAL_DATA_AND_ALGORITHM, this is the TrainingJobSummary for the training job with the best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for the warm start tuning job.
    */
  var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined
  
  /**
    * The HyperParameterTrainingJobDefinition object that specifies the definition of the training jobs that this tuning job launches.
    */
  var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.undefined
  
  /**
    * A list of the HyperParameterTrainingJobDefinition objects launched for this tuning job.
    */
  var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.undefined
  
  /**
    * The TrainingJobStatusCounters object that specifies the number of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typings.awsSdk.clientsSagemakerMod.TrainingJobStatusCounters
  
  /**
    * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.
    */
  var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined
}
object DescribeHyperParameterTuningJobResponse {
  
  inline def apply(
    CreationTime: js.Date,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    TrainingJobStatusCounters: TrainingJobStatusCounters
  ): DescribeHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobConfig = HyperParameterTuningJobConfig.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHyperParameterTuningJobResponse]
  }
  
  extension [Self <: DescribeHyperParameterTuningJobResponse](x: Self) {
    
    inline def setBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = StObject.set(x, "BestTrainingJob", value.asInstanceOf[js.Any])
    
    inline def setBestTrainingJobUndefined: Self = StObject.set(x, "BestTrainingJob", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setHyperParameterTuningEndTime(value: js.Date): Self = StObject.set(x, "HyperParameterTuningEndTime", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningEndTimeUndefined: Self = StObject.set(x, "HyperParameterTuningEndTime", js.undefined)
    
    inline def setHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "HyperParameterTuningJobArn", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobConfig(value: HyperParameterTuningJobConfig): Self = StObject.set(x, "HyperParameterTuningJobConfig", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobStatus(value: HyperParameterTuningJobStatus): Self = StObject.set(x, "HyperParameterTuningJobStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setObjectiveStatusCounters(value: ObjectiveStatusCounters): Self = StObject.set(x, "ObjectiveStatusCounters", value.asInstanceOf[js.Any])
    
    inline def setOverallBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = StObject.set(x, "OverallBestTrainingJob", value.asInstanceOf[js.Any])
    
    inline def setOverallBestTrainingJobUndefined: Self = StObject.set(x, "OverallBestTrainingJob", js.undefined)
    
    inline def setTrainingJobDefinition(value: HyperParameterTrainingJobDefinition): Self = StObject.set(x, "TrainingJobDefinition", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobDefinitionUndefined: Self = StObject.set(x, "TrainingJobDefinition", js.undefined)
    
    inline def setTrainingJobDefinitions(value: HyperParameterTrainingJobDefinitions): Self = StObject.set(x, "TrainingJobDefinitions", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobDefinitionsUndefined: Self = StObject.set(x, "TrainingJobDefinitions", js.undefined)
    
    inline def setTrainingJobDefinitionsVarargs(value: HyperParameterTrainingJobDefinition*): Self = StObject.set(x, "TrainingJobDefinitions", js.Array(value*))
    
    inline def setTrainingJobStatusCounters(value: TrainingJobStatusCounters): Self = StObject.set(x, "TrainingJobStatusCounters", value.asInstanceOf[js.Any])
    
    inline def setWarmStartConfig(value: HyperParameterTuningJobWarmStartConfig): Self = StObject.set(x, "WarmStartConfig", value.asInstanceOf[js.Any])
    
    inline def setWarmStartConfigUndefined: Self = StObject.set(x, "WarmStartConfig", js.undefined)
  }
}
