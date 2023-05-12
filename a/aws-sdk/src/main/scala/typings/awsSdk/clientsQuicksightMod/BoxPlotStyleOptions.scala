package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxPlotStyleOptions extends StObject {
  
  /**
    * The fill styles (solid, transparent) of the box plot.
    */
  var FillStyle: js.UndefOr[BoxPlotFillStyle] = js.undefined
}
object BoxPlotStyleOptions {
  
  inline def apply(): BoxPlotStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxPlotStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxPlotStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setFillStyle(value: BoxPlotFillStyle): Self = StObject.set(x, "FillStyle", value.asInstanceOf[js.Any])
    
    inline def setFillStyleUndefined: Self = StObject.set(x, "FillStyle", js.undefined)
  }
}
