package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 画布 https://docs.alipay.com/mini/api/ui-canvas
@js.native
trait ToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  
      // 输出的图片宽度，默认为 width
  var destHeight: Double = js.native
  
          // 画布高度，默认为 canvas 高度 - y
  var destWidth: Double = js.native
  
          // 画布宽度，默认为 canvas 宽度 - x
  var height: Double = js.native
  
              // 画布 y 轴起点，默认为 0
  var width: Double = js.native
  
  var x: Double = js.native
  
              // 画布 x 轴起点，默认为 0
  var y: Double = js.native
}
object ToTempFilePathOptions {
  
  @scala.inline
  def apply(destHeight: Double, destWidth: Double, height: Double, width: Double, x: Double, y: Double): ToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(destHeight = destHeight.asInstanceOf[js.Any], destWidth = destWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToTempFilePathOptions]
  }
  
  @scala.inline
  implicit class ToTempFilePathOptionsOps[Self <: ToTempFilePathOptions] (val x: Self) extends AnyVal {
    
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
    def setDestHeight(value: Double): Self = this.set("destHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestWidth(value: Double): Self = this.set("destWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
