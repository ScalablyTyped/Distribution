package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftRetryOptions extends js.Object {
  /**
    * The length of time during which Kinesis Data Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Kinesis Data Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
    */
  var DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds] = js.undefined
}

object RedshiftRetryOptions {
  @scala.inline
  def apply(DurationInSeconds: Int | Double = null): RedshiftRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (DurationInSeconds != null) __obj.updateDynamic("DurationInSeconds")(DurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftRetryOptions]
  }
}

