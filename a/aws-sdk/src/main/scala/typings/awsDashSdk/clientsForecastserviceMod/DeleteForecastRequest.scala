package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteForecastRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast to delete.
    */
  var ForecastArn: Arn
}

object DeleteForecastRequest {
  @scala.inline
  def apply(ForecastArn: Arn): DeleteForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn)
  
    __obj.asInstanceOf[DeleteForecastRequest]
  }
}

