package typings.antDesignReactNative.popupMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends js.Object {
  
  var getContent: js.Any = js.native
  
  var hide: js.Any = js.native
  
  var onDismiss: js.Any = js.native
  
  var onOk: js.Any = js.native
}
object Args {
  
  @scala.inline
  def apply(getContent: js.Any, hide: js.Any, onDismiss: js.Any, onOk: js.Any): Args = {
    val __obj = js.Dynamic.literal(getContent = getContent.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], onDismiss = onDismiss.asInstanceOf[js.Any], onOk = onOk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    
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
    def setGetContent(value: js.Any): Self = this.set("getContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: js.Any): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDismiss(value: js.Any): Self = this.set("onDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOk(value: js.Any): Self = this.set("onOk", value.asInstanceOf[js.Any])
  }
}
