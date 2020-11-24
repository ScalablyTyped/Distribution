package typings.antdMobile.noticeBarMod

import typings.antdMobile.marqueeMod.MarqueeProps
import typings.antdMobile.noticeBarPropsTypeMod.NoticeBarPropsType
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoticeWebProps extends NoticeBarPropsType {
  
  var className: js.UndefOr[String] = js.native
  
  var marqueeProps: js.UndefOr[MarqueeProps] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object NoticeWebProps {
  
  @scala.inline
  def apply(): NoticeWebProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoticeWebProps]
  }
  
  @scala.inline
  implicit class NoticeWebPropsOps[Self <: NoticeWebProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setMarqueeProps(value: MarqueeProps): Self = this.set("marqueeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarqueeProps: Self = this.set("marqueeProps", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
