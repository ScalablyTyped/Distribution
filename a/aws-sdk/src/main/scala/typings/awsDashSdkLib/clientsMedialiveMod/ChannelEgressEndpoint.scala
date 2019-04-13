package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEgressEndpoint extends js.Object {
  /**
    * Public IP of where a channel's output comes from
    */
  var SourceIp: js.UndefOr[__string] = js.undefined
}

object ChannelEgressEndpoint {
  @scala.inline
  def apply(SourceIp: __string = null): ChannelEgressEndpoint = {
    val __obj = js.Dynamic.literal()
    if (SourceIp != null) __obj.updateDynamic("SourceIp")(SourceIp)
    __obj.asInstanceOf[ChannelEgressEndpoint]
  }
}

