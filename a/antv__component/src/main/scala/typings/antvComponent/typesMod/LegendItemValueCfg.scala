package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendItemValueCfg extends js.Object {
  
  /**
    * 是否右对齐，默认为 false，仅当设置图例项宽度时生效
    * @type {boolean}
    */
  var alignRight: js.UndefOr[Boolean] = js.native
  
  /**
    * 格式化文本函数
    * @type {formatterCallback}
    */
  var formatter: js.UndefOr[formatterCallback] = js.native
  
  /**
    * 图例项附加值的配置
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object LegendItemValueCfg {
  
  @scala.inline
  def apply(): LegendItemValueCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemValueCfg]
  }
  
  @scala.inline
  implicit class LegendItemValueCfgOps[Self <: LegendItemValueCfg] (val x: Self) extends AnyVal {
    
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
    def setAlignRight(value: Boolean): Self = this.set("alignRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignRight: Self = this.set("alignRight", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => js.Any): Self = this.set("formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
