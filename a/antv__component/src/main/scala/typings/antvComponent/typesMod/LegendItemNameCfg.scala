package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendItemNameCfg extends js.Object {
  
  /**
    * 格式化文本函数
    * @type {formatterCallback}
    */
  var formatter: js.UndefOr[formatterCallback] = js.native
  
  /**
    * 图例项 name 同后面 value 的间距
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.native
  
  /**
    * 文本配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object LegendItemNameCfg {
  
  @scala.inline
  def apply(): LegendItemNameCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemNameCfg]
  }
  
  @scala.inline
  implicit class LegendItemNameCfgOps[Self <: LegendItemNameCfg] (val x: Self) extends AnyVal {
    
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
    def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => js.Any): Self = this.set("formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
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
