package typings.antvG2.anon

import typings.antvG2.libInterfaceMod.Marker
import typings.antvG2.libInterfaceMod.MarkerCallback
import typings.antvGBase.typesMod.PathCommand
import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  name :string,   value :string} & @antv/g2.@antv/g2/lib/interface.MarkerCfg */
trait namestringvaluestringMark extends StObject {
  
  var name: String
  
  /**
    * 图例项 marker 同后面 name 的间距
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[ShapeAttrs | (js.Function1[/* style */ ShapeAttrs, ShapeAttrs])] = js.undefined
  
  /**
    * @title 配置图例 marker 的 symbol 形状。
    */
  var symbol: js.UndefOr[Marker | MarkerCallback] = js.undefined
  
  var value: String
}
object namestringvaluestringMark {
  
  inline def apply(name: String, value: String): namestringvaluestringMark = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[namestringvaluestringMark]
  }
  
  extension [Self <: namestringvaluestringMark](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStyle(value: ShapeAttrs | (js.Function1[/* style */ ShapeAttrs, ShapeAttrs])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction1(value: /* style */ ShapeAttrs => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSymbol(value: Marker | MarkerCallback): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolFunction3(value: (/* x */ Double, /* y */ Double, /* r */ Double) => js.Array[PathCommand]): Self = StObject.set(x, "symbol", js.Any.fromFunction3(value))
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
