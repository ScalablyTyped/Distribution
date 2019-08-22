package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeForecastExportJobResponse extends js.Object {
  /**
    * When the forecast export job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The path to the AWS S3 bucket where the forecast is exported.
    */
  var Destination: js.UndefOr[DataDestination] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the exported forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the forecast export job.
    */
  var ForecastExportJobArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the forecast export job.
    */
  var ForecastExportJobName: js.UndefOr[Name] = js.undefined
  /**
    * When the last successful export job finished.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Message] = js.undefined
  /**
    * The status of the forecast export job. One of the following states:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast export job must be ACTIVE before you can access the forecast in your Amazon S3 bucket. 
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Status] = js.undefined
}

object DescribeForecastExportJobResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    Destination: DataDestination = null,
    ForecastArn: Arn = null,
    ForecastExportJobArn: Arn = null,
    ForecastExportJobName: Name = null,
    LastModificationTime: Timestamp = null,
    Message: Message = null,
    Status: Status = null
  ): DescribeForecastExportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (ForecastArn != null) __obj.updateDynamic("ForecastArn")(ForecastArn)
    if (ForecastExportJobArn != null) __obj.updateDynamic("ForecastExportJobArn")(ForecastExportJobArn)
    if (ForecastExportJobName != null) __obj.updateDynamic("ForecastExportJobName")(ForecastExportJobName)
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DescribeForecastExportJobResponse]
  }
}

