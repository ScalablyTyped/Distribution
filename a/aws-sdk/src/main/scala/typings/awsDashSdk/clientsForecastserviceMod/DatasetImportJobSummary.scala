package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetImportJobSummary extends js.Object {
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The location of the Amazon S3 bucket that contains the training data.
    */
  var DataSource: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.DataSource] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.undefined
  /**
    * Dependent on the status as follows:    CREATE_PENDING - same as CreationTime     CREATE_IN_PROGRESS - the current timestamp    ACTIVE or CREATE_FAILED - when the job finished or failed  
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Status] = js.undefined
}

object DatasetImportJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DataSource: DataSource = null,
    DatasetImportJobArn: Arn = null,
    DatasetImportJobName: Name = null,
    LastModificationTime: Timestamp = null,
    Message: ErrorMessage = null,
    Status: Status = null
  ): DatasetImportJobSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DataSource != null) __obj.updateDynamic("DataSource")(DataSource)
    if (DatasetImportJobArn != null) __obj.updateDynamic("DatasetImportJobArn")(DatasetImportJobArn)
    if (DatasetImportJobName != null) __obj.updateDynamic("DatasetImportJobName")(DatasetImportJobName)
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DatasetImportJobSummary]
  }
}

