package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageProperties extends js.Object {
  var appId: js.UndefOr[_] = js.undefined
  var clusterId: js.UndefOr[_] = js.undefined
  var contentEncoding: js.UndefOr[_] = js.undefined
  var contentType: js.UndefOr[_] = js.undefined
  var correlationId: js.UndefOr[_] = js.undefined
  var deliveryMode: js.UndefOr[_] = js.undefined
  var expiration: js.UndefOr[_] = js.undefined
  var headers: MessagePropertyHeaders
  var messageId: js.UndefOr[_] = js.undefined
  var priority: js.UndefOr[_] = js.undefined
  var replyTo: js.UndefOr[_] = js.undefined
  var timestamp: js.UndefOr[_] = js.undefined
  var `type`: js.UndefOr[_] = js.undefined
  var userId: js.UndefOr[_] = js.undefined
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
    val __obj = js.Dynamic.literal(headers = headers)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (deliveryMode != null) __obj.updateDynamic("deliveryMode")(deliveryMode)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[MessageProperties]
  }
}

