package typings
package analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var _metadata: analyticsDashNodeLib.Anon_KeyNodeVersion
  var anonymousId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var context: analyticsDashNodeLib.Anon_Key
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date] = js.undefined
  var `type`: java.lang.String
  var userId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    _metadata: analyticsDashNodeLib.Anon_KeyNodeVersion,
    context: analyticsDashNodeLib.Anon_Key,
    `type`: java.lang.String,
    anonymousId: java.lang.String | scala.Double = null,
    messageId: java.lang.String = null,
    timestamp: stdLib.Date = null,
    userId: java.lang.String | scala.Double = null
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

