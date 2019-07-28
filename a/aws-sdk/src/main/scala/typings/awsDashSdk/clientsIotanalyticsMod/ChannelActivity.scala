package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelActivity extends js.Object {
  /**
    * The name of the channel from which the messages are processed.
    */
  var channelName: ChannelName
  /**
    * The name of the 'channel' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}

object ChannelActivity {
  @scala.inline
  def apply(channelName: ChannelName, name: ActivityName, next: ActivityName = null): ChannelActivity = {
    val __obj = js.Dynamic.literal(channelName = channelName, name = name)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[ChannelActivity]
  }
}

