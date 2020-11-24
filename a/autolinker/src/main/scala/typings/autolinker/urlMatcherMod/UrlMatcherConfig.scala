package typings.autolinker.urlMatcherMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.anon.RequiredStripPrefixConfig
import typings.autolinker.matcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMatcherConfig extends MatcherConfig {
  
  var decodePercentEncoding: Boolean = js.native
  
  var stripPrefix: RequiredStripPrefixConfig = js.native
  
  var stripTrailingSlash: Boolean = js.native
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
  
  @scala.inline
  implicit class UrlMatcherConfigOps[Self <: UrlMatcherConfig] (val x: Self) extends AnyVal {
    
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
    def setStripPrefix(value: RequiredStripPrefixConfig): Self = this.set("stripPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripTrailingSlash(value: Boolean): Self = this.set("stripTrailingSlash", value.asInstanceOf[js.Any])
  }
}
