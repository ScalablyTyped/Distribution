package typings.analyticsDashNode.analyticsDashNodeMod.AnalyticsNode

import typings.analyticsDashNode.Anon_Key
import typings.analyticsDashNode.Anon_KeyNodeVersion
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var _metadata: Anon_KeyNodeVersion
  var anonymousId: js.UndefOr[String | Double] = js.undefined
  var context: Anon_Key
  var messageId: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
  var `type`: String
  var userId: js.UndefOr[String | Double] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    _metadata: Anon_KeyNodeVersion,
    context: Anon_Key,
    `type`: String,
    anonymousId: String | Double = null,
    messageId: String = null,
    timestamp: Date = null,
    userId: String | Double = null
  ): Message = {
    val __obj = js.Dynamic.literal(_metadata = _metadata, context = context)
    __obj.updateDynamic("type")(`type`)
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

