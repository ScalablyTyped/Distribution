package typings.autolinker.emailMatchMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.matchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailMatchConfig extends MatchConfig {
  var email: String = js.native
}

object EmailMatchConfig {
  @scala.inline
  def apply(email: String, matchedText: String, offset: Double, tagBuilder: AnchorTagBuilder): EmailMatchConfig = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMatchConfig]
  }
  @scala.inline
  implicit class EmailMatchConfigOps[Self <: EmailMatchConfig] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
  }
  
}

