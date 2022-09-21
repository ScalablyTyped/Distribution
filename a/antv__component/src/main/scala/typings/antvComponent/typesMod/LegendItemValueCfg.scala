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
    * 图例值和后面的间隔，可以控制和 RadioIcon 的间距
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * 图例项附加值的配置
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.undefined
}
object LegendItemValueCfg {
  
  inline def apply(): LegendItemValueCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemValueCfg]
  }
  
  extension [Self <: LegendItemValueCfg](x: Self) {
    
    inline def setAlignRight(value: Boolean): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
    
    inline def setAlignRightUndefined: Self = StObject.set(x, "alignRight", js.undefined)
    
    inline def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction3(value: (/* item */ Any, /* index */ Double, /* items */ js.Array[Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
