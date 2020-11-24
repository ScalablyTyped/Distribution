package typings.antd.textAreaMod

import typings.antd.configProviderSizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaProps
  extends typings.rcTextarea.mod.TextAreaProps {
  
  var allowClear: js.UndefOr[Boolean] = js.native
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var showCount: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
}
object TextAreaProps {
  
  @scala.inline
  def apply(): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaProps]
  }
  
  @scala.inline
  implicit class TextAreaPropsOps[Self <: TextAreaProps] (val x: Self) extends AnyVal {
    
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
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    
    @scala.inline
    def setShowCount(value: Boolean): Self = this.set("showCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCount: Self = this.set("showCount", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
