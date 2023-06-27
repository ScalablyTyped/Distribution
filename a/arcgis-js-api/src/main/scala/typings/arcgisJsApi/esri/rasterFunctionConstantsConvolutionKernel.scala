package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsConvolutionKernel extends StObject {
  
  /**
  		 * East gradient detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var gradientEast: Double
  
  /**
  		 * North gradient detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var gradientNorth: Double
  
  /**
  		 * North east gradient detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var gradientNorthEast: Double
  
  /**
  		 * North west gradient detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var gradientNorthWest: Double
  
  /**
  		 * South gradient detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var gradientSouth: Double
  
  /**
  		 * West gradient detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var gradientWest: Double
  
  /**
  		 * Laplacian filters are often used for edge detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var laplacian3x3: Double
  
  /**
  		 * Laplacian filters are often used for edge detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var laplacian5x5: Double
  
  /**
  		 * Horizontal line detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var lineDetectionHorizontal: Double
  
  /**
  		 * Left diagonal line detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var lineDetectionLeftDiagonal: Double
  
  /**
  		 * Right diagonal line detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var lineDetectionRightDiagonal: Double
  
  /**
  		 * Vertical line detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var lineDetectionVertical: Double
  
  /**
  		 * No kernel type is specified.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var none: Double
  
  /**
  		 * The point spread function portrays the distribution of light from a point source through a lense.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var pointSpread: Double
  
  /**
  		 * Sharpens the date by calculating the focal sum statistic for each cell of the input using a weighted kernel neighborhood.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var sharpen: Double
  
  /**
  		 * Sharpens the date by calculating the focal sum statistic for each cell of the input using a weighted kernel neighborhood.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var sharpen2: Double
  
  /**
  		 * Sharpens the date by calculating the focal sum statistic for each cell of the input using a weighted kernel neighborhood.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var sharpening3x3: Double
  
  /**
  		 * Sharpens the date by calculating the focal sum statistic for each cell of the input using a weighted kernel neighborhood.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var sharpening5x5: Double
  
  /**
  		 * Smooths the data by reducing local variation and removing noise.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var smoothArithmeticMean: Double
  
  /**
  		 * Smooths (low-pass) the data by reducing local variation and removing noise.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var smoothing3x3: Double
  
  /**
  		 * Smooths (low-pass) the data by reducing local variation and removing noise.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var smoothing5x5: Double
  
  /**
  		 * The horizontal Sobel filter is used for edge detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var sobelHorizontal: Double
  
  /**
  		 * The vertical Sobel filter is used for edge detection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var sobelVertical: Double
  
  /**
  		 * User defined kernel type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  var userDefined: Double
}
object rasterFunctionConstantsConvolutionKernel {
  
  inline def apply(
    gradientEast: Double,
    gradientNorth: Double,
    gradientNorthEast: Double,
    gradientNorthWest: Double,
    gradientSouth: Double,
    gradientWest: Double,
    laplacian3x3: Double,
    laplacian5x5: Double,
    lineDetectionHorizontal: Double,
    lineDetectionLeftDiagonal: Double,
    lineDetectionRightDiagonal: Double,
    lineDetectionVertical: Double,
    none: Double,
    pointSpread: Double,
    sharpen: Double,
    sharpen2: Double,
    sharpening3x3: Double,
    sharpening5x5: Double,
    smoothArithmeticMean: Double,
    smoothing3x3: Double,
    smoothing5x5: Double,
    sobelHorizontal: Double,
    sobelVertical: Double,
    userDefined: Double
  ): rasterFunctionConstantsConvolutionKernel = {
    val __obj = js.Dynamic.literal(gradientEast = gradientEast.asInstanceOf[js.Any], gradientNorth = gradientNorth.asInstanceOf[js.Any], gradientNorthEast = gradientNorthEast.asInstanceOf[js.Any], gradientNorthWest = gradientNorthWest.asInstanceOf[js.Any], gradientSouth = gradientSouth.asInstanceOf[js.Any], gradientWest = gradientWest.asInstanceOf[js.Any], laplacian3x3 = laplacian3x3.asInstanceOf[js.Any], laplacian5x5 = laplacian5x5.asInstanceOf[js.Any], lineDetectionHorizontal = lineDetectionHorizontal.asInstanceOf[js.Any], lineDetectionLeftDiagonal = lineDetectionLeftDiagonal.asInstanceOf[js.Any], lineDetectionRightDiagonal = lineDetectionRightDiagonal.asInstanceOf[js.Any], lineDetectionVertical = lineDetectionVertical.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pointSpread = pointSpread.asInstanceOf[js.Any], sharpen = sharpen.asInstanceOf[js.Any], sharpen2 = sharpen2.asInstanceOf[js.Any], sharpening3x3 = sharpening3x3.asInstanceOf[js.Any], sharpening5x5 = sharpening5x5.asInstanceOf[js.Any], smoothArithmeticMean = smoothArithmeticMean.asInstanceOf[js.Any], smoothing3x3 = smoothing3x3.asInstanceOf[js.Any], smoothing5x5 = smoothing5x5.asInstanceOf[js.Any], sobelHorizontal = sobelHorizontal.asInstanceOf[js.Any], sobelVertical = sobelVertical.asInstanceOf[js.Any], userDefined = userDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsConvolutionKernel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsConvolutionKernel] (val x: Self) extends AnyVal {
    
    inline def setGradientEast(value: Double): Self = StObject.set(x, "gradientEast", value.asInstanceOf[js.Any])
    
    inline def setGradientNorth(value: Double): Self = StObject.set(x, "gradientNorth", value.asInstanceOf[js.Any])
    
    inline def setGradientNorthEast(value: Double): Self = StObject.set(x, "gradientNorthEast", value.asInstanceOf[js.Any])
    
    inline def setGradientNorthWest(value: Double): Self = StObject.set(x, "gradientNorthWest", value.asInstanceOf[js.Any])
    
    inline def setGradientSouth(value: Double): Self = StObject.set(x, "gradientSouth", value.asInstanceOf[js.Any])
    
    inline def setGradientWest(value: Double): Self = StObject.set(x, "gradientWest", value.asInstanceOf[js.Any])
    
    inline def setLaplacian3x3(value: Double): Self = StObject.set(x, "laplacian3x3", value.asInstanceOf[js.Any])
    
    inline def setLaplacian5x5(value: Double): Self = StObject.set(x, "laplacian5x5", value.asInstanceOf[js.Any])
    
    inline def setLineDetectionHorizontal(value: Double): Self = StObject.set(x, "lineDetectionHorizontal", value.asInstanceOf[js.Any])
    
    inline def setLineDetectionLeftDiagonal(value: Double): Self = StObject.set(x, "lineDetectionLeftDiagonal", value.asInstanceOf[js.Any])
    
    inline def setLineDetectionRightDiagonal(value: Double): Self = StObject.set(x, "lineDetectionRightDiagonal", value.asInstanceOf[js.Any])
    
    inline def setLineDetectionVertical(value: Double): Self = StObject.set(x, "lineDetectionVertical", value.asInstanceOf[js.Any])
    
    inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPointSpread(value: Double): Self = StObject.set(x, "pointSpread", value.asInstanceOf[js.Any])
    
    inline def setSharpen(value: Double): Self = StObject.set(x, "sharpen", value.asInstanceOf[js.Any])
    
    inline def setSharpen2(value: Double): Self = StObject.set(x, "sharpen2", value.asInstanceOf[js.Any])
    
    inline def setSharpening3x3(value: Double): Self = StObject.set(x, "sharpening3x3", value.asInstanceOf[js.Any])
    
    inline def setSharpening5x5(value: Double): Self = StObject.set(x, "sharpening5x5", value.asInstanceOf[js.Any])
    
    inline def setSmoothArithmeticMean(value: Double): Self = StObject.set(x, "smoothArithmeticMean", value.asInstanceOf[js.Any])
    
    inline def setSmoothing3x3(value: Double): Self = StObject.set(x, "smoothing3x3", value.asInstanceOf[js.Any])
    
    inline def setSmoothing5x5(value: Double): Self = StObject.set(x, "smoothing5x5", value.asInstanceOf[js.Any])
    
    inline def setSobelHorizontal(value: Double): Self = StObject.set(x, "sobelHorizontal", value.asInstanceOf[js.Any])
    
    inline def setSobelVertical(value: Double): Self = StObject.set(x, "sobelVertical", value.asInstanceOf[js.Any])
    
    inline def setUserDefined(value: Double): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
  }
}
