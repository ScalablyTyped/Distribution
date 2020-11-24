package typings.antd.mentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MentionsConfig extends js.Object {
  
  var prefix: js.UndefOr[String | js.Array[String]] = js.native
  
  var split: js.UndefOr[String] = js.native
}
object MentionsConfig {
  
  @scala.inline
  def apply(): MentionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MentionsConfig]
  }
  
  @scala.inline
  implicit class MentionsConfigOps[Self <: MentionsConfig] (val x: Self) extends AnyVal {
    
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
    def setPrefixVarargs(value: String*): Self = this.set("prefix", js.Array(value :_*))
    
    @scala.inline
    def setPrefix(value: String | js.Array[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSplit(value: String): Self = this.set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
}
