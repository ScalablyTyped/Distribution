package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBatchPredictionOutput extends js.Object {
  /**
    * The ID of the DataSource that was used to create the BatchPrediction. 
    */
  var BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined
  /**
    * An ID assigned to the BatchPrediction at creation. This value should be identical to the value of the BatchPredictionID in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the BatchPrediction, normalized and scaled on computation resources. ComputeTime is only available if the BatchPrediction is in the COMPLETED state.
    */
  var ComputeTime: js.UndefOr[LongType] = js.undefined
  /**
    * The time when the BatchPrediction was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The AWS user account that invoked the BatchPrediction. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
  /**
    * The epoch time when Amazon Machine Learning marked the BatchPrediction as COMPLETED or FAILED. FinishedAt is only available when the BatchPrediction is in the COMPLETED or FAILED state.
    */
  var FinishedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
  /**
    * The number of invalid records that Amazon Machine Learning saw while processing the BatchPrediction.
    */
  var InvalidRecordCount: js.UndefOr[LongType] = js.undefined
  /**
    * The time of the most recent edit to BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * A link to the file that contains logs of the CreateBatchPrediction operation.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.undefined
  /**
    * The ID of the MLModel that generated predictions for the BatchPrediction request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
  /**
    * A description of the most recent details about processing the batch prediction request.
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.Message] = js.undefined
  /**
    * A user-supplied name or description of the BatchPrediction.
    */
  var Name: js.UndefOr[EntityName] = js.undefined
  /**
    * The location of an Amazon S3 bucket or directory to receive the operation results.
    */
  var OutputUri: js.UndefOr[S3Url] = js.undefined
  /**
    * The epoch time when Amazon Machine Learning marked the BatchPrediction as INPROGRESS. StartedAt isn't available if the BatchPrediction is in the PENDING state.
    */
  var StartedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The status of the BatchPrediction, which can be one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to generate batch predictions.  INPROGRESS - The batch predictions are in progress.  FAILED - The request to perform a batch prediction did not run to completion. It is not usable.  COMPLETED - The batch prediction process completed successfully.  DELETED - The BatchPrediction is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.undefined
  /**
    * The number of total records that Amazon Machine Learning saw while processing the BatchPrediction.
    */
  var TotalRecordCount: js.UndefOr[LongType] = js.undefined
}

object GetBatchPredictionOutput {
  @scala.inline
  def apply(
    BatchPredictionDataSourceId: EntityId = null,
    BatchPredictionId: EntityId = null,
    ComputeTime: js.UndefOr[LongType] = js.undefined,
    CreatedAt: EpochTime = null,
    CreatedByIamUser: AwsUserArn = null,
    FinishedAt: EpochTime = null,
    InputDataLocationS3: S3Url = null,
    InvalidRecordCount: js.UndefOr[LongType] = js.undefined,
    LastUpdatedAt: EpochTime = null,
    LogUri: PresignedS3Url = null,
    MLModelId: EntityId = null,
    Message: Message = null,
    Name: EntityName = null,
    OutputUri: S3Url = null,
    StartedAt: EpochTime = null,
    Status: EntityStatus = null,
    TotalRecordCount: js.UndefOr[LongType] = js.undefined
  ): GetBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    if (BatchPredictionDataSourceId != null) __obj.updateDynamic("BatchPredictionDataSourceId")(BatchPredictionDataSourceId)
    if (BatchPredictionId != null) __obj.updateDynamic("BatchPredictionId")(BatchPredictionId)
    if (!js.isUndefined(ComputeTime)) __obj.updateDynamic("ComputeTime")(ComputeTime)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser)
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt)
    if (InputDataLocationS3 != null) __obj.updateDynamic("InputDataLocationS3")(InputDataLocationS3)
    if (!js.isUndefined(InvalidRecordCount)) __obj.updateDynamic("InvalidRecordCount")(InvalidRecordCount)
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt)
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri)
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OutputUri != null) __obj.updateDynamic("OutputUri")(OutputUri)
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalRecordCount)) __obj.updateDynamic("TotalRecordCount")(TotalRecordCount)
    __obj.asInstanceOf[GetBatchPredictionOutput]
  }
}

