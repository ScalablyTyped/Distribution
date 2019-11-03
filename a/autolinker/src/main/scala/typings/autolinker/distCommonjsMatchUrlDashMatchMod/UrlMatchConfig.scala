package typings.autolinker.distCommonjsMatchUrlDashMatchMod

import typings.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typings.autolinker.distCommonjsAutolinkerMod.StripPrefixConfigObj
import typings.autolinker.distCommonjsAutolinkerMod.UrlMatchTypeOptions
import typings.autolinker.distCommonjsMatchMatchMod.MatchConfig
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatchConfig extends MatchConfig {
  var decodePercentEncoding: Boolean
  var protocolRelativeMatch: Boolean
  var protocolUrlMatch: Boolean
  var stripPrefix: Required[StripPrefixConfigObj]
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
    stripPrefix: Required[StripPrefixConfigObj],
    stripTrailingSlash: Boolean,
    tagBuilder: AnchorTagBuilder,
    url: String,
    urlMatchType: UrlMatchTypeOptions
  ): UrlMatchConfig = {
    val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding, matchedText = matchedText, offset = offset, protocolRelativeMatch = protocolRelativeMatch, protocolUrlMatch = protocolUrlMatch, stripPrefix = stripPrefix, stripTrailingSlash = stripTrailingSlash, tagBuilder = tagBuilder, url = url, urlMatchType = urlMatchType)
  
    __obj.asInstanceOf[UrlMatchConfig]
  }
}

