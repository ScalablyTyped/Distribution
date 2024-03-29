package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.LegendMarkerCfg
import typings.antvGBase.libTypesMod.PathCommand
import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerCfg
  extends StObject
     with LegendMarkerCfg {
  
  @JSName("style")
  var style_MarkerCfg: js.UndefOr[ShapeAttrs | (js.Function1[/* style */ ShapeAttrs, ShapeAttrs])] = js.undefined
  
  /**
    * @title 配置图例 marker 的 symbol 形状。
    */
  @JSName("symbol")
  var symbol_MarkerCfg: js.UndefOr[Marker | MarkerCallback] = js.undefined
}
object MarkerCfg {
  
  inline def apply(): MarkerCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerCfg] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: ShapeAttrs | (js.Function1[/* style */ ShapeAttrs, ShapeAttrs])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction1(value: /* style */ ShapeAttrs => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSymbol(value: Marker | MarkerCallback): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolFunction3(value: (/* x */ Double, /* y */ Double, /* r */ Double) => js.Array[PathCommand]): Self = StObject.set(x, "symbol", js.Any.fromFunction3(value))
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
