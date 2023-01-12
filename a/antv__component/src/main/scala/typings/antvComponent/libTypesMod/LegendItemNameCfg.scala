package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
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
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.undefined
}
object LegendItemNameCfg {
  
  inline def apply(): LegendItemNameCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemNameCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendItemNameCfg] (val x: Self) extends AnyVal {
    
    inline def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction3(value: (/* item */ Any, /* index */ Double, /* items */ js.Array[Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
