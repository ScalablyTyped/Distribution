package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualPalette extends StObject {
  
  /**
    * The chart color options for the visual palette.
    */
  var ChartColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color map options for the visual palette.
    */
  var ColorMap: js.UndefOr[DataPathColorList] = js.undefined
}
object VisualPalette {
  
  inline def apply(): VisualPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualPalette]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualPalette] (val x: Self) extends AnyVal {
    
    inline def setChartColor(value: HexColor): Self = StObject.set(x, "ChartColor", value.asInstanceOf[js.Any])
    
    inline def setChartColorUndefined: Self = StObject.set(x, "ChartColor", js.undefined)
    
    inline def setColorMap(value: DataPathColorList): Self = StObject.set(x, "ColorMap", value.asInstanceOf[js.Any])
    
    inline def setColorMapUndefined: Self = StObject.set(x, "ColorMap", js.undefined)
    
    inline def setColorMapVarargs(value: DataPathColor*): Self = StObject.set(x, "ColorMap", js.Array(value*))
  }
}
