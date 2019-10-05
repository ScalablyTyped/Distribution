package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetImportJobResponse extends js.Object {
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The size of the dataset in gigabytes (GB) after completion of the import job.
    */
  var DataSize: js.UndefOr[Double] = js.undefined
  /**
    * The location of the training data to import. The training data must be stored in an Amazon S3 bucket.
    */
  var DataSource: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.DataSource] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.undefined
  /**
    * Statistical information about each field in the input data.
    */
  var FieldStatistics: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.FieldStatistics] = js.undefined
  /**
    * Dependent on the status as follows:    CREATE_PENDING - same as CreationTime     CREATE_IN_PROGRESS - the current timestamp    ACTIVE or CREATE_FAILED - when the job finished or failed  
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Message] = js.undefined
  /**
    * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Status] = js.undefined
  /**
    * The format of timestamps in the dataset. Two formats are supported dependent on the DataFrequency specified when the dataset was created.   "yyyy-MM-dd" For data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D  
    */
  var TimestampFormat: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.TimestampFormat] = js.undefined
}

object DescribeDatasetImportJobResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DataSize: Int | scala.Double = null,
    DataSource: DataSource = null,
    DatasetArn: Arn = null,
    DatasetImportJobArn: Arn = null,
    DatasetImportJobName: Name = null,
    FieldStatistics: FieldStatistics = null,
    LastModificationTime: Timestamp = null,
    Message: Message = null,
    Status: Status = null,
    TimestampFormat: TimestampFormat = null
  ): DescribeDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DataSize != null) __obj.updateDynamic("DataSize")(DataSize.asInstanceOf[js.Any])
    if (DataSource != null) __obj.updateDynamic("DataSource")(DataSource)
    if (DatasetArn != null) __obj.updateDynamic("DatasetArn")(DatasetArn)
    if (DatasetImportJobArn != null) __obj.updateDynamic("DatasetImportJobArn")(DatasetImportJobArn)
    if (DatasetImportJobName != null) __obj.updateDynamic("DatasetImportJobName")(DatasetImportJobName)
    if (FieldStatistics != null) __obj.updateDynamic("FieldStatistics")(FieldStatistics)
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (TimestampFormat != null) __obj.updateDynamic("TimestampFormat")(TimestampFormat)
    __obj.asInstanceOf[DescribeDatasetImportJobResponse]
  }
}

