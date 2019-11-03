package typings.autolinker.distCommonjsMatcherHashtagDashMatcherMod

import typings.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typings.autolinker.distCommonjsAutolinkerMod.HashtagServices
import typings.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagMatcherConfig extends MatcherConfig {
  var serviceName: HashtagServices
}

object HashtagMatcherConfig {
  @scala.inline
  def apply(serviceName: HashtagServices, tagBuilder: AnchorTagBuilder): HashtagMatcherConfig = {
    val __obj = js.Dynamic.literal(serviceName = serviceName, tagBuilder = tagBuilder)
  
    __obj.asInstanceOf[HashtagMatcherConfig]
  }
}

