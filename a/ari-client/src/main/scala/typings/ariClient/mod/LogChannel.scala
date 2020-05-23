package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogChannel extends js.Object {
  /* Properties */
  var channel: String
  var configuration: String
  var status: String
  var `type`: String
}

object LogChannel {
  @scala.inline
  def apply(channel: String, configuration: String, status: String, `type`: String): LogChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogChannel]
  }
}

