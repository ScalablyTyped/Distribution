package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsLocalTrigonometricOperation extends StObject {
  
  /**
    * Calculates the inverse cosine of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var acos: Double
  
  /**
    * Calculates the inverse hyperbolic cosine of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var acosh: Double
  
  /**
    * Calculates the inverse sine of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var asin: Double
  
  /**
    * Calculates the inverse hyperbolic sine of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var asinh: Double
  
  /**
    * Calculates the inverse tangent of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var atan: Double
  
  /**
    * Calculates the inverse tangent (based on x,y) of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var atan2: Double
  
  /**
    * Calculates the inverse hyperbolic tangent of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var atanh: Double
  
  /**
    * Calculates the cosine of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var cos: Double
  
  /**
    * Calculates the hyperbolic cosine of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var cosh: Double
  
  /**
    * Calculates the sine of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var sin: Double
  
  /**
    * Calculates the hyperbolic sine of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var sinh: Double
  
  /**
    * Calculates the tangent of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var tan: Double
  
  /**
    * Calculates the hyperbolic tangent of cells in a raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
    */
  var tanh: Double
}
object rasterFunctionConstantsLocalTrigonometricOperation {
  
  inline def apply(
    acos: Double,
    acosh: Double,
    asin: Double,
    asinh: Double,
    atan: Double,
    atan2: Double,
    atanh: Double,
    cos: Double,
    cosh: Double,
    sin: Double,
    sinh: Double,
    tan: Double,
    tanh: Double
  ): rasterFunctionConstantsLocalTrigonometricOperation = {
    val __obj = js.Dynamic.literal(acos = acos.asInstanceOf[js.Any], acosh = acosh.asInstanceOf[js.Any], asin = asin.asInstanceOf[js.Any], asinh = asinh.asInstanceOf[js.Any], atan = atan.asInstanceOf[js.Any], atan2 = atan2.asInstanceOf[js.Any], atanh = atanh.asInstanceOf[js.Any], cos = cos.asInstanceOf[js.Any], cosh = cosh.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any], sinh = sinh.asInstanceOf[js.Any], tan = tan.asInstanceOf[js.Any], tanh = tanh.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsLocalTrigonometricOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsLocalTrigonometricOperation] (val x: Self) extends AnyVal {
    
    inline def setAcos(value: Double): Self = StObject.set(x, "acos", value.asInstanceOf[js.Any])
    
    inline def setAcosh(value: Double): Self = StObject.set(x, "acosh", value.asInstanceOf[js.Any])
    
    inline def setAsin(value: Double): Self = StObject.set(x, "asin", value.asInstanceOf[js.Any])
    
    inline def setAsinh(value: Double): Self = StObject.set(x, "asinh", value.asInstanceOf[js.Any])
    
    inline def setAtan(value: Double): Self = StObject.set(x, "atan", value.asInstanceOf[js.Any])
    
    inline def setAtan2(value: Double): Self = StObject.set(x, "atan2", value.asInstanceOf[js.Any])
    
    inline def setAtanh(value: Double): Self = StObject.set(x, "atanh", value.asInstanceOf[js.Any])
    
    inline def setCos(value: Double): Self = StObject.set(x, "cos", value.asInstanceOf[js.Any])
    
    inline def setCosh(value: Double): Self = StObject.set(x, "cosh", value.asInstanceOf[js.Any])
    
    inline def setSin(value: Double): Self = StObject.set(x, "sin", value.asInstanceOf[js.Any])
    
    inline def setSinh(value: Double): Self = StObject.set(x, "sinh", value.asInstanceOf[js.Any])
    
    inline def setTan(value: Double): Self = StObject.set(x, "tan", value.asInstanceOf[js.Any])
    
    inline def setTanh(value: Double): Self = StObject.set(x, "tanh", value.asInstanceOf[js.Any])
  }
}
