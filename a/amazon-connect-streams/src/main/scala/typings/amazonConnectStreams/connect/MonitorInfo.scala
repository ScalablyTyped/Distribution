package typings.amazonConnectStreams.connect

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorInfo extends js.Object {
  val agentName: String
  val customerName: String
  val joinTime: Date
}

object MonitorInfo {
  @scala.inline
  def apply(agentName: String, customerName: String, joinTime: Date): MonitorInfo = {
    val __obj = js.Dynamic.literal(agentName = agentName.asInstanceOf[js.Any], customerName = customerName.asInstanceOf[js.Any], joinTime = joinTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfo]
  }
}

