package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplunkRetryOptions extends js.Object {
  /**
    * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data Firehose waits for acknowledgment from Splunk after each attempt.
    */
  var DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds] = js.undefined
}

object SplunkRetryOptions {
  @scala.inline
  def apply(DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds] = js.undefined): SplunkRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationInSeconds)) __obj.updateDynamic("DurationInSeconds")(DurationInSeconds)
    __obj.asInstanceOf[SplunkRetryOptions]
  }
}

