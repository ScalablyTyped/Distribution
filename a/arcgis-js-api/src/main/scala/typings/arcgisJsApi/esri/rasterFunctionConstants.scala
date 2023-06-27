package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Various constant values used by different raster functions when setting [ImageryTileLayer.rasterFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#rasterFunction) or [ImageryLayer.rasterFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#rasterFunction) properties.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html)
	 */
trait rasterFunctionConstants extends StObject {
  
  /**
  		 * Method name constants used by the [band index raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm#ESRI_SECTION1_4D75298B90D94E6B87B0C9F28D5AE269).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
  		 */
  val bandIndexType: rasterFunctionConstantsBandIndexType
  
  /**
  		 * The local cell statistics operations type constants.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#cellStatisticalOperation)
  		 */
  val cellStatisticalOperation: rasterFunctionConstantsCellStatisticalOperation
  
  /**
  		 * Predefined raster color ramp name constants used for the [Colormap raster function](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm#GUID-5DDFC961-A857-445F-A983-13AF67D45833).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colorRampName)
  		 */
  val colorRampName: rasterFunctionConstantsColorRampName
  
  /**
  		 * Predefined raster color map name constants used for the [Colormap raster function](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm#GUID-5DDFC961-A857-445F-A983-13AF67D45833).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colormapName)
  		 */
  val colormapName: rasterFunctionConstantsColormapName
  
  /**
  		 * Kernel type constants used for the [Convolution raster function](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm#ESRI_SECTION1_B69A71FDFD7C46A6860A7302A9AD3B17).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#convolutionKernel)
  		 */
  val convolutionKernel: rasterFunctionConstantsConvolutionKernel
  
  /**
  		 * The local arithmetic operations types.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localArithmeticOperation)
  		 */
  var localArithmeticOperation: rasterFunctionConstantsLocalArithmeticOperation
  
  /**
  		 * The local conditional operations type constants.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localConditionalOperation)
  		 */
  val localConditionalOperation: rasterFunctionConstantsLocalConditionalOperation
  
  /**
  		 * The local logical operations type constants.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localLogicalOperation)
  		 */
  val localLogicalOperation: rasterFunctionConstantsLocalLogicalOperation
  
  /**
  		 * The local trigonometric operations type constants.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localTrigonometricOperation)
  		 */
  val localTrigonometricOperation: rasterFunctionConstantsLocalTrigonometricOperation
  
  /**
  		 * The missing band action constants available for the [Extract band raster function](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm#ESRI_SECTION1_2FC6FEAA2801446B9578A7C90B1DD6AB).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#missingBandAction)
  		 */
  val missingBandAction: rasterFunctionConstantsMissingBandAction
  
  /**
  		 * The NoData interpretation constants used for the [Mask raster function](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm#ESRI_SECTION1_5515B13D320B408B9F70B9B8344028FF).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#noDataInterpretation)
  		 */
  val noDataInterpretation: rasterFunctionConstantsNoDataInterpretation
  
  /**
  		 * Slope type constants used for the [slope raster function](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm#ESRI_SECTION1_641F092319AE46D1A9441F8D1FDF186C).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#slopeType)
  		 */
  val slopeType: rasterFunctionConstantsSlopeType
  
  /**
  		 * Stretch type constants used for the [stretch raster function](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm#ESRI_SECTION1_7545363F0B8A4B7B931A54B3C4189D9D).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#stretchType)
  		 */
  val stretchType: rasterFunctionConstantsStretchType
}
object rasterFunctionConstants {
  
  inline def apply(
    bandIndexType: rasterFunctionConstantsBandIndexType,
    cellStatisticalOperation: rasterFunctionConstantsCellStatisticalOperation,
    colorRampName: rasterFunctionConstantsColorRampName,
    colormapName: rasterFunctionConstantsColormapName,
    convolutionKernel: rasterFunctionConstantsConvolutionKernel,
    localArithmeticOperation: rasterFunctionConstantsLocalArithmeticOperation,
    localConditionalOperation: rasterFunctionConstantsLocalConditionalOperation,
    localLogicalOperation: rasterFunctionConstantsLocalLogicalOperation,
    localTrigonometricOperation: rasterFunctionConstantsLocalTrigonometricOperation,
    missingBandAction: rasterFunctionConstantsMissingBandAction,
    noDataInterpretation: rasterFunctionConstantsNoDataInterpretation,
    slopeType: rasterFunctionConstantsSlopeType,
    stretchType: rasterFunctionConstantsStretchType
  ): rasterFunctionConstants = {
    val __obj = js.Dynamic.literal(bandIndexType = bandIndexType.asInstanceOf[js.Any], cellStatisticalOperation = cellStatisticalOperation.asInstanceOf[js.Any], colorRampName = colorRampName.asInstanceOf[js.Any], colormapName = colormapName.asInstanceOf[js.Any], convolutionKernel = convolutionKernel.asInstanceOf[js.Any], localArithmeticOperation = localArithmeticOperation.asInstanceOf[js.Any], localConditionalOperation = localConditionalOperation.asInstanceOf[js.Any], localLogicalOperation = localLogicalOperation.asInstanceOf[js.Any], localTrigonometricOperation = localTrigonometricOperation.asInstanceOf[js.Any], missingBandAction = missingBandAction.asInstanceOf[js.Any], noDataInterpretation = noDataInterpretation.asInstanceOf[js.Any], slopeType = slopeType.asInstanceOf[js.Any], stretchType = stretchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstants]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstants] (val x: Self) extends AnyVal {
    
    inline def setBandIndexType(value: rasterFunctionConstantsBandIndexType): Self = StObject.set(x, "bandIndexType", value.asInstanceOf[js.Any])
    
    inline def setCellStatisticalOperation(value: rasterFunctionConstantsCellStatisticalOperation): Self = StObject.set(x, "cellStatisticalOperation", value.asInstanceOf[js.Any])
    
    inline def setColorRampName(value: rasterFunctionConstantsColorRampName): Self = StObject.set(x, "colorRampName", value.asInstanceOf[js.Any])
    
    inline def setColormapName(value: rasterFunctionConstantsColormapName): Self = StObject.set(x, "colormapName", value.asInstanceOf[js.Any])
    
    inline def setConvolutionKernel(value: rasterFunctionConstantsConvolutionKernel): Self = StObject.set(x, "convolutionKernel", value.asInstanceOf[js.Any])
    
    inline def setLocalArithmeticOperation(value: rasterFunctionConstantsLocalArithmeticOperation): Self = StObject.set(x, "localArithmeticOperation", value.asInstanceOf[js.Any])
    
    inline def setLocalConditionalOperation(value: rasterFunctionConstantsLocalConditionalOperation): Self = StObject.set(x, "localConditionalOperation", value.asInstanceOf[js.Any])
    
    inline def setLocalLogicalOperation(value: rasterFunctionConstantsLocalLogicalOperation): Self = StObject.set(x, "localLogicalOperation", value.asInstanceOf[js.Any])
    
    inline def setLocalTrigonometricOperation(value: rasterFunctionConstantsLocalTrigonometricOperation): Self = StObject.set(x, "localTrigonometricOperation", value.asInstanceOf[js.Any])
    
    inline def setMissingBandAction(value: rasterFunctionConstantsMissingBandAction): Self = StObject.set(x, "missingBandAction", value.asInstanceOf[js.Any])
    
    inline def setNoDataInterpretation(value: rasterFunctionConstantsNoDataInterpretation): Self = StObject.set(x, "noDataInterpretation", value.asInstanceOf[js.Any])
    
    inline def setSlopeType(value: rasterFunctionConstantsSlopeType): Self = StObject.set(x, "slopeType", value.asInstanceOf[js.Any])
    
    inline def setStretchType(value: rasterFunctionConstantsStretchType): Self = StObject.set(x, "stretchType", value.asInstanceOf[js.Any])
  }
}
