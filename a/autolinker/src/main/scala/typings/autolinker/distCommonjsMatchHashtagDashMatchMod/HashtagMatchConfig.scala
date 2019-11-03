package typings.autolinker.distCommonjsMatchHashtagDashMatchMod

import typings.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typings.autolinker.distCommonjsMatchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagMatchConfig extends MatchConfig {
  var hashtag: String
  var serviceName: String
}

object HashtagMatchConfig {
  @scala.inline
  def apply(
    hashtag: String,
    matchedText: String,
    offset: Double,
    serviceName: String,
    tagBuilder: AnchorTagBuilder
  ): HashtagMatchConfig = {
    val __obj = js.Dynamic.literal(hashtag = hashtag, matchedText = matchedText, offset = offset, serviceName = serviceName, tagBuilder = tagBuilder)
  
    __obj.asInstanceOf[HashtagMatchConfig]
  }
}

