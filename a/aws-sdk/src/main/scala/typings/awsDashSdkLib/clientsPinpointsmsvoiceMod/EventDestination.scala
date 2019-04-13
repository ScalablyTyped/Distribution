package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestination extends js.Object {
  var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination] = js.undefined
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
  /**
    * A name that identifies the event destination configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
  var SnsDestination: js.UndefOr[SnsDestination] = js.undefined
}

object EventDestination {
  @scala.inline
  def apply(
    CloudWatchLogsDestination: CloudWatchLogsDestination = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    KinesisFirehoseDestination: KinesisFirehoseDestination = null,
    MatchingEventTypes: EventTypes = null,
    Name: String = null,
    SnsDestination: SnsDestination = null
  ): EventDestination = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsDestination != null) __obj.updateDynamic("CloudWatchLogsDestination")(CloudWatchLogsDestination)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (KinesisFirehoseDestination != null) __obj.updateDynamic("KinesisFirehoseDestination")(KinesisFirehoseDestination)
    if (MatchingEventTypes != null) __obj.updateDynamic("MatchingEventTypes")(MatchingEventTypes)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SnsDestination != null) __obj.updateDynamic("SnsDestination")(SnsDestination)
    __obj.asInstanceOf[EventDestination]
  }
}

