package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSignalingChannelOutput extends js.Object {
  /**
    * A structure that encapsulates the specified signaling channel's metadata and properties.
    */
  var ChannelInfo: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.ChannelInfo] = js.native
}

object DescribeSignalingChannelOutput {
  @scala.inline
  def apply(ChannelInfo: ChannelInfo = null): DescribeSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    if (ChannelInfo != null) __obj.updateDynamic("ChannelInfo")(ChannelInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSignalingChannelOutput]
  }
}

