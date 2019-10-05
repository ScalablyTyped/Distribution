package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTimeout extends js.Object {
  /**
    * The time duration in seconds (measured from the job attempt's startedAt timestamp) after which AWS Batch terminates your jobs if they have not finished.
    */
  var attemptDurationSeconds: js.UndefOr[Integer] = js.undefined
}

object JobTimeout {
  @scala.inline
  def apply(attemptDurationSeconds: Int | Double = null): JobTimeout = {
    val __obj = js.Dynamic.literal()
    if (attemptDurationSeconds != null) __obj.updateDynamic("attemptDurationSeconds")(attemptDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTimeout]
  }
}

