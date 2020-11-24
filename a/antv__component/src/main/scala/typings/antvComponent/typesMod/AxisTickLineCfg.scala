package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisTickLineCfg extends js.Object {
  
  /**
    * 是否同 tick 对齐
    * @type {boolean}
    */
  var alignTick: js.UndefOr[Boolean] = js.native
  
  /**
    * 长度
    * @type {number}
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * 坐标轴刻度线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.native
}
object AxisTickLineCfg {
  
  @scala.inline
  def apply(): AxisTickLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisTickLineCfg]
  }
  
  @scala.inline
  implicit class AxisTickLineCfgOps[Self <: AxisTickLineCfg] (val x: Self) extends AnyVal {
    
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
    def setAlignTick(value: Boolean): Self = this.set("alignTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignTick: Self = this.set("alignTick", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setStyleFunction3(value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => ShapeAttrs): Self = this.set("style", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
