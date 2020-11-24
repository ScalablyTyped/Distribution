package typings.antdMobile.rangeMod

import typings.antdMobile.rangePropsTypeMod.RangePropsType
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeProps extends RangePropsType {
  
  var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var railStyle: js.UndefOr[CSSProperties] = js.native
  
  var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
}
object RangeProps {
  
  @scala.inline
  def apply(): RangeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeProps]
  }
  
  @scala.inline
  implicit class RangePropsOps[Self <: RangeProps] (val x: Self) extends AnyVal {
    
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
    def setHandleStyleVarargs(value: CSSProperties*): Self = this.set("handleStyle", js.Array(value :_*))
    
    @scala.inline
    def setHandleStyle(value: js.Array[CSSProperties]): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRailStyle(value: CSSProperties): Self = this.set("railStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRailStyle: Self = this.set("railStyle", js.undefined)
    
    @scala.inline
    def setTrackStyleVarargs(value: CSSProperties*): Self = this.set("trackStyle", js.Array(value :_*))
    
    @scala.inline
    def setTrackStyle(value: js.Array[CSSProperties]): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
  }
}
