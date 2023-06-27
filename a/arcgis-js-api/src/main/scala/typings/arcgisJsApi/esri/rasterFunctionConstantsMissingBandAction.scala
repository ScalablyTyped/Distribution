package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsMissingBandAction extends StObject {
  
  /**
  		 * Finds the best available band to use in place of the missing band based on wavelength.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#missingBandAction)
  		 */
  var bestMatch: Double
  
  /**
  		 * If the input dataset is missing any band specified in the Band parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#missingBandAction)
  		 */
  var fail: Double
}
object rasterFunctionConstantsMissingBandAction {
  
  inline def apply(bestMatch: Double, fail: Double): rasterFunctionConstantsMissingBandAction = {
    val __obj = js.Dynamic.literal(bestMatch = bestMatch.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsMissingBandAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsMissingBandAction] (val x: Self) extends AnyVal {
    
    inline def setBestMatch(value: Double): Self = StObject.set(x, "bestMatch", value.asInstanceOf[js.Any])
    
    inline def setFail(value: Double): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
  }
}
