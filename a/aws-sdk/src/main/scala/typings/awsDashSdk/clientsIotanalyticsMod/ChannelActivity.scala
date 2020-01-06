package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelActivity extends js.Object {
  /**
    * The name of the channel from which the messages are processed.
    */
  var channelName: ChannelName = js.native
  /**
    * The name of the 'channel' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}

object ChannelActivity {
  @scala.inline
  def apply(channelName: ChannelName, name: ActivityName, next: ActivityName = null): ChannelActivity = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelActivity]
  }
}

