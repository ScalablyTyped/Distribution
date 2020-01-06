package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchRetryOptions extends js.Object {
  /**
    * After an initial failure to deliver to Amazon ES, the total amount of time during which Kinesis Data Firehose retries delivery (including the first attempt). After this time has elapsed, the failed documents are written to Amazon S3. Default value is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
    */
  var DurationInSeconds: js.UndefOr[ElasticsearchRetryDurationInSeconds] = js.native
}

object ElasticsearchRetryOptions {
  @scala.inline
  def apply(DurationInSeconds: Int | Double = null): ElasticsearchRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (DurationInSeconds != null) __obj.updateDynamic("DurationInSeconds")(DurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchRetryOptions]
  }
}

