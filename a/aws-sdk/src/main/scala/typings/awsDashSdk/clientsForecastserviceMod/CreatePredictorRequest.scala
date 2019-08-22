package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePredictorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if PerformAutoML is not set to true.  Supported algorithms     arn:aws:forecast:::algorithm/ARIMA     arn:aws:forecast:::algorithm/Deep_AR_Plus   - supports hyperparameter optimization (HPO)     arn:aws:forecast:::algorithm/ETS     arn:aws:forecast:::algorithm/NPTS     arn:aws:forecast:::algorithm/Prophet   
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.undefined
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
  var FeaturizationConfig: typings.awsDashSdk.clientsForecastserviceMod.FeaturizationConfig
  /**
    * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the prediction length. For example, if you configure a dataset for daily data collection (using the DataFrequency parameter of the CreateDataset operation) and set the forecast horizon to 10, the model returns predictions for 10 days.
    */
  var ForecastHorizon: Integer
  /**
    * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization (HPO). For more information, see aws-forecast-choosing-recipes.
    */
  var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined
  /**
    * Describes the dataset group that contains the data to use to train the predictor.
    */
  var InputDataConfig: typings.awsDashSdk.clientsForecastserviceMod.InputDataConfig
  /**
    * Whether to perform AutoML. The default value is false. In this case, you are required to specify an algorithm. If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and configuration for your training dataset, set PerformAutoML to true. This is a good option if you aren't sure which algorithm is suitable for your application.
    */
  var PerformAutoML: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training data. The process of performing HPO is known as a hyperparameter tuning job. The default value is false. In this case, Amazon Forecast uses default hyperparameter values from the chosen algorithm. To override the default values, set PerformHPO to true and supply the HyperParameterTuningJobConfig object. The tuning job specifies an objective metric, the hyperparameters to optimize, and the valid range for each hyperparameter. The following algorithms support HPO:   DeepAR+  
    */
  var PerformHPO: js.UndefOr[Boolean] = js.undefined
  /**
    * A name for the predictor.
    */
  var PredictorName: Name
  /**
    * The training parameters to override for model training. The parameters that you can override are listed in the individual algorithms in aws-forecast-choosing-recipes.
    */
  var TrainingParameters: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.TrainingParameters] = js.undefined
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
    PerformAutoML: js.UndefOr[Boolean] = js.undefined,
    PerformHPO: js.UndefOr[Boolean] = js.undefined,
    TrainingParameters: TrainingParameters = null
  ): CreatePredictorRequest = {
    val __obj = js.Dynamic.literal(FeaturizationConfig = FeaturizationConfig, ForecastHorizon = ForecastHorizon, InputDataConfig = InputDataConfig, PredictorName = PredictorName)
    if (AlgorithmArn != null) __obj.updateDynamic("AlgorithmArn")(AlgorithmArn)
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig)
    if (EvaluationParameters != null) __obj.updateDynamic("EvaluationParameters")(EvaluationParameters)
    if (HPOConfig != null) __obj.updateDynamic("HPOConfig")(HPOConfig)
    if (!js.isUndefined(PerformAutoML)) __obj.updateDynamic("PerformAutoML")(PerformAutoML)
    if (!js.isUndefined(PerformHPO)) __obj.updateDynamic("PerformHPO")(PerformHPO)
    if (TrainingParameters != null) __obj.updateDynamic("TrainingParameters")(TrainingParameters)
    __obj.asInstanceOf[CreatePredictorRequest]
  }
}

