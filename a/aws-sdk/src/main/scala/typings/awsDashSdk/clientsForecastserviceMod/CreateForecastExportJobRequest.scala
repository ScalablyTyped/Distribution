package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateForecastExportJobRequest extends js.Object {
  /**
    * The path to the Amazon S3 bucket where you want to save the forecast and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the bucket.
    */
  var Destination: DataDestination
  /**
    * The Amazon Resource Name (ARN) of the forecast that you want to export.
    */
  var ForecastArn: Arn
  /**
    * The name for the forecast export job.
    */
  var ForecastExportJobName: Name
}

object CreateForecastExportJobRequest {
  @scala.inline
  def apply(Destination: DataDestination, ForecastArn: Arn, ForecastExportJobName: Name): CreateForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination, ForecastArn = ForecastArn, ForecastExportJobName = ForecastExportJobName)
  
    __obj.asInstanceOf[CreateForecastExportJobRequest]
  }
}

