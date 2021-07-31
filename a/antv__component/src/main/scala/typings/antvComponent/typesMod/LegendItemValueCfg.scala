package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendItemValueCfg extends StObject {
  
  /**
    * 是否右对齐，默认为 false，仅当设置图例项宽度时生效
    * @type {boolean}
    */
  var alignRight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 格式化文本函数
    * @type {formatterCallback}
    */
  var formatter: js.UndefOr[formatterCallback] = js.undefined
  
  /**
    * 图例项附加值的配置
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object LegendItemValueCfg {
  
  @scala.inline
  def apply(): LegendItemValueCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemValueCfg]
  }
  
  @scala.inline
  implicit class LegendItemValueCfgMutableBuilder[Self <: LegendItemValueCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignRight(value: Boolean): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignRightUndefined: Self = StObject.set(x, "alignRight", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => js.Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
