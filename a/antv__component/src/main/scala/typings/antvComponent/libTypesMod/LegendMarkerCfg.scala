package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendMarkerCfg extends StObject {
  
  /**
    * 图例项 marker 同后面 name 的间距
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * 图例项 marker 的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
  
  /**
    * 图例 marker 形状
    */
  var symbol: js.UndefOr[String | (js.Function3[/* x */ Double, /* y */ Double, /* r */ Double, Any])] = js.undefined
}
object LegendMarkerCfg {
  
  inline def apply(): LegendMarkerCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendMarkerCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendMarkerCfg] (val x: Self) extends AnyVal {
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSymbol(value: String | (js.Function3[/* x */ Double, /* y */ Double, /* r */ Double, Any])): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolFunction3(value: (/* x */ Double, /* y */ Double, /* r */ Double) => Any): Self = StObject.set(x, "symbol", js.Any.fromFunction3(value))
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
