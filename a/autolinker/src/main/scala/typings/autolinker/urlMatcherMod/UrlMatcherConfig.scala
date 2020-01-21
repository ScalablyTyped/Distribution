package typings.autolinker.urlMatcherMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.autolinkerMod.StripPrefixConfigObj
import typings.autolinker.matcherMatcherMod.MatcherConfig
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatcherConfig extends MatcherConfig {
  var decodePercentEncoding: Boolean
  var stripPrefix: Required[StripPrefixConfigObj]
  var stripTrailingSlash: Boolean
}

object UrlMatcherConfig {
  @scala.inline
  def apply(
    decodePercentEncoding: Boolean,
    stripPrefix: Required[StripPrefixConfigObj],
    stripTrailingSlash: Boolean,
    tagBuilder: AnchorTagBuilder
  ): UrlMatcherConfig = {
    val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlMatcherConfig]
  }
}

