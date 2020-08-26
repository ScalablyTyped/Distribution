package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingConfiguration extends js.Object {
  /**
    * The retention period, in hours, for the Amazon Kinesis data.
    */
  var DataRetentionInHours: typings.awsSdk.chimeMod.DataRetentionInHours = js.native
  /**
    * When true, media streaming to Amazon Kinesis is turned off.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  /**
    * The streaming notification targets.
    */
  var StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList] = js.native
}

object StreamingConfiguration {
  @scala.inline
  def apply(DataRetentionInHours: DataRetentionInHours): StreamingConfiguration = {
    val __obj = js.Dynamic.literal(DataRetentionInHours = DataRetentionInHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingConfiguration]
  }
  @scala.inline
  implicit class StreamingConfigurationOps[Self <: StreamingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataRetentionInHours(value: DataRetentionInHours): Self = this.set("DataRetentionInHours", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    @scala.inline
    def setStreamingNotificationTargetsVarargs(value: StreamingNotificationTarget*): Self = this.set("StreamingNotificationTargets", js.Array(value :_*))
    @scala.inline
    def setStreamingNotificationTargets(value: StreamingNotificationTargetList): Self = this.set("StreamingNotificationTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingNotificationTargets: Self = this.set("StreamingNotificationTargets", js.undefined)
  }
  
}

