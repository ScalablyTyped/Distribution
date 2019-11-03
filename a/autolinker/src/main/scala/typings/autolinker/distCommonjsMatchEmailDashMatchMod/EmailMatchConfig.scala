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
    val __obj = js.Dynamic.literal(email = email, matchedText = matchedText, offset = offset, tagBuilder = tagBuilder)
  
    __obj.asInstanceOf[EmailMatchConfig]
  }
}

