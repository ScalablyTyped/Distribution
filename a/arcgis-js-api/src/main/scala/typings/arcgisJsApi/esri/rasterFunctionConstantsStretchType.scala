package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsStretchType extends StObject {
  
  /**
  		 * The histogram equalization stretch type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#stretchType)
  		 */
  var histogramEqualization: Double
  
  /**
  		 * The minMax stretch type applies a linear stretch based on the output minimum and output maximum pixel values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#stretchType)
  		 */
  var minMax: Double
  
  /**
  		 * If the stretch type is None.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#stretchType)
  		 */
  var none: Double
  
  /**
  		 * The percent clip stretch type applies a linear stretch between the defined percent clip minimum and percent clip maximum pixel values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#stretchType)
  		 */
  var percentClip: Double
  
  /**
  		 * The Sigmoid contrast stretch is designed to highlight moderate pixel values in your imagery while maintaining sufficient contrast at the extremes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#stretchType)
  		 */
  var sigmoid: Double
  
  /**
  		 * The standard deviation stretch type applies a linear stretch between the values defined by the standard deviation (n) value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#stretchType)
  		 */
  var standardDeviation: Double
}
object rasterFunctionConstantsStretchType {
  
  inline def apply(
    histogramEqualization: Double,
    minMax: Double,
    none: Double,
    percentClip: Double,
    sigmoid: Double,
    standardDeviation: Double
  ): rasterFunctionConstantsStretchType = {
    val __obj = js.Dynamic.literal(histogramEqualization = histogramEqualization.asInstanceOf[js.Any], minMax = minMax.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], percentClip = percentClip.asInstanceOf[js.Any], sigmoid = sigmoid.asInstanceOf[js.Any], standardDeviation = standardDeviation.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsStretchType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsStretchType] (val x: Self) extends AnyVal {
    
    inline def setHistogramEqualization(value: Double): Self = StObject.set(x, "histogramEqualization", value.asInstanceOf[js.Any])
    
    inline def setMinMax(value: Double): Self = StObject.set(x, "minMax", value.asInstanceOf[js.Any])
    
    inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPercentClip(value: Double): Self = StObject.set(x, "percentClip", value.asInstanceOf[js.Any])
    
    inline def setSigmoid(value: Double): Self = StObject.set(x, "sigmoid", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviation(value: Double): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
  }
}
