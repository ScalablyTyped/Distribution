package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHistory extends js.Object {
   //
  var EndTime: java.lang.String
  var RemoteAddr: java.lang.String
  var StartTime: java.lang.String
}

object ChannelHistory {
  @scala.inline
  def apply(EndTime: java.lang.String, RemoteAddr: java.lang.String, StartTime: java.lang.String): ChannelHistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EndTime")(EndTime)
    __obj.updateDynamic("RemoteAddr")(RemoteAddr)
    __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[ChannelHistory]
  }
}

