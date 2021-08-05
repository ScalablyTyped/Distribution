package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendItemNameCfg extends StObject {
  
  /**
    * 格式化文本函数
    * @type {formatterCallback}
    */
  var formatter: js.UndefOr[formatterCallback] = js.undefined
  
  /**
    * 图例项 name 同后面 value 的间距
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * 文本配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object LegendItemNameCfg {
  
  inline def apply(): LegendItemNameCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemNameCfg]
  }
  
  extension [Self <: LegendItemNameCfg](x: Self) {
    
    inline def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => js.Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
