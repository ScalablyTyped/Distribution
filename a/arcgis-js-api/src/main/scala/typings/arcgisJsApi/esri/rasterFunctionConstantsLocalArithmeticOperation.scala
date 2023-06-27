package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsLocalArithmeticOperation extends StObject {
  
  /**
  		 * Calculates the absolute value of the cells in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var abs: Double
  
  /**
  		 * Divides the values of two rasters on a cell-by-cell basis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var divide: Double
  
  /**
  		 * Calculates the base e exponential of the cells in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var exp: Double
  
  /**
  		 * Calculates the base 10 exponential of the cells in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var exp10: Double
  
  /**
  		 * Calculates the base 2 exponential of the cells in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var exp2: Double
  
  /**
  		 * Converts each cell value of a raster into a floating-point representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var float: Double
  
  /**
  		 * Converts each cell value of a raster to an integer by truncation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var int: Double
  
  /**
  		 * Calculates the natural logarithm (base e) of cells in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var ln: Double
  
  /**
  		 * Calculates the base 10 logarithm of cells in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var log10: Double
  
  /**
  		 * Calculates the base 2 logarithm of cells in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var log2: Double
  
  /**
  		 * Subtracts the value of the second input raster from the value of the first input raster on a cell-by-cell basis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var minus: Double
  
  /**
  		 * Finds the remainder (modulo) of the first raster when divided by the second raster on a cell-by-cell basis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var mod: Double
  
  /**
  		 * Changes the sign (multiplies by -1) of the cell values of the input raster on a cell-by-cell basis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var negate: Double
  
  /**
  		 * Adds (sums) the values of two rasters on a cell-by-cell basis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var plus: Double
  
  /**
  		 * Raises the cell values in a raster to the power of the values found in another raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var power: Double
  
  /**
  		 * Returns the next lower integer value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var roundDown: Double
  
  /**
  		 * Returns the next higher integer value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var roundUp: Double
  
  /**
  		 * Calculates the square root of the cell values in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var sqrt: Double
  
  /**
  		 * Calculates the square of the cell values in a raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var square: Double
  
  /**
  		 * Multiplies the values of two rasters on a cell-by-cell basis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var times: Double
}
object rasterFunctionConstantsLocalArithmeticOperation {
  
  inline def apply(
    abs: Double,
    divide: Double,
    exp: Double,
    exp10: Double,
    exp2: Double,
    float: Double,
    int: Double,
    ln: Double,
    log10: Double,
    log2: Double,
    minus: Double,
    mod: Double,
    negate: Double,
    plus: Double,
    power: Double,
    roundDown: Double,
    roundUp: Double,
    sqrt: Double,
    square: Double,
    times: Double
  ): rasterFunctionConstantsLocalArithmeticOperation = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], divide = divide.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], exp10 = exp10.asInstanceOf[js.Any], exp2 = exp2.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], ln = ln.asInstanceOf[js.Any], log10 = log10.asInstanceOf[js.Any], log2 = log2.asInstanceOf[js.Any], minus = minus.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], plus = plus.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], roundDown = roundDown.asInstanceOf[js.Any], roundUp = roundUp.asInstanceOf[js.Any], sqrt = sqrt.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsLocalArithmeticOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsLocalArithmeticOperation] (val x: Self) extends AnyVal {
    
    inline def setAbs(value: Double): Self = StObject.set(x, "abs", value.asInstanceOf[js.Any])
    
    inline def setDivide(value: Double): Self = StObject.set(x, "divide", value.asInstanceOf[js.Any])
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExp10(value: Double): Self = StObject.set(x, "exp10", value.asInstanceOf[js.Any])
    
    inline def setExp2(value: Double): Self = StObject.set(x, "exp2", value.asInstanceOf[js.Any])
    
    inline def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setLn(value: Double): Self = StObject.set(x, "ln", value.asInstanceOf[js.Any])
    
    inline def setLog10(value: Double): Self = StObject.set(x, "log10", value.asInstanceOf[js.Any])
    
    inline def setLog2(value: Double): Self = StObject.set(x, "log2", value.asInstanceOf[js.Any])
    
    inline def setMinus(value: Double): Self = StObject.set(x, "minus", value.asInstanceOf[js.Any])
    
    inline def setMod(value: Double): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setNegate(value: Double): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setPlus(value: Double): Self = StObject.set(x, "plus", value.asInstanceOf[js.Any])
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setRoundDown(value: Double): Self = StObject.set(x, "roundDown", value.asInstanceOf[js.Any])
    
    inline def setRoundUp(value: Double): Self = StObject.set(x, "roundUp", value.asInstanceOf[js.Any])
    
    inline def setSqrt(value: Double): Self = StObject.set(x, "sqrt", value.asInstanceOf[js.Any])
    
    inline def setSquare(value: Double): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
  }
}
