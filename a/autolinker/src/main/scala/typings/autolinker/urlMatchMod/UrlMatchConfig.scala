package typings.autolinker.urlMatchMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.anon.RequiredStripPrefixConfig
import typings.autolinker.autolinkerMod.UrlMatchTypeOptions
import typings.autolinker.matchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMatchConfig extends MatchConfig {
  
  var decodePercentEncoding: Boolean = js.native
  
  var protocolRelativeMatch: Boolean = js.native
  
  var protocolUrlMatch: Boolean = js.native
  
  var stripPrefix: RequiredStripPrefixConfig = js.native
  
  var stripTrailingSlash: Boolean = js.native
  
  var url: String = js.native
  
  var urlMatchType: UrlMatchTypeOptions = js.native
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
  
  @scala.inline
  implicit class UrlMatchConfigOps[Self <: UrlMatchConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecodePercentEncoding(value: Boolean): Self = this.set("decodePercentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolRelativeMatch(value: Boolean): Self = this.set("protocolRelativeMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUrlMatch(value: Boolean): Self = this.set("protocolUrlMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripPrefix(value: RequiredStripPrefixConfig): Self = this.set("stripPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripTrailingSlash(value: Boolean): Self = this.set("stripTrailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMatchType(value: UrlMatchTypeOptions): Self = this.set("urlMatchType", value.asInstanceOf[js.Any])
  }
}
