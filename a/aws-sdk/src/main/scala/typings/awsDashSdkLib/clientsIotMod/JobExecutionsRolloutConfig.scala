package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionsRolloutConfig extends js.Object {
  /**
    * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
    */
  var exponentialRate: js.UndefOr[ExponentialRolloutRate] = js.undefined
  /**
    * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
    */
  var maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin] = js.undefined
}

object JobExecutionsRolloutConfig {
  @scala.inline
  def apply(
    exponentialRate: ExponentialRolloutRate = null,
    maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin] = js.undefined
  ): JobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    if (exponentialRate != null) __obj.updateDynamic("exponentialRate")(exponentialRate)
    if (!js.isUndefined(maximumPerMinute)) __obj.updateDynamic("maximumPerMinute")(maximumPerMinute)
    __obj.asInstanceOf[JobExecutionsRolloutConfig]
  }
}

