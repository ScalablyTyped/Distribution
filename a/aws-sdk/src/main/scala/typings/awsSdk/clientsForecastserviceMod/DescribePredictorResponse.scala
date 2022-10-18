package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePredictorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm used for model training.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * When PerformAutoML is specified, the ARN of the chosen algorithm.
    */
  var AutoMLAlgorithmArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    *   The LatencyOptimized AutoML override strategy is only available in private beta. Contact AWS Support or your account manager to learn more about access privileges.   The AutoML strategy used to train the predictor. Unless LatencyOptimized is specified, the AutoML strategy optimizes predictor accuracy. This parameter is only valid for predictors trained using AutoML.
    */
  var AutoMLOverrideStrategy: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.AutoMLOverrideStrategy] = js.undefined
  
  /**
    * When the model training task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
    */
  var DatasetImportJobArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.EncryptionConfig] = js.undefined
  
  /**
    * The estimated time remaining in minutes for the predictor training job to complete.
    */
  var EstimatedTimeRemainingInMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to perform the split and the number of iterations.
    */
  var EvaluationParameters: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.EvaluationParameters] = js.undefined
  
  /**
    * The featurization configuration.
    */
  var FeaturizationConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.FeaturizationConfig] = js.undefined
  
  /**
    * The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
    */
  var ForecastHorizon: js.UndefOr[Integer] = js.undefined
  
  /**
    * The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"] 
    */
  var ForecastTypes: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ForecastTypes] = js.undefined
  
  /**
    * The hyperparameter override values for the algorithm.
    */
  var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined
  
  /**
    * Describes the dataset group that contains the data to use to train the predictor.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.InputDataConfig] = js.undefined
  
  /**
    * Whether the predictor was created with CreateAutoPredictor.
    */
  var IsAutoPredictor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Message] = js.undefined
  
  /**
    * The accuracy metric used to optimize the predictor.
    */
  var OptimizationMetric: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.OptimizationMetric] = js.undefined
  
  /**
    * Whether the predictor is set to perform AutoML.
    */
  var PerformAutoML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the predictor is set to perform hyperparameter optimization (HPO).
    */
  var PerformHPO: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the predictor.
    */
  var PredictorArn: js.UndefOr[Name] = js.undefined
  
  /**
    * Details on the the status and results of the backtests performed to evaluate the accuracy of the predictor. You specify the number of backtests to perform when you call the operation.
    */
  var PredictorExecutionDetails: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.PredictorExecutionDetails] = js.undefined
  
  /**
    * The name of the predictor.
    */
  var PredictorName: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the predictor. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     CREATE_STOPPING, CREATE_STOPPED     The Status of the predictor must be ACTIVE before you can use the predictor to create a forecast. 
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
  
  /**
    * The default training parameters or overrides selected during model training. When running AutoML or choosing HPO with CNN-QR or DeepAR+, the optimized values for the chosen hyperparameters are returned. For more information, see aws-forecast-choosing-recipes.
    */
  var TrainingParameters: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TrainingParameters] = js.undefined
}
object DescribePredictorResponse {
  
