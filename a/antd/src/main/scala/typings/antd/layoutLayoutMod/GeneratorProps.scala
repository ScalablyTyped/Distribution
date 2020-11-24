package typings.antd.layoutLayoutMod

import typings.antd.antdStrings.footer
import typings.antd.antdStrings.header
import typings.antd.antdStrings.main
import typings.antd.antdStrings.section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratorProps extends js.Object {
  
  var displayName: String = js.native
  
  var suffixCls: String = js.native
  
  var tagName: header | footer | main | section = js.native
}
object GeneratorProps {
  
  @scala.inline
  def apply(displayName: String, suffixCls: String, tagName: header | footer | main | section): GeneratorProps = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], suffixCls = suffixCls.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorProps]
  }
  
  @scala.inline
  implicit class GeneratorPropsOps[Self <: GeneratorProps] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixCls(value: String): Self = this.set("suffixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: header | footer | main | section): Self = this.set("tagName", value.asInstanceOf[js.Any])
  }
}
