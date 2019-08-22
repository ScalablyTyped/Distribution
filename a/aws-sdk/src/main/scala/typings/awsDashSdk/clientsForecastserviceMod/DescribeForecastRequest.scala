package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeForecastRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: Arn
}

object DescribeForecastRequest {
  @scala.inline
  def apply(ForecastArn: Arn): DescribeForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn)
  
    __obj.asInstanceOf[DescribeForecastRequest]
  }
}

