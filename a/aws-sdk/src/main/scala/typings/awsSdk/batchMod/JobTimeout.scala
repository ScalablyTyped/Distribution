package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobTimeout extends js.Object {
  /**
    * The time duration in seconds (measured from the job attempt's startedAt timestamp) after which AWS Batch terminates your jobs if they have not finished.
    */
  var attemptDurationSeconds: js.UndefOr[Integer] = js.native
}

object JobTimeout {
  @scala.inline
  def apply(attemptDurationSeconds: js.UndefOr[Integer] = js.undefined): JobTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attemptDurationSeconds)) __obj.updateDynamic("attemptDurationSeconds")(attemptDurationSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTimeout]
  }
}

