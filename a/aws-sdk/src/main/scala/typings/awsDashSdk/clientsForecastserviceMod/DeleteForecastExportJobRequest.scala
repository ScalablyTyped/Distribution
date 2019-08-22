package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteForecastExportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast export job to delete.
    */
  var ForecastExportJobArn: Arn
}

object DeleteForecastExportJobRequest {
  @scala.inline
  def apply(ForecastExportJobArn: Arn): DeleteForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(ForecastExportJobArn = ForecastExportJobArn)
  
    __obj.asInstanceOf[DeleteForecastExportJobRequest]
  }
}

