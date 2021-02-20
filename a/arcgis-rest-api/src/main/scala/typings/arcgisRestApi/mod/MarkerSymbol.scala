package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerSymbol extends Symbol {
  
  var angle: js.UndefOr[Double] = js.native
  
  var xoffset: js.UndefOr[Double] = js.native
  
  var yoffset: js.UndefOr[Double] = js.native
}
object MarkerSymbol {
  
  @scala.inline
  def apply(`type`: SymbolType): MarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSymbol]
  }
  
  @scala.inline
  implicit class MarkerSymbolMutableBuilder[Self <: MarkerSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXoffsetUndefined: Self = StObject.set(x, "xoffset", js.undefined)
    
    @scala.inline
    def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoffsetUndefined: Self = StObject.set(x, "yoffset", js.undefined)
  }
}
