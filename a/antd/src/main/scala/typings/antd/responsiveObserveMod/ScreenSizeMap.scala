package typings.antd.responsiveObserveMod

import typings.antd.sizeContextMod._AvatarSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, number>> */
@js.native
trait ScreenSizeMap extends _AvatarSize {
  
  var lg: js.UndefOr[Double] = js.native
  
  var md: js.UndefOr[Double] = js.native
  
  var sm: js.UndefOr[Double] = js.native
  
  var xl: js.UndefOr[Double] = js.native
  
  var xs: js.UndefOr[Double] = js.native
  
  var xxl: js.UndefOr[Double] = js.native
}
object ScreenSizeMap {
  
  @scala.inline
  def apply(): ScreenSizeMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenSizeMap]
  }
  
  @scala.inline
  implicit class ScreenSizeMapOps[Self <: ScreenSizeMap] (val x: Self) extends AnyVal {
    
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
    def setLg(value: Double): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    
    @scala.inline
    def setMd(value: Double): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    
    @scala.inline
    def setSm(value: Double): Self = this.set("sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    
    @scala.inline
    def setXl(value: Double): Self = this.set("xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXl: Self = this.set("xl", js.undefined)
    
    @scala.inline
    def setXs(value: Double): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
    
    @scala.inline
    def setXxl(value: Double): Self = this.set("xxl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXxl: Self = this.set("xxl", js.undefined)
  }
}
