package typings.autolinker.matcherMatcherMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherConfig extends js.Object {
  var tagBuilder: AnchorTagBuilder
}

object MatcherConfig {
  @scala.inline
  def apply(tagBuilder: AnchorTagBuilder): MatcherConfig = {
    val __obj = js.Dynamic.literal(tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherConfig]
  }
}

