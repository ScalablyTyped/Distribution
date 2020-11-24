package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueLegendLabelCfg extends js.Object {
  
  /**
    * 文本同滑轨的对齐方式，有五种类型
    *  - rail ： 同滑轨对齐，在滑轨的两端
    *  - top, bottom: 图例水平布局时有效
    *  - left, right: 图例垂直布局时有效
    * @type {string}
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * 文本同滑轨的距离
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.native
  
  /**
    * 文本样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object ContinueLegendLabelCfg {
  
  @scala.inline
  def apply(): ContinueLegendLabelCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendLabelCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendLabelCfgOps[Self <: ContinueLegendLabelCfg] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
