package typings.antvComponent.scrollbarScrollbarMod

import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollbarCfg extends GroupComponentCfg {
  
  var isHorizontal: js.UndefOr[Boolean] = js.native
  
  var maxLimit: js.UndefOr[Double] = js.native
  
  var minLimit: js.UndefOr[Double] = js.native
  
  var minThumbLen: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[ScrollbarTheme] = js.native
  
  var thumbLen: Double = js.native
  
  var thumbOffset: js.UndefOr[Double] = js.native
  
  var trackLen: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ScrollbarCfg {
  
  @scala.inline
  def apply(container: IGroup, thumbLen: Double, trackLen: Double, x: Double, y: Double): ScrollbarCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], thumbLen = thumbLen.asInstanceOf[js.Any], trackLen = trackLen.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarCfg]
  }
  
  @scala.inline
  implicit class ScrollbarCfgOps[Self <: ScrollbarCfg] (val x: Self) extends AnyVal {
    
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
    def setThumbLen(value: Double): Self = this.set("thumbLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackLen(value: Double): Self = this.set("trackLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontal(value: Boolean): Self = this.set("isHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHorizontal: Self = this.set("isHorizontal", js.undefined)
    
    @scala.inline
    def setMaxLimit(value: Double): Self = this.set("maxLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLimit: Self = this.set("maxLimit", js.undefined)
    
    @scala.inline
    def setMinLimit(value: Double): Self = this.set("minLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLimit: Self = this.set("minLimit", js.undefined)
    
    @scala.inline
    def setMinThumbLen(value: Double): Self = this.set("minThumbLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinThumbLen: Self = this.set("minThumbLen", js.undefined)
    
    @scala.inline
    def setTheme(value: ScrollbarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setThumbOffset(value: Double): Self = this.set("thumbOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbOffset: Self = this.set("thumbOffset", js.undefined)
  }
}
