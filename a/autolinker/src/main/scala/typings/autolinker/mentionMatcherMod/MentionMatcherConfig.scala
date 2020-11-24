package typings.autolinker.mentionMatcherMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.autolinkerMod.MentionServices
import typings.autolinker.matcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MentionMatcherConfig extends MatcherConfig {
  
  var serviceName: MentionServices = js.native
}
object MentionMatcherConfig {
  
  @scala.inline
  def apply(serviceName: MentionServices, tagBuilder: AnchorTagBuilder): MentionMatcherConfig = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionMatcherConfig]
  }
  
  @scala.inline
  implicit class MentionMatcherConfigOps[Self <: MentionMatcherConfig] (val x: Self) extends AnyVal {
    
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
    def setServiceName(value: MentionServices): Self = this.set("serviceName", value.asInstanceOf[js.Any])
  }
}
