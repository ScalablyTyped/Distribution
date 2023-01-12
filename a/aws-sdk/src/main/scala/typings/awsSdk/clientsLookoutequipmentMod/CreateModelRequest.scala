package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelRequest extends StObject {
  
  /**
    * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment generates one. 
    */
  var ClientToken: IdempotenceToken
  
  /**
    * The configuration is the TargetSamplingRate, which is the sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate before training, the TargetSamplingRate is 1 minute. When providing a value for the TargetSamplingRate, you must attach the prefix "PT" to the rate you want. The value for a 1 second rate is therefore PT1S, the value for a 15 minute rate is PT15M, and the value for a 1 hour rate is PT1H 
    */
  var DataPreProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DataPreProcessingConfiguration] = js.undefined
  
  /**
    * The name of the dataset for the ML model being created. 
    */
  var DatasetName: DatasetIdentifier
  
  /**
    * The data schema for the ML model being created. 
    */
  var DatasetSchema: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetSchema] = js.undefined
  
  /**
    *  Indicates the time reference in the dataset that should be used to end the subset of evaluation data for the ML model. 
    */
  var EvaluationDataEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the time reference in the dataset that should be used to begin the subset of evaluation data for the ML model. 
    */
  var EvaluationDataStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input configuration for the labels being used for the ML model that's being created. 
    */
  var LabelsInputConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelsInputConfiguration] = js.undefined
  
  /**
    * The name for the ML model to be created.
    */
  var ModelName: typings.awsSdk.clientsLookoutequipmentMod.ModelName
  
  /**
    * Indicates that the asset associated with this sensor has been shut off. As long as this condition is met, Lookout for Equipment will not use data from this asset for training, evaluation, or inference.
    */
  var OffCondition: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.OffCondition] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the ML model. 
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Provides the identifier of the KMS key used to encrypt model data by Amazon Lookout for Equipment. 
    */
  var ServerSideKmsKeyId: js.UndefOr[NameOrArn] = js.undefined
  
  /**
    *  Any tags associated with the ML model being created. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Indicates the time reference in the dataset that should be used to end the subset of training data for the ML model. 
    */
  var TrainingDataEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the time reference in the dataset that should be used to begin the subset of training data for the ML model. 
    */
  var TrainingDataStartTime: js.UndefOr[js.Date] = js.undefined
}
object CreateModelRequest {
  
  inline def apply(ClientToken: IdempotenceToken, DatasetName: DatasetIdentifier, ModelName: ModelName): CreateModelRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DatasetName = DatasetName.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotenceToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDataPreProcessingConfiguration(value: DataPreProcessingConfiguration): Self = StObject.set(x, "DataPreProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataPreProcessingConfigurationUndefined: Self = StObject.set(x, "DataPreProcessingConfiguration", js.undefined)
    
    inline def setDatasetName(value: DatasetIdentifier): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetSchema(value: DatasetSchema): Self = StObject.set(x, "DatasetSchema", value.asInstanceOf[js.Any])
    
    inline def setDatasetSchemaUndefined: Self = StObject.set(x, "DatasetSchema", js.undefined)
    
    inline def setEvaluationDataEndTime(value: js.Date): Self = StObject.set(x, "EvaluationDataEndTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationDataEndTimeUndefined: Self = StObject.set(x, "EvaluationDataEndTime", js.undefined)
    
    inline def setEvaluationDataStartTime(value: js.Date): Self = StObject.set(x, "EvaluationDataStartTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationDataStartTimeUndefined: Self = StObject.set(x, "EvaluationDataStartTime", js.undefined)
    
    inline def setLabelsInputConfiguration(value: LabelsInputConfiguration): Self = StObject.set(x, "LabelsInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLabelsInputConfigurationUndefined: Self = StObject.set(x, "LabelsInputConfiguration", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setOffCondition(value: OffCondition): Self = StObject.set(x, "OffCondition", value.asInstanceOf[js.Any])
    
    inline def setOffConditionUndefined: Self = StObject.set(x, "OffCondition", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setServerSideKmsKeyId(value: NameOrArn): Self = StObject.set(x, "ServerSideKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerSideKmsKeyIdUndefined: Self = StObject.set(x, "ServerSideKmsKeyId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrainingDataEndTime(value: js.Date): Self = StObject.set(x, "TrainingDataEndTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataEndTimeUndefined: Self = StObject.set(x, "TrainingDataEndTime", js.undefined)
    
    inline def setTrainingDataStartTime(value: js.Date): Self = StObject.set(x, "TrainingDataStartTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataStartTimeUndefined: Self = StObject.set(x, "TrainingDataStartTime", js.undefined)
  }
}
