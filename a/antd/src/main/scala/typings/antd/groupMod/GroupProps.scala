package typings.antd.groupMod

import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.top
import typings.antd.sizeContextMod.AvatarSize
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var maxCount: js.UndefOr[Double] = js.native
  
  var maxPopoverPlacement: js.UndefOr[top | bottom] = js.native
  
  var maxStyle: js.UndefOr[CSSProperties] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[AvatarSize] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object GroupProps {
  
  @scala.inline
  def apply(): GroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupProps]
  }
  
  @scala.inline
  implicit class GroupPropsOps[Self <: GroupProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setMaxCount(value: Double): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCount: Self = this.set("maxCount", js.undefined)
    
    @scala.inline
    def setMaxPopoverPlacement(value: top | bottom): Self = this.set("maxPopoverPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPopoverPlacement: Self = this.set("maxPopoverPlacement", js.undefined)
    
    @scala.inline
    def setMaxStyle(value: CSSProperties): Self = this.set("maxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStyle: Self = this.set("maxStyle", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setSize(value: AvatarSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
