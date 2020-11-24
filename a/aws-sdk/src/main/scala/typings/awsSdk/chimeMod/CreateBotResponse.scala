package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBotResponse extends js.Object {
  
  /**
    * The bot details.
    */
  var Bot: js.UndefOr[typings.awsSdk.chimeMod.Bot] = js.native
}
object CreateBotResponse {
  
  @scala.inline
  def apply(): CreateBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBotResponse]
  }
  
  @scala.inline
  implicit class CreateBotResponseOps[Self <: CreateBotResponse] (val x: Self) extends AnyVal {
    
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
    def setBot(value: Bot): Self = this.set("Bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBot: Self = this.set("Bot", js.undefined)
  }
}
