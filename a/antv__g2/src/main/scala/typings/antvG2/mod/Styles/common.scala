package typings.antvG2.mod.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait common extends js.Object {
  
  /**
    * 设置用于填充绘画的颜色、渐变或模式；
    */
  var fill: js.UndefOr[String] = js.native
  
  /**
    * 设置新图像如何绘制到已有的图像上。
    */
  var globalCompositeOperation: js.UndefOr[String] = js.native
  
  /**
    * 设置绘图的当前 alpha 或透明值；
    */
  var opacity: js.UndefOr[String | Double] = js.native
  
  /**
    * 设置用于阴影的模糊级别；
    */
  var shadowBlur: js.UndefOr[String | Double] = js.native
  
  /**
    * 设置用于阴影的颜色；
    */
  var shadowColor: js.UndefOr[String] = js.native
  
  /**
    * 设置阴影距形状的水平距离；
    */
  var shadowOffsetX: js.UndefOr[String | Double] = js.native
  
  /**
    * 设置阴影距形状的垂直距离；
    */
  var shadowOffsetY: js.UndefOr[String | Double] = js.native
  
  /**
    * 设置用于笔触的颜色、渐变或模式；
    */
  var stroke: js.UndefOr[String | Double] = js.native
}
object common {
  
  @scala.inline
  def apply(): common = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[common]
  }
  
  @scala.inline
  implicit class commonOps[Self <: common] (val x: Self) extends AnyVal {
    
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setGlobalCompositeOperation(value: String): Self = this.set("globalCompositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalCompositeOperation: Self = this.set("globalCompositeOperation", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: String | Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: String | Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: String | Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setStroke(value: String | Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
