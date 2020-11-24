package typings.antd.timelineTimelineMod

import typings.antd.antdStrings.alternate
import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[left | alternate | right] = js.native
  
  /** 指定最后一个幽灵节点是否存在或内容 */
  var pending: js.UndefOr[ReactNode] = js.native
  
  var pendingDot: js.UndefOr[ReactNode] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object TimelineProps {
  
  @scala.inline
  def apply(): TimelineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineProps]
  }
  
  @scala.inline
  implicit class TimelinePropsOps[Self <: TimelineProps] (val x: Self) extends AnyVal {
    
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
    def setMode(value: left | alternate | right): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPending(value: ReactNode): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
    
    @scala.inline
    def setPendingDot(value: ReactNode): Self = this.set("pendingDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingDot: Self = this.set("pendingDot", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
