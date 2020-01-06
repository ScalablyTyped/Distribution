package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForecastExportJobRequest extends js.Object {
  /**
    * The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the location. The forecast must be exported to an Amazon S3 bucket. If encryption is used, Destination must include an AWS Key Management Service (KMS) key. The IAM role must allow Amazon Forecast permission to access the key.
    */
  var Destination: DataDestination = js.native
  /**
    * The Amazon Resource Name (ARN) of the forecast that you want to export.
    */
  var ForecastArn: Arn = js.native
  /**
    * The name for the forecast export job.
    */
  var ForecastExportJobName: Name = js.native
}

object CreateForecastExportJobRequest {
  @scala.inline
  def apply(Destination: DataDestination, ForecastArn: Arn, ForecastExportJobName: Name): CreateForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], ForecastArn = ForecastArn.asInstanceOf[js.Any], ForecastExportJobName = ForecastExportJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateForecastExportJobRequest]
  }
}

