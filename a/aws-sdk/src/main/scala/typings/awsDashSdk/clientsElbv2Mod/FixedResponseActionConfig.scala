package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedResponseActionConfig extends js.Object {
  /**
    * The content type. Valid Values: text/plain | text/css | text/html | application/javascript | application/json
    */
  var ContentType: js.UndefOr[FixedResponseActionContentType] = js.native
  /**
    * The message.
    */
  var MessageBody: js.UndefOr[FixedResponseActionMessage] = js.native
  /**
    * The HTTP response code (2XX, 4XX, or 5XX).
    */
  var StatusCode: FixedResponseActionStatusCode = js.native
}

object FixedResponseActionConfig {
  @scala.inline
  def apply(
    StatusCode: FixedResponseActionStatusCode,
    ContentType: FixedResponseActionContentType = null,
    MessageBody: FixedResponseActionMessage = null
  ): FixedResponseActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (MessageBody != null) __obj.updateDynamic("MessageBody")(MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedResponseActionConfig]
  }
}

