package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEvent extends js.Object {
  /**
    * The time when the event occurred. 
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon S3 URL of the event's log file.
    */
  var LogUrl: js.UndefOr[String] = js.undefined
  /**
    * A human-readable informational or status message.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The name of the server on or for which the event occurred. 
    */
  var ServerName: js.UndefOr[String] = js.undefined
}

object ServerEvent {
  @scala.inline
  def apply(
    CreatedAt: Timestamp = null,
    LogUrl: String = null,
    Message: String = null,
    ServerName: String = null
  ): ServerEvent = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (LogUrl != null) __obj.updateDynamic("LogUrl")(LogUrl)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    __obj.asInstanceOf[ServerEvent]
  }
}

