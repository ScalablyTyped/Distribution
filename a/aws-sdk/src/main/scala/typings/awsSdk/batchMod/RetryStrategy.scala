package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryStrategy extends js.Object {
  /**
    * The number of times to move a job to the RUNNABLE status. You may specify between 1 and 10 attempts. If the value of attempts is greater than one, the job is retried on failure the same number of attempts as the value.
    */
  var attempts: js.UndefOr[Integer] = js.native
}

object RetryStrategy {
  @scala.inline
  def apply(attempts: js.UndefOr[Integer] = js.undefined): RetryStrategy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attempts)) __obj.updateDynamic("attempts")(attempts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryStrategy]
  }
}

