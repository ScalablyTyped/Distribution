package typings
package amqplibLib.propertiesMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Publish extends js.Object {
  var BCC: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var CC: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var contentEncoding: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var correlationId: js.UndefOr[java.lang.String] = js.undefined
  var deliveryMode: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var expiration: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var mandatory: js.UndefOr[scala.Boolean] = js.undefined
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var replyTo: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object Publish {
  @scala.inline
  def apply(
    BCC: java.lang.String | js.Array[java.lang.String] = null,
    CC: java.lang.String | js.Array[java.lang.String] = null,
    appId: java.lang.String = null,
    contentEncoding: java.lang.String = null,
    contentType: java.lang.String = null,
    correlationId: java.lang.String = null,
    deliveryMode: scala.Boolean | scala.Double = null,
    expiration: java.lang.String | scala.Double = null,
    headers: js.Any = null,
    mandatory: js.UndefOr[scala.Boolean] = js.undefined,
    messageId: java.lang.String = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null,
    replyTo: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    userId: java.lang.String = null
  ): Publish = {
    val __obj = js.Dynamic.literal()
    if (BCC != null) __obj.updateDynamic("BCC")(BCC.asInstanceOf[js.Any])
    if (CC != null) __obj.updateDynamic("CC")(CC.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (deliveryMode != null) __obj.updateDynamic("deliveryMode")(deliveryMode.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Publish]
  }
}

