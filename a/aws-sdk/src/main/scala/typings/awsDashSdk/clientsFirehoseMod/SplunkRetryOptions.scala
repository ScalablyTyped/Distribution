package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplunkRetryOptions extends js.Object {
  /**
    * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data Firehose waits for acknowledgment from Splunk after each attempt.
    */
  var DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds] = js.native
}

object SplunkRetryOptions {
  @scala.inline
  def apply(DurationInSeconds: Int | Double = null): SplunkRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (DurationInSeconds != null) __obj.updateDynamic("DurationInSeconds")(DurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplunkRetryOptions]
  }
}

