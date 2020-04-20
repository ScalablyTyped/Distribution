package typings.autolinker.hashtagMatcherMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.autolinkerMod.HashtagServices
import typings.autolinker.matcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagMatcherConfig extends MatcherConfig {
  var serviceName: HashtagServices
}

object HashtagMatcherConfig {
  @scala.inline
  def apply(serviceName: HashtagServices, tagBuilder: AnchorTagBuilder): HashtagMatcherConfig = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashtagMatcherConfig]
  }
}

