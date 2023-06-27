package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsNoDataInterpretation extends StObject {
  
  /**
  		 * The NoData values you specify for each band must occur in the same pixel for the output image to contain the NoData pixel.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#noDataInterpretation)
  		 */
  var matchAll: Double
  
  /**
  		 * If the NoData value you specify occurs for a cell in a specified band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#noDataInterpretation)
  		 */
  var matchAny: Double
}
object rasterFunctionConstantsNoDataInterpretation {
  
  inline def apply(matchAll: Double, matchAny: Double): rasterFunctionConstantsNoDataInterpretation = {
    val __obj = js.Dynamic.literal(matchAll = matchAll.asInstanceOf[js.Any], matchAny = matchAny.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsNoDataInterpretation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsNoDataInterpretation] (val x: Self) extends AnyVal {
    
    inline def setMatchAll(value: Double): Self = StObject.set(x, "matchAll", value.asInstanceOf[js.Any])
    
    inline def setMatchAny(value: Double): Self = StObject.set(x, "matchAny", value.asInstanceOf[js.Any])
  }
}
