package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStateChange extends js.Object {
  
  var current: ChannelState = js.native
  
  var previous: ChannelState = js.native
  
  var reason: js.UndefOr[ErrorInfo] = js.native
  
  var resumed: Boolean = js.native
}
object ChannelStateChange {
  
  @scala.inline
  def apply(current: ChannelState, previous: ChannelState, resumed: Boolean): ChannelStateChange = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], resumed = resumed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStateChange]
  }
  
  @scala.inline
  implicit class ChannelStateChangeOps[Self <: ChannelStateChange] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: ChannelState): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: ChannelState): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumed(value: Boolean): Self = this.set("resumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: ErrorInfo): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
