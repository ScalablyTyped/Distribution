package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsMessageTypes extends js.Object {
  
  var all: StatsMessageCount = js.native
  
  var messages: StatsMessageCount = js.native
  
  var presence: StatsMessageCount = js.native
}
object StatsMessageTypes {
  
  @scala.inline
  def apply(all: StatsMessageCount, messages: StatsMessageCount, presence: StatsMessageCount): StatsMessageTypes = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsMessageTypes]
  }
  
  @scala.inline
  implicit class StatsMessageTypesOps[Self <: StatsMessageTypes] (val x: Self) extends AnyVal {
    
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
    def setAll(value: StatsMessageCount): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: StatsMessageCount): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresence(value: StatsMessageCount): Self = this.set("presence", value.asInstanceOf[js.Any])
  }
}
