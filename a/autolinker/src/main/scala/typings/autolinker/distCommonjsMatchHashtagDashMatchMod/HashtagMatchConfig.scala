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
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HashtagMatchConfig]
  }
}

