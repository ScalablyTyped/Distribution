package typings.antvComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineAnnotationTextCfg extends EnhancedTextCfg {
  
  /**
    * 自动旋转，沿着线的方向，默认 true
    * @type {boolean}
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  
  /**
    * 文本的偏移 x
    * @type {number}
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * 文本的偏移 y
    * @type {number}
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * 位置，可以选择： start, end, center 和 '50%' 这类的百分比写法，默认 'center'
    * @type {string}
    */
  var position: js.UndefOr[String] = js.native
}
object LineAnnotationTextCfg {
  
  @scala.inline
  def apply(content: String | Double): LineAnnotationTextCfg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAnnotationTextCfg]
  }
  
  @scala.inline
  implicit class LineAnnotationTextCfgOps[Self <: LineAnnotationTextCfg] (val x: Self) extends AnyVal {
    
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
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRotate: Self = this.set("autoRotate", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
