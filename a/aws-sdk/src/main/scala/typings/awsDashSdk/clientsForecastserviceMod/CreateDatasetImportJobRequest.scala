package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetImportJobRequest extends js.Object {
  /**
    * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data.
    */
  var DataSource: typings.awsDashSdk.clientsForecastserviceMod.DataSource
  /**
    * The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
    */
  var DatasetArn: Arn
  /**
    * The name for the dataset import job. It is recommended to include the current timestamp in the name to guard against getting a ResourceAlreadyExistsException exception, for example, 20190721DatasetImport.
    */
  var DatasetImportJobName: Name
  /**
    * The format of timestamps in the dataset. Two formats are supported, dependent on the DataFrequency specified when the dataset was created.   "yyyy-MM-dd" For data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D  
    */
  var TimestampFormat: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.TimestampFormat] = js.undefined
}

object CreateDatasetImportJobRequest {
  @scala.inline
  def apply(
    DataSource: DataSource,
    DatasetArn: Arn,
    DatasetImportJobName: Name,
    TimestampFormat: TimestampFormat = null
  ): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DataSource = DataSource, DatasetArn = DatasetArn, DatasetImportJobName = DatasetImportJobName)
    if (TimestampFormat != null) __obj.updateDynamic("TimestampFormat")(TimestampFormat)
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
}

