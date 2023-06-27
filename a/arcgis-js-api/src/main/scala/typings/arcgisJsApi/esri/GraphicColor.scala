package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicColor extends StObject {
  
  /**
  		 * The color of the trace result graphic in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#GraphicColor)
  		 */
  var color: js.Array[Double]
  
  /**
  		 * The opacity of the graphic symbol's halo.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#GraphicColor)
  		 */
  var haloOpacity: Double
  
  /**
  		 * The color of the trace result graphic in the color picker.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#GraphicColor)
  		 */
  var hex: String
}
object GraphicColor {
  
  inline def apply(color: js.Array[Double], haloOpacity: Double, hex: String): GraphicColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], haloOpacity = haloOpacity.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphicColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setHaloOpacity(value: Double): Self = StObject.set(x, "haloOpacity", value.asInstanceOf[js.Any])
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
  }
}
