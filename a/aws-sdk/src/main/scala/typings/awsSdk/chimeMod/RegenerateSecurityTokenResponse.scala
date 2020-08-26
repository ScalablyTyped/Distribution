package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegenerateSecurityTokenResponse extends js.Object {
  var Bot: js.UndefOr[typings.awsSdk.chimeMod.Bot] = js.native
}

object RegenerateSecurityTokenResponse {
  @scala.inline
  def apply(): RegenerateSecurityTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegenerateSecurityTokenResponse]
  }
  @scala.inline
  implicit class RegenerateSecurityTokenResponseOps[Self <: RegenerateSecurityTokenResponse] (val x: Self) extends AnyVal {
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

