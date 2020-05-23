package typings.autolinker.urlMatchMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.anon.RequiredStripPrefixConfig
import typings.autolinker.autolinkerMod.UrlMatchTypeOptions
import typings.autolinker.matchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatchConfig extends MatchConfig {
  var decodePercentEncoding: Boolean
  var protocolRelativeMatch: Boolean
  var protocolUrlMatch: Boolean
  var stripPrefix: RequiredStripPrefixConfig
  var stripTrailingSlash: Boolean
  var url: String
  var urlMatchType: UrlMatchTypeOptions
}

object UrlMatchConfig {
  @scala.inline
  def apply(
    decodePercentEncoding: Boolean,
    matchedText: String,
    offset: Double,
    protocolRelativeMatch: Boolean,
    protocolUrlMatch: Boolean,
    stripPrefix: RequiredStripPrefixConfig,
    stripTrailingSlash: Boolean,
    tagBuilder: AnchorTagBuilder,
    url: String,
    urlMatchType: UrlMatchTypeOptions
  ): UrlMatchConfig = {
    val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], protocolRelativeMatch = protocolRelativeMatch.asInstanceOf[js.Any], protocolUrlMatch = protocolUrlMatch.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlMatchType = urlMatchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatchConfig]
  }
}

