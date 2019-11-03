package typings.autolinker.distCommonjsMatchMatchMod

import typings.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
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
    val __obj = js.Dynamic.literal(matchedText = matchedText, offset = offset, tagBuilder = tagBuilder)
  
    __obj.asInstanceOf[MatchConfig]
  }
}

