package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsJobExecutionsRolloutConfig extends js.Object {
  /**
    * The maximum number of OTA update job executions started per minute.
    */
  var maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined
}

object AwsJobExecutionsRolloutConfig {
  @scala.inline
  def apply(maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined): AwsJobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximumPerMinute)) __obj.updateDynamic("maximumPerMinute")(maximumPerMinute)
    __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
  }
}

