package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueLegendRailCfg extends js.Object {
  
  /**
    * 滑轨的默认长度，，当限制了 maxWidth,maxHeight 时，不会使用这个属性会自动计算长度
    * @type {number}
    */
  var defaultLength: js.UndefOr[Double] = js.native
  
  /**
    * 滑轨的宽度
    * @type {number}
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * 滑轨的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
  
  /**
    * rail 的类型，color, size
    * @type {string}
    */
  var `type`: js.UndefOr[String] = js.native
}
object ContinueLegendRailCfg {
  
  @scala.inline
  def apply(): ContinueLegendRailCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendRailCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendRailCfgOps[Self <: ContinueLegendRailCfg] (val x: Self) extends AnyVal {
    
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
    def setDefaultLength(value: Double): Self = this.set("defaultLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLength: Self = this.set("defaultLength", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
