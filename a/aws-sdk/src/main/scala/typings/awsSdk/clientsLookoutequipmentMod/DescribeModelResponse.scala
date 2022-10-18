package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelResponse extends StObject {
  
  /**
    * Indicates the time and date at which the ML model was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration is the TargetSamplingRate, which is the sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate before training, the TargetSamplingRate is 1 minute. When providing a value for the TargetSamplingRate, you must attach the prefix "PT" to the rate you want. The value for a 1 second rate is therefore PT1S, the value for a 15 minute rate is PT15M, and the value for a 1 hour rate is PT1H 
    */
  var DataPreProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DataPreProcessingConfiguration] = js.undefined
  
  /**
    * The Amazon Resouce Name (ARN) of the dataset used to create the ML model being described. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetArn] = js.undefined
  
  /**
    * The name of the dataset being used by the ML being described. 
    */
  var DatasetName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetName] = js.undefined
  
  /**
    *  Indicates the time reference in the dataset that was used to end the subset of evaluation data for the ML model. 
    */
  var EvaluationDataEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Indicates the time reference in the dataset that was used to begin the subset of evaluation data for the ML model. 
    */
  var EvaluationDataStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If the training of the ML model failed, this indicates the reason for that failure. 
    */
  var FailedReason: js.UndefOr[BoundedLengthString] = js.undefined
  
  /**
    * Specifies configuration information about the labels input, including its S3 location. 
    */
  var LabelsInputConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelsInputConfiguration] = js.undefined
  
  /**
    * Indicates the last time the ML model was updated. The type of update is not specified. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the ML model being described. 
    */
  var ModelArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ModelArn] = js.undefined
  
  /**
    * The Model Metrics show an aggregated summary of the model's performance within the evaluation time range. This is the JSON content of the metrics created when evaluating the model. 
    */
  var ModelMetrics: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ModelMetrics] = js.undefined
  
  /**
    * The name of the ML model being described. 
    */
  var ModelName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ModelName] = js.undefined
  
  /**
    * Indicates that the asset associated with this sensor has been shut off. As long as this condition is met, Lookout for Equipment will not use data from this asset for training, evaluation, or inference.
    */
  var OffCondition: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.OffCondition] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of a role with permission to access the data source for the ML model being described. 
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * A JSON description of the data that is in each time series dataset, including names, column names, and data types. 
    */
  var Schema: js.UndefOr[InlineDataSchema] = js.undefined
  
  /**
    * Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment. 
    */
  var ServerSideKmsKeyId: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * Specifies the current status of the model being described. Status describes the status of the most recent action of the model. 
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    *  Indicates the time reference in the dataset that was used to end the subset of training data for the ML model. 
    */
  var TrainingDataEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Indicates the time reference in the dataset that was used to begin the subset of training data for the ML model. 
    */
  var TrainingDataStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the time at which the training of the ML model was completed. 
    */
  var TrainingExecutionEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the time at which the training of the ML model began. 
    */
  var TrainingExecutionStartTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeModelResponse {
  
  inline def apply(): DescribeModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeModelResponse]
  }
  
  extension [Self <: DescribeModelResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataPreProcessingConfiguration(value: DataPreProcessingConfiguration): Self = StObject.set(x, "DataPreProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataPreProcessingConfigurationUndefined: Self = StObject.set(x, "DataPreProcessingConfiguration", js.undefined)
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setEvaluationDataEndTime(value: js.Date): Self = StObject.set(x, "EvaluationDataEndTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationDataEndTimeUndefined: Self = StObject.set(x, "EvaluationDataEndTime", js.undefined)
    
    inline def setEvaluationDataStartTime(value: js.Date): Self = StObject.set(x, "EvaluationDataStartTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationDataStartTimeUndefined: Self = StObject.set(x, "EvaluationDataStartTime", js.undefined)
    
    inline def setFailedReason(value: BoundedLengthString): Self = StObject.set(x, "FailedReason", value.asInstanceOf[js.Any])
    
    inline def setFailedReasonUndefined: Self = StObject.set(x, "FailedReason", js.undefined)
    
    inline def setLabelsInputConfiguration(value: LabelsInputConfiguration): Self = StObject.set(x, "LabelsInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLabelsInputConfigurationUndefined: Self = StObject.set(x, "LabelsInputConfiguration", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setModelMetrics(value: ModelMetrics): Self = StObject.set(x, "ModelMetrics", value.asInstanceOf[js.Any])
    
    inline def setModelMetricsUndefined: Self = StObject.set(x, "ModelMetrics", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setOffCondition(value: OffCondition): Self = StObject.set(x, "OffCondition", value.asInstanceOf[js.Any])
    
    inline def setOffConditionUndefined: Self = StObject.set(x, "OffCondition", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchema(value: InlineDataSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setServerSideKmsKeyId(value: KmsKeyArn): Self = StObject.set(x, "ServerSideKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerSideKmsKeyIdUndefined: Self = StObject.set(x, "ServerSideKmsKeyId", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrainingDataEndTime(value: js.Date): Self = StObject.set(x, "TrainingDataEndTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataEndTimeUndefined: Self = StObject.set(x, "TrainingDataEndTime", js.undefined)
    
    inline def setTrainingDataStartTime(value: js.Date): Self = StObject.set(x, "TrainingDataStartTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataStartTimeUndefined: Self = StObject.set(x, "TrainingDataStartTime", js.undefined)
    
    inline def setTrainingExecutionEndTime(value: js.Date): Self = StObject.set(x, "TrainingExecutionEndTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingExecutionEndTimeUndefined: Self = StObject.set(x, "TrainingExecutionEndTime", js.undefined)
    
    inline def setTrainingExecutionStartTime(value: js.Date): Self = StObject.set(x, "TrainingExecutionStartTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingExecutionStartTimeUndefined: Self = StObject.set(x, "TrainingExecutionStartTime", js.undefined)
  }
}
