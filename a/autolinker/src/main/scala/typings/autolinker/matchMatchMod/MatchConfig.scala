package typings.autolinker.matchMatchMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchConfig extends js.Object {
  var matchedText: String
  var offset: Double
  var tagBuilder: AnchorTagBuilder
}

object MatchConfig {
  @scala.inline
  def apply(matchedText: String, offset: Double, tagBuilder: AnchorTagBuilder): MatchConfig = {
    val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchConfig]
  }
}

