package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLModelOutput extends js.Object {
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the MLModel, normalized and scaled on computation resources. ComputeTime is only available if the MLModel is in the COMPLETED state.
    */
  var ComputeTime: js.UndefOr[LongType] = js.undefined
  /**
    * The time that the MLModel was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The AWS user account from which the MLModel was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
  /**
    * The current endpoint of the MLModel
    */
  var EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
  /**
    * The epoch time when Amazon Machine Learning marked the MLModel as COMPLETED or FAILED. FinishedAt is only available when the MLModel is in the COMPLETED or FAILED state.
    */
  var FinishedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
  /**
    * The time of the most recent edit to the MLModel. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * A link to the file that contains logs of the CreateMLModel operation.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.undefined
  /**
    * The MLModel ID, which is same as the MLModelId in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
  /**
    * Identifies the MLModel category. The following are the available types:   REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?" BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?" MULTICLASS -- Produces one of several possible results. For example, "Is this a HIGH, LOW or MEDIUM risk trade?" 
    */
  var MLModelType: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.MLModelType] = js.undefined
  /**
    * A description of the most recent details about accessing the MLModel.
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.Message] = js.undefined
  /**
    * A user-supplied name or description of the MLModel.
    */
  var Name: js.UndefOr[MLModelName] = js.undefined
  /**
    * The recipe to use when training the MLModel. The Recipe provides detailed information about the observation data to use during training, and manipulations to perform on the observation data during training. Note This parameter is provided as part of the verbose format.
    */
  var Recipe: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.Recipe] = js.undefined
  /**
    * The schema used by all of the data files referenced by the DataSource. Note This parameter is provided as part of the verbose format.
    */
  var Schema: js.UndefOr[DataSchema] = js.undefined
  /**
    * The scoring threshold is used in binary classification MLModel models. It marks the boundary between a positive prediction and a negative prediction. Output values greater than or equal to the threshold receive a positive result from the MLModel, such as true. Output values less than the threshold receive a negative response from the MLModel, such as false.
    */
  var ScoreThreshold: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.ScoreThreshold] = js.undefined
  /**
    * The time of the most recent edit to the ScoreThreshold. The time is expressed in epoch time.
    */
  var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
  var SizeInBytes: js.UndefOr[LongType] = js.undefined
  /**
    * The epoch time when Amazon Machine Learning marked the MLModel as INPROGRESS. StartedAt isn't available if the MLModel is in the PENDING state.
    */
  var StartedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The current status of the MLModel. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to describe a MLModel.  INPROGRESS - The request is processing.  FAILED - The request did not run to completion. The ML model isn't usable.  COMPLETED - The request completed successfully.  DELETED - The MLModel is marked as deleted. It isn't usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.undefined
  /**
    * The ID of the training DataSource.
    */
  var TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined
  /**
    * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10. sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none. We strongly recommend that you shuffle your data.  sgd.l1RegularizationAmount - The coefficient regularization L1 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
    */
  var TrainingParameters: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.TrainingParameters] = js.undefined
}

object GetMLModelOutput {
  @scala.inline
  def apply(
    ComputeTime: Int | Double = null,
    CreatedAt: EpochTime = null,
    CreatedByIamUser: AwsUserArn = null,
    EndpointInfo: RealtimeEndpointInfo = null,
    FinishedAt: EpochTime = null,
    InputDataLocationS3: S3Url = null,
    LastUpdatedAt: EpochTime = null,
    LogUri: PresignedS3Url = null,
    MLModelId: EntityId = null,
    MLModelType: MLModelType = null,
    Message: Message = null,
    Name: MLModelName = null,
    Recipe: Recipe = null,
    Schema: DataSchema = null,
    ScoreThreshold: Int | Double = null,
    ScoreThresholdLastUpdatedAt: EpochTime = null,
    SizeInBytes: Int | Double = null,
    StartedAt: EpochTime = null,
    Status: EntityStatus = null,
    TrainingDataSourceId: EntityId = null,
    TrainingParameters: TrainingParameters = null
  ): GetMLModelOutput = {
    val __obj = js.Dynamic.literal()
    if (ComputeTime != null) __obj.updateDynamic("ComputeTime")(ComputeTime.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser)
    if (EndpointInfo != null) __obj.updateDynamic("EndpointInfo")(EndpointInfo)
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt)
    if (InputDataLocationS3 != null) __obj.updateDynamic("InputDataLocationS3")(InputDataLocationS3)
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt)
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri)
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId)
    if (MLModelType != null) __obj.updateDynamic("MLModelType")(MLModelType.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Recipe != null) __obj.updateDynamic("Recipe")(Recipe)
    if (Schema != null) __obj.updateDynamic("Schema")(Schema)
    if (ScoreThreshold != null) __obj.updateDynamic("ScoreThreshold")(ScoreThreshold.asInstanceOf[js.Any])
    if (ScoreThresholdLastUpdatedAt != null) __obj.updateDynamic("ScoreThresholdLastUpdatedAt")(ScoreThresholdLastUpdatedAt)
    if (SizeInBytes != null) __obj.updateDynamic("SizeInBytes")(SizeInBytes.asInstanceOf[js.Any])
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TrainingDataSourceId != null) __obj.updateDynamic("TrainingDataSourceId")(TrainingDataSourceId)
    if (TrainingParameters != null) __obj.updateDynamic("TrainingParameters")(TrainingParameters)
    __obj.asInstanceOf[GetMLModelOutput]
  }
}

