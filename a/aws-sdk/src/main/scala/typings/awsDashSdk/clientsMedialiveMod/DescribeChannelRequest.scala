package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChannelRequest extends js.Object {
  /**
    * channel ID
    */
  var ChannelId: __string = js.native
}

object DescribeChannelRequest {
  @scala.inline
  def apply(ChannelId: __string): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeChannelRequest]
  }
}

