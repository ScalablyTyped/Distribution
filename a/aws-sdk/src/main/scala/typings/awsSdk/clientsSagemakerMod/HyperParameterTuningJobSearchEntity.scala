package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobSearchEntity extends StObject {
  
  var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined
  
  /**
    * The total amount of resources consumed by a hyperparameter tuning job.
    */
  var ConsumedResources: js.UndefOr[HyperParameterTuningJobConsumedResources] = js.undefined
  
  /**
    * The time that a hyperparameter tuning job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The error that was created when a hyperparameter tuning job failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The time that a hyperparameter tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a hyperparameter tuning job.
    */
  var HyperParameterTuningJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobArn] = js.undefined
  
  var HyperParameterTuningJobConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobConfig] = js.undefined
  
  /**
    * The name of a hyperparameter tuning job.
    */
  var HyperParameterTuningJobName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobName] = js.undefined
  
  /**
    * The status of a hyperparameter tuning job.
    */
  var HyperParameterTuningJobStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobStatus] = js.undefined
  
  /**
    * The time that a hyperparameter tuning job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  var ObjectiveStatusCounters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ObjectiveStatusCounters] = js.undefined
  
  var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined
  
  /**
    * The tags associated with a hyperparameter tuning job. For more information see Tagging Amazon Web Services resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.undefined
  
  /**
    * The job definitions included in a hyperparameter tuning job.
    */
  var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.undefined
  
  var TrainingJobStatusCounters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrainingJobStatusCounters] = js.undefined
  
  /**
    * Information about either a current or completed hyperparameter tuning job.
    */
  var TuningJobCompletionDetails: js.UndefOr[HyperParameterTuningJobCompletionDetails] = js.undefined
  
  var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined
}
object HyperParameterTuningJobSearchEntity {
  
  inline def apply(): HyperParameterTuningJobSearchEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningJobSearchEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HyperParameterTuningJobSearchEntity] (val x: Self) extends AnyVal {
    
    inline def setBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = StObject.set(x, "BestTrainingJob", value.asInstanceOf[js.Any])
    
    inline def setBestTrainingJobUndefined: Self = StObject.set(x, "BestTrainingJob", js.undefined)
    
    inline def setConsumedResources(value: HyperParameterTuningJobConsumedResources): Self = StObject.set(x, "ConsumedResources", value.asInstanceOf[js.Any])
    
    inline def setConsumedResourcesUndefined: Self = StObject.set(x, "ConsumedResources", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setHyperParameterTuningEndTime(value: js.Date): Self = StObject.set(x, "HyperParameterTuningEndTime", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningEndTimeUndefined: Self = StObject.set(x, "HyperParameterTuningEndTime", js.undefined)
    
    inline def setHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "HyperParameterTuningJobArn", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobArnUndefined: Self = StObject.set(x, "HyperParameterTuningJobArn", js.undefined)
    
    inline def setHyperParameterTuningJobConfig(value: HyperParameterTuningJobConfig): Self = StObject.set(x, "HyperParameterTuningJobConfig", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobConfigUndefined: Self = StObject.set(x, "HyperParameterTuningJobConfig", js.undefined)
    
    inline def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobNameUndefined: Self = StObject.set(x, "HyperParameterTuningJobName", js.undefined)
    
    inline def setHyperParameterTuningJobStatus(value: HyperParameterTuningJobStatus): Self = StObject.set(x, "HyperParameterTuningJobStatus", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobStatusUndefined: Self = StObject.set(x, "HyperParameterTuningJobStatus", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setObjectiveStatusCounters(value: ObjectiveStatusCounters): Self = StObject.set(x, "ObjectiveStatusCounters", value.asInstanceOf[js.Any])
    
    inline def setObjectiveStatusCountersUndefined: Self = StObject.set(x, "ObjectiveStatusCounters", js.undefined)
    
    inline def setOverallBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = StObject.set(x, "OverallBestTrainingJob", value.asInstanceOf[js.Any])
    
    inline def setOverallBestTrainingJobUndefined: Self = StObject.set(x, "OverallBestTrainingJob", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrainingJobDefinition(value: HyperParameterTrainingJobDefinition): Self = StObject.set(x, "TrainingJobDefinition", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobDefinitionUndefined: Self = StObject.set(x, "TrainingJobDefinition", js.undefined)
    
    inline def setTrainingJobDefinitions(value: HyperParameterTrainingJobDefinitions): Self = StObject.set(x, "TrainingJobDefinitions", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobDefinitionsUndefined: Self = StObject.set(x, "TrainingJobDefinitions", js.undefined)
    
    inline def setTrainingJobDefinitionsVarargs(value: HyperParameterTrainingJobDefinition*): Self = StObject.set(x, "TrainingJobDefinitions", js.Array(value*))
    
    inline def setTrainingJobStatusCounters(value: TrainingJobStatusCounters): Self = StObject.set(x, "TrainingJobStatusCounters", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobStatusCountersUndefined: Self = StObject.set(x, "TrainingJobStatusCounters", js.undefined)
    
    inline def setTuningJobCompletionDetails(value: HyperParameterTuningJobCompletionDetails): Self = StObject.set(x, "TuningJobCompletionDetails", value.asInstanceOf[js.Any])
    
    inline def setTuningJobCompletionDetailsUndefined: Self = StObject.set(x, "TuningJobCompletionDetails", js.undefined)
    
    inline def setWarmStartConfig(value: HyperParameterTuningJobWarmStartConfig): Self = StObject.set(x, "WarmStartConfig", value.asInstanceOf[js.Any])
    
    inline def setWarmStartConfigUndefined: Self = StObject.set(x, "WarmStartConfig", js.undefined)
  }
}
