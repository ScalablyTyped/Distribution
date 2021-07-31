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
  
  @scala.inline
  def apply(): LegendItemNameCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemNameCfg]
  }
  
  @scala.inline
  implicit class LegendItemNameCfgMutableBuilder[Self <: LegendItemNameCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatter(value: (/* text */ String, /* item */ ListItem, /* index */ Double) => js.Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
