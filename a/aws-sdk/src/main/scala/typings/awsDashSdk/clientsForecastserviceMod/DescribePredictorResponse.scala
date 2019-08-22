package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePredictorResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm used for model training.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.undefined
  /**
    * When PerformAutoML is specified, the ARN of the chosen algorithm.
    */
  var AutoMLAlgorithmArns: js.UndefOr[ArnList] = js.undefined
  /**
    * When the model training task was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * An array of ARNs of the dataset import jobs used to import training data for the predictor.
    */
  var DatasetImportJobArns: js.UndefOr[ArnList] = js.undefined
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.EncryptionConfig] = js.undefined
  /**
    * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to perform the split and the number of iterations.
    */
  var EvaluationParameters: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.EvaluationParameters] = js.undefined
  /**
    * The featurization configuration.
    */
  var FeaturizationConfig: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.FeaturizationConfig] = js.undefined
  /**
    * The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
    */
  var ForecastHorizon: js.UndefOr[Integer] = js.undefined
  /**
    * The hyperparameter override values for the algorithm.
    */
  var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined
  /**
    * Describes the dataset group that contains the data to use to train the predictor.
    */
  var InputDataConfig: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.InputDataConfig] = js.undefined
  /**
    * Initially, the same as CreationTime (status is CREATE_PENDING). Updated when training starts (status changed to CREATE_IN_PROGRESS), and when training is complete (status changed to ACTIVE) or fails (status changed to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Message] = js.undefined
  /**
    * Whether the predictor is set to perform AutoML.
    */
  var PerformAutoML: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the predictor is set to perform HPO.
    */
  var PerformHPO: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARN of the predictor.
    */
  var PredictorArn: js.UndefOr[Name] = js.undefined
  /**
    * The name of the predictor.
    */
  var PredictorName: js.UndefOr[Name] = js.undefined
  /**
    * The status of the predictor. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED     The Status of the predictor must be ACTIVE before using the predictor to create a forecast. 
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Status] = js.undefined
  /**
    * The training parameters to override for model training. The parameters that you can override are listed in the individual algorithms in aws-forecast-choosing-recipes.
    */
  var TrainingParameters: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.TrainingParameters] = js.undefined
}

object DescribePredictorResponse {
  @scala.inline
  def apply(
    AlgorithmArn: Arn = null,
    AutoMLAlgorithmArns: ArnList = null,
    CreationTime: Timestamp = null,
    DatasetImportJobArns: ArnList = null,
    EncryptionConfig: EncryptionConfig = null,
    EvaluationParameters: EvaluationParameters = null,
    FeaturizationConfig: FeaturizationConfig = null,
    ForecastHorizon: js.UndefOr[Integer] = js.undefined,
    HPOConfig: HyperParameterTuningJobConfig = null,
    InputDataConfig: InputDataConfig = null,
    LastModificationTime: Timestamp = null,
    Message: Message = null,
    PerformAutoML: js.UndefOr[Boolean] = js.undefined,
    PerformHPO: js.UndefOr[Boolean] = js.undefined,
    PredictorArn: Name = null,
    PredictorName: Name = null,
    Status: Status = null,
    TrainingParameters: TrainingParameters = null
  ): DescribePredictorResponse = {
    val __obj = js.Dynamic.literal()
    if (AlgorithmArn != null) __obj.updateDynamic("AlgorithmArn")(AlgorithmArn)
    if (AutoMLAlgorithmArns != null) __obj.updateDynamic("AutoMLAlgorithmArns")(AutoMLAlgorithmArns)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DatasetImportJobArns != null) __obj.updateDynamic("DatasetImportJobArns")(DatasetImportJobArns)
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig)
    if (EvaluationParameters != null) __obj.updateDynamic("EvaluationParameters")(EvaluationParameters)
    if (FeaturizationConfig != null) __obj.updateDynamic("FeaturizationConfig")(FeaturizationConfig)
    if (!js.isUndefined(ForecastHorizon)) __obj.updateDynamic("ForecastHorizon")(ForecastHorizon)
    if (HPOConfig != null) __obj.updateDynamic("HPOConfig")(HPOConfig)
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig)
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (!js.isUndefined(PerformAutoML)) __obj.updateDynamic("PerformAutoML")(PerformAutoML)
    if (!js.isUndefined(PerformHPO)) __obj.updateDynamic("PerformHPO")(PerformHPO)
    if (PredictorArn != null) __obj.updateDynamic("PredictorArn")(PredictorArn)
    if (PredictorName != null) __obj.updateDynamic("PredictorName")(PredictorName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (TrainingParameters != null) __obj.updateDynamic("TrainingParameters")(TrainingParameters)
    __obj.asInstanceOf[DescribePredictorResponse]
  }
}

