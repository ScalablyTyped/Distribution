package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelEgressEndpoint extends js.Object {
  /**
    * Public IP of where a channel's output comes from
    */
  var SourceIp: js.UndefOr[__string] = js.native
}

object ChannelEgressEndpoint {
  @scala.inline
  def apply(SourceIp: __string = null): ChannelEgressEndpoint = {
    val __obj = js.Dynamic.literal()
    if (SourceIp != null) __obj.updateDynamic("SourceIp")(SourceIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEgressEndpoint]
  }
}

