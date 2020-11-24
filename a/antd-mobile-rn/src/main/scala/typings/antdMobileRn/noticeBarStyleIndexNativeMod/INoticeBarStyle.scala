package typings.antdMobileRn.noticeBarStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INoticeBarStyle extends js.Object {
  
  var actionWrap: ViewStyle = js.native
  
  var close: TextStyle = js.native
  
  var container: ViewStyle = js.native
  
  var content: TextStyle = js.native
  
  var left15: ViewStyle = js.native
  
  var left6: ViewStyle = js.native
  
  var link: TextStyle = js.native
  
  var notice: ViewStyle = js.native
}
object INoticeBarStyle {
  
  @scala.inline
  def apply(
    actionWrap: ViewStyle,
    close: TextStyle,
    container: ViewStyle,
    content: TextStyle,
    left15: ViewStyle,
    left6: ViewStyle,
    link: TextStyle,
    notice: ViewStyle
  ): INoticeBarStyle = {
    val __obj = js.Dynamic.literal(actionWrap = actionWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], left15 = left15.asInstanceOf[js.Any], left6 = left6.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any])
    __obj.asInstanceOf[INoticeBarStyle]
  }
  
  @scala.inline
  implicit class INoticeBarStyleOps[Self <: INoticeBarStyle] (val x: Self) extends AnyVal {
    
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
    def setActionWrap(value: ViewStyle): Self = this.set("actionWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: TextStyle): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: TextStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft15(value: ViewStyle): Self = this.set("left15", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft6(value: ViewStyle): Self = this.set("left6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: TextStyle): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotice(value: ViewStyle): Self = this.set("notice", value.asInstanceOf[js.Any])
  }
}
