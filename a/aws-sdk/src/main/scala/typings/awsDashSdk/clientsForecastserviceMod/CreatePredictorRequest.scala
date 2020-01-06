package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePredictorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if PerformAutoML is not set to true.  Supported algorithms:     arn:aws:forecast:::algorithm/ARIMA     arn:aws:forecast:::algorithm/Deep_AR_Plus  Supports hyperparameter optimization (HPO)    arn:aws:forecast:::algorithm/ETS     arn:aws:forecast:::algorithm/NPTS     arn:aws:forecast:::algorithm/Prophet   
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.EncryptionConfig] = js.native
  /**
    * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to perform the split and the number of iterations.
    */
  var EvaluationParameters: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.EvaluationParameters] = js.native
  /**
    * The featurization configuration.
    */
  var FeaturizationConfig: typings.awsDashSdk.clientsForecastserviceMod.FeaturizationConfig = js.native
  /**
    * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the prediction length. For example, if you configure a dataset for daily data collection (using the DataFrequency parameter of the CreateDataset operation) and set the forecast horizon to 10, the model returns predictions for 10 days. The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
    */
  var ForecastHorizon: Integer = js.native
  /**
    * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization (HPO). For more information, see aws-forecast-choosing-recipes. If you included the HPOConfig object, you must set PerformHPO to true.
    */
  var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.native
  /**
    * Describes the dataset group that contains the data to use to train the predictor.
    */
  var InputDataConfig: typings.awsDashSdk.clientsForecastserviceMod.InputDataConfig = js.native
  /**
    * Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides and chooses the best algorithm and configuration for your training dataset. The default value is false. In this case, you are required to specify an algorithm. Set PerformAutoML to true to have Amazon Forecast perform AutoML. This is a good option if you aren't sure which algorithm is suitable for your training data. In this case, PerformHPO must be false.
    */
  var PerformAutoML: js.UndefOr[Boolean] = js.native
  /**
    * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training data. The process of performing HPO is known as running a hyperparameter tuning job. The default value is false. In this case, Amazon Forecast uses default hyperparameter values from the chosen algorithm. To override the default values, set PerformHPO to true and, optionally, supply the HyperParameterTuningJobConfig object. The tuning job specifies a metric to optimize, which hyperparameters participate in tuning, and the valid range for each tunable hyperparameter. In this case, you are required to specify an algorithm and PerformAutoML must be false. The following algorithm supports HPO:   DeepAR+  
    */
  var PerformHPO: js.UndefOr[Boolean] = js.native
  /**
    * A name for the predictor.
    */
  var PredictorName: Name = js.native
  /**
    * The hyperparameters to override for model training. The hyperparameters that you can override are listed in the individual algorithms. For the list of supported algorithms, see aws-forecast-choosing-recipes.
    */
  var TrainingParameters: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.TrainingParameters] = js.native
}

object CreatePredictorRequest {
  @scala.inline
  def apply(
    FeaturizationConfig: FeaturizationConfig,
    ForecastHorizon: Integer,
    InputDataConfig: InputDataConfig,
    PredictorName: Name,
    AlgorithmArn: Arn = null,
    EncryptionConfig: EncryptionConfig = null,
    EvaluationParameters: EvaluationParameters = null,
    HPOConfig: HyperParameterTuningJobConfig = null,
    PerformAutoML: js.UndefOr[scala.Boolean] = js.undefined,
    PerformHPO: js.UndefOr[scala.Boolean] = js.undefined,
    TrainingParameters: TrainingParameters = null
  ): CreatePredictorRequest = {
    val __obj = js.Dynamic.literal(FeaturizationConfig = FeaturizationConfig.asInstanceOf[js.Any], ForecastHorizon = ForecastHorizon.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], PredictorName = PredictorName.asInstanceOf[js.Any])
    if (AlgorithmArn != null) __obj.updateDynamic("AlgorithmArn")(AlgorithmArn.asInstanceOf[js.Any])
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig.asInstanceOf[js.Any])
    if (EvaluationParameters != null) __obj.updateDynamic("EvaluationParameters")(EvaluationParameters.asInstanceOf[js.Any])
    if (HPOConfig != null) __obj.updateDynamic("HPOConfig")(HPOConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(PerformAutoML)) __obj.updateDynamic("PerformAutoML")(PerformAutoML.asInstanceOf[js.Any])
    if (!js.isUndefined(PerformHPO)) __obj.updateDynamic("PerformHPO")(PerformHPO.asInstanceOf[js.Any])
    if (TrainingParameters != null) __obj.updateDynamic("TrainingParameters")(TrainingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePredictorRequest]
  }
}

