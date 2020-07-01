package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogChannel extends js.Object {
  /**
    * The log channel path.
    */
  var channel: String
  /**
    * The various log levels.
    */
  var configuration: String
  /**
    * Whether or not a log type is enabled.
    */
  var status: String
  /**
    * Types of logs for the log channel.
    */
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

