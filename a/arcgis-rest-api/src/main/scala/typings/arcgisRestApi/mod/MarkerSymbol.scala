package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerSymbol
  extends StObject
     with Symbol {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var xoffset: js.UndefOr[Double] = js.undefined
  
  var yoffset: js.UndefOr[Double] = js.undefined
}
object MarkerSymbol {
  
  inline def apply(`type`: SymbolType): MarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSymbol]
  }
  
  extension [Self <: MarkerSymbol](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    inline def setXoffsetUndefined: Self = StObject.set(x, "xoffset", js.undefined)
    
    inline def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    
    inline def setYoffsetUndefined: Self = StObject.set(x, "yoffset", js.undefined)
  }
}
