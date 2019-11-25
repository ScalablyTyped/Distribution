package typings.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageProperties extends js.Object {
  var appId: js.UndefOr[js.Any] = js.undefined
  var clusterId: js.UndefOr[js.Any] = js.undefined
  var contentEncoding: js.UndefOr[js.Any] = js.undefined
  var contentType: js.UndefOr[js.Any] = js.undefined
  var correlationId: js.UndefOr[js.Any] = js.undefined
  var deliveryMode: js.UndefOr[js.Any] = js.undefined
  var expiration: js.UndefOr[js.Any] = js.undefined
  var headers: MessagePropertyHeaders
  var messageId: js.UndefOr[js.Any] = js.undefined
  var priority: js.UndefOr[js.Any] = js.undefined
  var replyTo: js.UndefOr[js.Any] = js.undefined
  var timestamp: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[js.Any] = js.undefined
  var userId: js.UndefOr[js.Any] = js.undefined
}

object MessageProperties {
  @scala.inline
  def apply(
    headers: MessagePropertyHeaders,
    appId: js.Any = null,
    clusterId: js.Any = null,
    contentEncoding: js.Any = null,
    contentType: js.Any = null,
    correlationId: js.Any = null,
    deliveryMode: js.Any = null,
    expiration: js.Any = null,
    messageId: js.Any = null,
    priority: js.Any = null,
    replyTo: js.Any = null,
    timestamp: js.Any = null,
    `type`: js.Any = null,
    userId: js.Any = null
  ): MessageProperties = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (deliveryMode != null) __obj.updateDynamic("deliveryMode")(deliveryMode.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageProperties]
  }
}

