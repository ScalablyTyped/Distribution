package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeChannelRequest extends js.Object {
  /**
    * channel ID
    */
  var ChannelId: __string
}

object DescribeChannelRequest {
  @scala.inline
  def apply(ChannelId: __string): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId)
  
    __obj.asInstanceOf[DescribeChannelRequest]
  }
}

