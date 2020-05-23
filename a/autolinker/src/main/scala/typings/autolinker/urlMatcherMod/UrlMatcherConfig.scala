package typings.autolinker.urlMatcherMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.anon.RequiredStripPrefixConfig
import typings.autolinker.matcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatcherConfig extends MatcherConfig {
  var decodePercentEncoding: Boolean
  var stripPrefix: RequiredStripPrefixConfig
  var stripTrailingSlash: Boolean
}

object UrlMatcherConfig {
  @scala.inline
  def apply(
    decodePercentEncoding: Boolean,
    stripPrefix: RequiredStripPrefixConfig,
    stripTrailingSlash: Boolean,
    tagBuilder: AnchorTagBuilder
  ): UrlMatcherConfig = {
    val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatcherConfig]
  }
}

