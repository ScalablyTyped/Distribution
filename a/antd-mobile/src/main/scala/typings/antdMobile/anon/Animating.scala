package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animating extends js.Object {
  
  var animating: Boolean = js.native
  
  var panelColor: String = js.native
  
  var prefixCls: String = js.native
  
  var size: String = js.native
  
  var toast: Boolean = js.native
}
object Animating {
  
  @scala.inline
  def apply(animating: Boolean, panelColor: String, prefixCls: String, size: String, toast: Boolean): Animating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], panelColor = panelColor.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animating]
  }
  
  @scala.inline
  implicit class AnimatingOps[Self <: Animating] (val x: Self) extends AnyVal {
    
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
    def setAnimating(value: Boolean): Self = this.set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelColor(value: String): Self = this.set("panelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToast(value: Boolean): Self = this.set("toast", value.asInstanceOf[js.Any])
  }
}
