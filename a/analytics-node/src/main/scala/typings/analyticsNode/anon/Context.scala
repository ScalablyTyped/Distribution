package typings.analyticsNode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var _metadata: NodeVersion = js.native
  var context: Dictkey = js.native
  var messageId: js.UndefOr[String] = js.native
  var timestamp: js.UndefOr[Date] = js.native
  var `type`: String = js.native
}

object Context {
  @scala.inline
  def apply(_metadata: NodeVersion, context: Dictkey, `type`: String): Context = {
    val __obj = js.Dynamic.literal(_metadata = _metadata.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_metadata(value: NodeVersion): Self = this.set("_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Dictkey): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

