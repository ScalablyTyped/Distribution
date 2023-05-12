package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsSlopeType extends StObject {
  
  /**
    * The inclination of slope is calculated the same as DEGREE.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#slopeType)
    */
  var adjusted: Double
  
  /**
    * The inclination of slope is calculated in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#slopeType)
    */
  var degree: Double
  
  /**
    * The inclination of slope is calculated as percentage values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#slopeType)
    */
  var percentRise: Double
}
object rasterFunctionConstantsSlopeType {
  
  inline def apply(adjusted: Double, degree: Double, percentRise: Double): rasterFunctionConstantsSlopeType = {
    val __obj = js.Dynamic.literal(adjusted = adjusted.asInstanceOf[js.Any], degree = degree.asInstanceOf[js.Any], percentRise = percentRise.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsSlopeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsSlopeType] (val x: Self) extends AnyVal {
    
    inline def setAdjusted(value: Double): Self = StObject.set(x, "adjusted", value.asInstanceOf[js.Any])
    
    inline def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
    
    inline def setPercentRise(value: Double): Self = StObject.set(x, "percentRise", value.asInstanceOf[js.Any])
  }
}
