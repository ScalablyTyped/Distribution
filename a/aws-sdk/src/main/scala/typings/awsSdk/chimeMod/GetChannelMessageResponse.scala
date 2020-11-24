package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChannelMessageResponse extends js.Object {
  
  /**
    * The details of and content in the message.
    */
  var ChannelMessage: js.UndefOr[typings.awsSdk.chimeMod.ChannelMessage] = js.native
}
object GetChannelMessageResponse {
  
  @scala.inline
  def apply(): GetChannelMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelMessageResponse]
  }
  
  @scala.inline
  implicit class GetChannelMessageResponseOps[Self <: GetChannelMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelMessage(value: ChannelMessage): Self = this.set("ChannelMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMessage: Self = this.set("ChannelMessage", js.undefined)
  }
}
