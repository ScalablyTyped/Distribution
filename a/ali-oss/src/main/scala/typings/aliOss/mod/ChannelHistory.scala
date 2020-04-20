package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHistory extends js.Object {
   //
  var EndTime: String
  var RemoteAddr: String
  var StartTime: String
}

object ChannelHistory {
  @scala.inline
  def apply(EndTime: String, RemoteAddr: String, StartTime: String): ChannelHistory = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], RemoteAddr = RemoteAddr.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHistory]
  }
}

