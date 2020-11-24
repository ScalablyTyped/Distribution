package typings.autolinker.matchMatchMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchConfig extends js.Object {
  
  var matchedText: String = js.native
  
  var offset: Double = js.native
  
  var tagBuilder: AnchorTagBuilder = js.native
}
object MatchConfig {
  
  @scala.inline
  def apply(matchedText: String, offset: Double, tagBuilder: AnchorTagBuilder): MatchConfig = {
    val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchConfig]
  }
  
  @scala.inline
  implicit class MatchConfigOps[Self <: MatchConfig] (val x: Self) extends AnyVal {
    
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
    def setMatchedText(value: String): Self = this.set("matchedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagBuilder(value: AnchorTagBuilder): Self = this.set("tagBuilder", value.asInstanceOf[js.Any])
  }
}
