package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSchemeForMeshColorsForClassBreaks extends StObject {
  
  /**
  		 * An array of hex color strings.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForMesh)
  		 */
  var colors: js.Array[Color_]
  
  /**
  		 * The number of classes used in the classed color visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForMesh)
  		 */
  var numClasses: Double
}
object ColorSchemeForMeshColorsForClassBreaks {
  
  inline def apply(colors: js.Array[Color_], numClasses: Double): ColorSchemeForMeshColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemeForMeshColorsForClassBreaks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSchemeForMeshColorsForClassBreaks] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
  }
}
