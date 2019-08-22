package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeForecastExportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast export job.
    */
  var ForecastExportJobArn: Arn
}

object DescribeForecastExportJobRequest {
  @scala.inline
  def apply(ForecastExportJobArn: Arn): DescribeForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(ForecastExportJobArn = ForecastExportJobArn)
  
    __obj.asInstanceOf[DescribeForecastExportJobRequest]
  }
}

