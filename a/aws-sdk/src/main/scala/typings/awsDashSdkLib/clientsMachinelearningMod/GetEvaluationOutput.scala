package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEvaluationOutput extends js.Object {
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the Evaluation, normalized and scaled on computation resources. ComputeTime is only available if the Evaluation is in the COMPLETED state.
    */
  var ComputeTime: js.UndefOr[LongType] = js.undefined
  /**
    * The time that the Evaluation was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
  /**
    * The DataSource used for this evaluation.
    */
  var EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined
  /**
    * The evaluation ID which is same as the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.undefined
  /**
    * The epoch time when Amazon Machine Learning marked the Evaluation as COMPLETED or FAILED. FinishedAt is only available when the Evaluation is in the COMPLETED or FAILED state.
    */
  var FinishedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
  /**
    * The time of the most recent edit to the Evaluation. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * A link to the file that contains logs of the CreateEvaluation operation.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.undefined
  /**
    * The ID of the MLModel that was the focus of the evaluation.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
  /**
    * A description of the most recent details about evaluating the MLModel.
    */
  var Message: js.UndefOr[Message] = js.undefined
  /**
    * A user-supplied name or description of the Evaluation. 
    */
  var Name: js.UndefOr[EntityName] = js.undefined
  /**
    * Measurements of how well the MLModel performed using observations referenced by the DataSource. One of the following metric is returned based on the type of the MLModel:    BinaryAUC: A binary MLModel uses the Area Under the Curve (AUC) technique to measure performance.    RegressionRMSE: A regression MLModel uses the Root Mean Square Error (RMSE) technique to measure performance. RMSE measures the difference between predicted and actual values for a single variable.   MulticlassAvgFScore: A multiclass MLModel uses the F1 score technique to measure performance.     For more information about performance metrics, please see the Amazon Machine Learning Developer Guide. 
    */
  var PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined
  /**
    * The epoch time when Amazon Machine Learning marked the Evaluation as INPROGRESS. StartedAt isn't available if the Evaluation is in the PENDING state.
    */
  var StartedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The status of the evaluation. This element can have one of the following values:   PENDING - Amazon Machine Language (Amazon ML) submitted a request to evaluate an MLModel.  INPROGRESS - The evaluation is underway.  FAILED - The request to evaluate an MLModel did not run to completion. It is not usable.  COMPLETED - The evaluation process completed successfully.  DELETED - The Evaluation is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.undefined
}

object GetEvaluationOutput {
  @scala.inline
  def apply(
    ComputeTime: js.UndefOr[LongType] = js.undefined,
    CreatedAt: EpochTime = null,
    CreatedByIamUser: AwsUserArn = null,
    EvaluationDataSourceId: EntityId = null,
    EvaluationId: EntityId = null,
    FinishedAt: EpochTime = null,
    InputDataLocationS3: S3Url = null,
    LastUpdatedAt: EpochTime = null,
    LogUri: PresignedS3Url = null,
    MLModelId: EntityId = null,
    Message: Message = null,
    Name: EntityName = null,
    PerformanceMetrics: PerformanceMetrics = null,
    StartedAt: EpochTime = null,
    Status: EntityStatus = null
  ): GetEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ComputeTime)) __obj.updateDynamic("ComputeTime")(ComputeTime)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser)
    if (EvaluationDataSourceId != null) __obj.updateDynamic("EvaluationDataSourceId")(EvaluationDataSourceId)
    if (EvaluationId != null) __obj.updateDynamic("EvaluationId")(EvaluationId)
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt)
    if (InputDataLocationS3 != null) __obj.updateDynamic("InputDataLocationS3")(InputDataLocationS3)
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt)
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri)
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PerformanceMetrics != null) __obj.updateDynamic("PerformanceMetrics")(PerformanceMetrics)
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEvaluationOutput]
  }
}

