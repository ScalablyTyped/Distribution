package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /**
    *  The parameter is true if statistics need to be generated from the observation data. 
    */
  var ComputeStatistics: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.ComputeStatistics] = js.undefined
  var ComputeTime: js.UndefOr[LongType] = js.undefined
  /**
    * The time that the DataSource was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The AWS user account from which the DataSource was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
  /**
    * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a DataSource.
    */
  var DataLocationS3: js.UndefOr[S3Url] = js.undefined
  /**
    * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
    */
  var DataRearrangement: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.DataRearrangement] = js.undefined
  /**
    * The total number of observations contained in the data files that the DataSource references.
    */
  var DataSizeInBytes: js.UndefOr[LongType] = js.undefined
  /**
    * The ID that is assigned to the DataSource during creation.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
  var FinishedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * A description of the most recent details about creating the DataSource.
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.Message] = js.undefined
  /**
    * A user-supplied name or description of the DataSource.
    */
  var Name: js.UndefOr[EntityName] = js.undefined
  /**
    * The number of data files referenced by the DataSource.
    */
  var NumberOfFiles: js.UndefOr[LongType] = js.undefined
  var RDSMetadata: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.RDSMetadata] = js.undefined
  var RedshiftMetadata: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.RedshiftMetadata] = js.undefined
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.RoleARN] = js.undefined
  var StartedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    * The current status of the DataSource. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a DataSource. INPROGRESS - The creation process is underway. FAILED - The request to create a DataSource did not run to completion. It is not usable. COMPLETED - The creation process completed successfully. DELETED - The DataSource is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
    ComputeTime: js.UndefOr[LongType] = js.undefined,
    CreatedAt: EpochTime = null,
    CreatedByIamUser: AwsUserArn = null,
    DataLocationS3: S3Url = null,
    DataRearrangement: DataRearrangement = null,
    DataSizeInBytes: js.UndefOr[LongType] = js.undefined,
    DataSourceId: EntityId = null,
    FinishedAt: EpochTime = null,
    LastUpdatedAt: EpochTime = null,
    Message: Message = null,
    Name: EntityName = null,
    NumberOfFiles: js.UndefOr[LongType] = js.undefined,
    RDSMetadata: RDSMetadata = null,
    RedshiftMetadata: RedshiftMetadata = null,
    RoleARN: RoleARN = null,
    StartedAt: EpochTime = null,
    Status: EntityStatus = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ComputeStatistics)) __obj.updateDynamic("ComputeStatistics")(ComputeStatistics)
    if (!js.isUndefined(ComputeTime)) __obj.updateDynamic("ComputeTime")(ComputeTime)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser)
    if (DataLocationS3 != null) __obj.updateDynamic("DataLocationS3")(DataLocationS3)
    if (DataRearrangement != null) __obj.updateDynamic("DataRearrangement")(DataRearrangement)
    if (!js.isUndefined(DataSizeInBytes)) __obj.updateDynamic("DataSizeInBytes")(DataSizeInBytes)
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId)
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt)
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(NumberOfFiles)) __obj.updateDynamic("NumberOfFiles")(NumberOfFiles)
    if (RDSMetadata != null) __obj.updateDynamic("RDSMetadata")(RDSMetadata)
    if (RedshiftMetadata != null) __obj.updateDynamic("RedshiftMetadata")(RedshiftMetadata)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

