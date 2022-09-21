package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendRadio extends StObject {
  
  /**
    * radio 样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
  
  /**
    * radio 的提示信息
    */
  var tip: js.UndefOr[String] = js.undefined
}
object LegendRadio {
  
  inline def apply(): LegendRadio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendRadio]
  }
  
  extension [Self <: LegendRadio](x: Self) {
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
  }
}