  inline def apply(): DescribePredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePredictorResponse]
  }
  
  extension [Self <: DescribePredictorResponse](x: Self) {
    
    inline def setAlgorithmArn(value: Arn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmArnUndefined: Self = StObject.set(x, "AlgorithmArn", js.undefined)
    
    inline def setAutoMLAlgorithmArns(value: ArnList): Self = StObject.set(x, "AutoMLAlgorithmArns", value.asInstanceOf[js.Any])
    
    inline def setAutoMLAlgorithmArnsUndefined: Self = StObject.set(x, "AutoMLAlgorithmArns", js.undefined)
    
    inline def setAutoMLAlgorithmArnsVarargs(value: Arn*): Self = StObject.set(x, "AutoMLAlgorithmArns", js.Array(value*))
    
    inline def setAutoMLOverrideStrategy(value: AutoMLOverrideStrategy): Self = StObject.set(x, "AutoMLOverrideStrategy", value.asInstanceOf[js.Any])
    
    inline def setAutoMLOverrideStrategyUndefined: Self = StObject.set(x, "AutoMLOverrideStrategy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDatasetImportJobArns(value: ArnList): Self = StObject.set(x, "DatasetImportJobArns", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobArnsUndefined: Self = StObject.set(x, "DatasetImportJobArns", js.undefined)
    
    inline def setDatasetImportJobArnsVarargs(value: Arn*): Self = StObject.set(x, "DatasetImportJobArns", js.Array(value*))
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
    
    inline def setEstimatedTimeRemainingInMinutes(value: Long): Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeRemainingInMinutesUndefined: Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", js.undefined)
    
    inline def setEvaluationParameters(value: EvaluationParameters): Self = StObject.set(x, "EvaluationParameters", value.asInstanceOf[js.Any])
    
    inline def setEvaluationParametersUndefined: Self = StObject.set(x, "EvaluationParameters", js.undefined)
    
    inline def setFeaturizationConfig(value: FeaturizationConfig): Self = StObject.set(x, "FeaturizationConfig", value.asInstanceOf[js.Any])
    
    inline def setFeaturizationConfigUndefined: Self = StObject.set(x, "FeaturizationConfig", js.undefined)
    
    inline def setForecastHorizon(value: Integer): Self = StObject.set(x, "ForecastHorizon", value.asInstanceOf[js.Any])
    
    inline def setForecastHorizonUndefined: Self = StObject.set(x, "ForecastHorizon", js.undefined)
    
    inline def setForecastTypes(value: ForecastTypes): Self = StObject.set(x, "ForecastTypes", value.asInstanceOf[js.Any])
    
    inline def setForecastTypesUndefined: Self = StObject.set(x, "ForecastTypes", js.undefined)
    
    inline def setForecastTypesVarargs(value: ForecastType*): Self = StObject.set(x, "ForecastTypes", js.Array(value*))
    
    inline def setHPOConfig(value: HyperParameterTuningJobConfig): Self = StObject.set(x, "HPOConfig", value.asInstanceOf[js.Any])
    
    inline def setHPOConfigUndefined: Self = StObject.set(x, "HPOConfig", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setIsAutoPredictor(value: Boolean): Self = StObject.set(x, "IsAutoPredictor", value.asInstanceOf[js.Any])
    
    inline def setIsAutoPredictorUndefined: Self = StObject.set(x, "IsAutoPredictor", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setOptimizationMetric(value: OptimizationMetric): Self = StObject.set(x, "OptimizationMetric", value.asInstanceOf[js.Any])
    
    inline def setOptimizationMetricUndefined: Self = StObject.set(x, "OptimizationMetric", js.undefined)
    
    inline def setPerformAutoML(value: Boolean): Self = StObject.set(x, "PerformAutoML", value.asInstanceOf[js.Any])
    
    inline def setPerformAutoMLUndefined: Self = StObject.set(x, "PerformAutoML", js.undefined)
    
    inline def setPerformHPO(value: Boolean): Self = StObject.set(x, "PerformHPO", value.asInstanceOf[js.Any])
    
    inline def setPerformHPOUndefined: Self = StObject.set(x, "PerformHPO", js.undefined)
    
    inline def setPredictorArn(value: Name): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    inline def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
    
    inline def setPredictorExecutionDetails(value: PredictorExecutionDetails): Self = StObject.set(x, "PredictorExecutionDetails", value.asInstanceOf[js.Any])
    
    inline def setPredictorExecutionDetailsUndefined: Self = StObject.set(x, "PredictorExecutionDetails", js.undefined)
    
    inline def setPredictorName(value: Name): Self = StObject.set(x, "PredictorName", value.asInstanceOf[js.Any])
    
    inline def setPredictorNameUndefined: Self = StObject.set(x, "PredictorName", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrainingParameters(value: TrainingParameters): Self = StObject.set(x, "TrainingParameters", value.asInstanceOf[js.Any])
    
    inline def setTrainingParametersUndefined: Self = StObject.set(x, "TrainingParameters", js.undefined)
  }
}
