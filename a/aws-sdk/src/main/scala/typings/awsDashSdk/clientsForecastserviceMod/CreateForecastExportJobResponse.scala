package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForecastExportJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export job.
    */
  var ForecastExportJobArn: js.UndefOr[Arn] = js.native
}

object CreateForecastExportJobResponse {
  @scala.inline
  def apply(ForecastExportJobArn: Arn = null): CreateForecastExportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (ForecastExportJobArn != null) __obj.updateDynamic("ForecastExportJobArn")(ForecastExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForecastExportJobResponse]
  }
}

