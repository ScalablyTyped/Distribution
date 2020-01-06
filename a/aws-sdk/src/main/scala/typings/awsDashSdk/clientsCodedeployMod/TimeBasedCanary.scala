package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBasedCanary extends js.Object {
  /**
    * The number of minutes between the first and second traffic shifts of a TimeBasedCanary deployment.
    */
  var canaryInterval: js.UndefOr[WaitTimeInMins] = js.native
  /**
    * The percentage of traffic to shift in the first increment of a TimeBasedCanary deployment.
    */
  var canaryPercentage: js.UndefOr[Percentage] = js.native
}

object TimeBasedCanary {
  @scala.inline
  def apply(canaryInterval: Int | Double = null, canaryPercentage: Int | Double = null): TimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    if (canaryInterval != null) __obj.updateDynamic("canaryInterval")(canaryInterval.asInstanceOf[js.Any])
    if (canaryPercentage != null) __obj.updateDynamic("canaryPercentage")(canaryPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBasedCanary]
  }
}

