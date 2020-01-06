package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSendStatisticsResponse extends js.Object {
  /**
    * A list of data points, each of which represents 15 minutes of activity.
    */
  var SendDataPoints: js.UndefOr[SendDataPointList] = js.native
}

object GetSendStatisticsResponse {
  @scala.inline
  def apply(SendDataPoints: SendDataPointList = null): GetSendStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    if (SendDataPoints != null) __obj.updateDynamic("SendDataPoints")(SendDataPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSendStatisticsResponse]
  }
}

