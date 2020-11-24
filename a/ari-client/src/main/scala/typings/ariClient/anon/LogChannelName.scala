package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogChannelName extends js.Object {
  
  var logChannelName: String = js.native
}
object LogChannelName {
  
  @scala.inline
  def apply(logChannelName: String): LogChannelName = {
    val __obj = js.Dynamic.literal(logChannelName = logChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogChannelName]
  }
  
  @scala.inline
  implicit class LogChannelNameOps[Self <: LogChannelName] (val x: Self) extends AnyVal {
    
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
    def setLogChannelName(value: String): Self = this.set("logChannelName", value.asInstanceOf[js.Any])
  }
}
