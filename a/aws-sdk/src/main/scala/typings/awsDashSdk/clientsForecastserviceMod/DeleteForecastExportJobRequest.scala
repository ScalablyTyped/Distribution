package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteForecastExportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast export job to delete.
    */
  var ForecastExportJobArn: Arn = js.native
}

object DeleteForecastExportJobRequest {
  @scala.inline
  def apply(ForecastExportJobArn: Arn): DeleteForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(ForecastExportJobArn = ForecastExportJobArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteForecastExportJobRequest]
  }
}

