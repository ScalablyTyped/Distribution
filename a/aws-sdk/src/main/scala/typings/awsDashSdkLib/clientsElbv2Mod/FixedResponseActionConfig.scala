package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedResponseActionConfig extends js.Object {
  /**
    * The content type. Valid Values: text/plain | text/css | text/html | application/javascript | application/json
    */
  var ContentType: js.UndefOr[FixedResponseActionContentType] = js.undefined
  /**
    * The message.
    */
  var MessageBody: js.UndefOr[FixedResponseActionMessage] = js.undefined
  /**
    * The HTTP response code (2XX, 4XX, or 5XX).
    */
  var StatusCode: FixedResponseActionStatusCode
}

object FixedResponseActionConfig {
  @scala.inline
  def apply(
    StatusCode: FixedResponseActionStatusCode,
    ContentType: FixedResponseActionContentType = null,
    MessageBody: FixedResponseActionMessage = null
  ): FixedResponseActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (MessageBody != null) __obj.updateDynamic("MessageBody")(MessageBody)
    __obj.asInstanceOf[FixedResponseActionConfig]
  }
}

