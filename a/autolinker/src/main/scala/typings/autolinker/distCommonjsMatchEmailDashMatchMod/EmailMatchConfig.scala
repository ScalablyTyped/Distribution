package typings.autolinker.distCommonjsMatchEmailDashMatchMod

import typings.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typings.autolinker.distCommonjsMatchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailMatchConfig extends MatchConfig {
  var email: String
}

object EmailMatchConfig {
  @scala.inline
  def apply(email: String, matchedText: String, offset: Double, tagBuilder: AnchorTagBuilder): EmailMatchConfig = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmailMatchConfig]
  }
}

