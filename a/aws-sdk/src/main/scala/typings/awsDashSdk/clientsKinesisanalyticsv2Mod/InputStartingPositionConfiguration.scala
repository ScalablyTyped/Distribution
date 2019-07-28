package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputStartingPositionConfiguration extends js.Object {
  /**
    * The starting position on the stream.    NOW - Start reading just after the most recent record in the stream, and start at the request timestamp that the customer issued.    TRIM_HORIZON - Start reading at the last untrimmed record in the stream, which is the oldest record available in the stream. This option is not available for an Amazon Kinesis Data Firehose delivery stream.    LAST_STOPPED_POINT - Resume reading from where the application last stopped reading.  
    */
  var InputStartingPosition: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputStartingPosition] = js.undefined
}

object InputStartingPositionConfiguration {
  @scala.inline
  def apply(InputStartingPosition: InputStartingPosition = null): InputStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (InputStartingPosition != null) __obj.updateDynamic("InputStartingPosition")(InputStartingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputStartingPositionConfiguration]
  }
}

