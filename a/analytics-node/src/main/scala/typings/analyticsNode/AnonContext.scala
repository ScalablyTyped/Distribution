package typings.analyticsNode

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var _metadata: AnonNodeVersion
  var context: AnonDictkey
  var messageId: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
  var `type`: String
}

object AnonContext {
  @scala.inline
  def apply(
    _metadata: AnonNodeVersion,
    context: AnonDictkey,
    `type`: String,
    messageId: String = null,
    timestamp: Date = null
  ): AnonContext = {
    val __obj = js.Dynamic.literal(_metadata = _metadata.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

