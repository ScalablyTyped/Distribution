package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapLabel extends js.Object {
  
  var prefixCls: String = js.native
  
  var wrapLabel: Boolean = js.native
}
object WrapLabel {
  
  @scala.inline
  def apply(prefixCls: String, wrapLabel: Boolean): WrapLabel = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], wrapLabel = wrapLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapLabel]
  }
  
  @scala.inline
  implicit class WrapLabelOps[Self <: WrapLabel] (val x: Self) extends AnyVal {
    
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
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapLabel(value: Boolean): Self = this.set("wrapLabel", value.asInstanceOf[js.Any])
  }
}
