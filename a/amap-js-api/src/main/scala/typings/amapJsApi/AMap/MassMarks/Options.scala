package typings.amapJsApi.AMap.MassMarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends typings.amapJsApi.AMap.Layer.Options {
  
  /**
    * 是否在拖拽缩放过程中实时重绘
    */
  var alwayRender: js.UndefOr[Boolean] = js.native
  
  /**
    * 指针样式
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * 设置点的样式
    */
  var style: Style | js.Array[Style] = js.native
  
  /**
    * 显示层级
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(style: Style | js.Array[Style]): Options = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: Style | js.Array[Style]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwayRender(value: Boolean): Self = this.set("alwayRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwayRender: Self = this.set("alwayRender", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
