package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationDefinition extends js.Object {
  var CloudWatchLogsDestination: js.UndefOr[typings.awsDashSdk.clientsPinpointsmsvoiceMod.CloudWatchLogsDestination] = js.undefined
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  var KinesisFirehoseDestination: js.UndefOr[typings.awsDashSdk.clientsPinpointsmsvoiceMod.KinesisFirehoseDestination] = js.undefined
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
  var SnsDestination: js.UndefOr[typings.awsDashSdk.clientsPinpointsmsvoiceMod.SnsDestination] = js.undefined
}

object EventDestinationDefinition {
  @scala.inline
  def apply(
    CloudWatchLogsDestination: CloudWatchLogsDestination = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    KinesisFirehoseDestination: KinesisFirehoseDestination = null,
    MatchingEventTypes: EventTypes = null,
    SnsDestination: SnsDestination = null
  ): EventDestinationDefinition = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsDestination != null) __obj.updateDynamic("CloudWatchLogsDestination")(CloudWatchLogsDestination)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (KinesisFirehoseDestination != null) __obj.updateDynamic("KinesisFirehoseDestination")(KinesisFirehoseDestination)
    if (MatchingEventTypes != null) __obj.updateDynamic("MatchingEventTypes")(MatchingEventTypes)
    if (SnsDestination != null) __obj.updateDynamic("SnsDestination")(SnsDestination)
    __obj.asInstanceOf[EventDestinationDefinition]
  }
}

