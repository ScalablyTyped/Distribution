package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLabelCfg extends js.Object {
  
  /**
    * 是否自动省略，默认 false
    * @type {boolean|avoidCallback|string}
    */
  var autoEllipsis: js.UndefOr[Boolean | avoidCallback | String] = js.native
  
  /**
    * 是否自动隐藏，默认 false
    * @type {boolean|avoidCallback|string}
    */
  var autoHide: js.UndefOr[Boolean | avoidCallback | String] = js.native
  
  /**
    * 是否自动旋转，默认 true
    * @type {boolean|avoidCallback|string}
    */
  var autoRotate: js.UndefOr[Boolean | avoidCallback | String] = js.native
  
  /**
    * 格式化函数
    * @type {formatterCallback}
    */
  var formatter: js.UndefOr[formatterCallback] = js.native
  
  /**
    * label 的偏移量
    * @type {number}
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * 文本旋转角度
    * @type {number}
    */
  var rotate: js.UndefOr[Double] = js.native
  
  /**
    * 坐标轴文本的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.native
}
object AxisLabelCfg {
  
  @scala.inline
  def apply(): AxisLabelCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabelCfg]
  }
  
  @scala.inline
  implicit class AxisLabelCfgOps[Self <: AxisLabelCfg] (val x: Self) extends AnyVal {
    
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
    def setAutoEllipsisFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = this.set("autoEllipsis", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAutoEllipsis(value: Boolean | avoidCallback | String): Self = this.set("autoEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEllipsis: Self = this.set("autoEllipsis", js.undefined)
    
    @scala.inline
    def setAutoHideFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = this.set("autoHide", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAutoHide(value: Boolean | avoidCallback | String): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setAutoRotateFunction3(
      value: (/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ js.UndefOr[Double]) => Boolean
    ): Self = this.set("autoRotate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAutoRotate(value: Boolean | avoidCallback | String): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRotate: Self = this.set("autoRotate", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => js.Any): Self = this.set("formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setStyleFunction3(value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => ShapeAttrs): Self = this.set("style", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
