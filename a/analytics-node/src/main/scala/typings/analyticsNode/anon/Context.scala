package typings.analyticsNode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var _metadata: NodeVersion
  var context: Dictkey
  var messageId: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
  var `type`: String
}

object Context {
  @scala.inline
  def apply(
    _metadata: NodeVersion,
    context: Dictkey,
    `type`: String,
    messageId: String = null,
    timestamp: Date = null
  ): Context = {
    val __obj = js.Dynamic.literal(_metadata = _metadata.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

