package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`histogram-equalization`
import typings.arcgisJsApi.arcgisJsApiStrings.`min-max`
import typings.arcgisJsApi.arcgisJsApiStrings.`percent-clip`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.sigmoid
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait stretchCreateRendererParams extends StObject {
  
  /**
    * The 0-based index of a selected band.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var bandId: js.UndefOr[Double] = js.undefined
  
  /**
    * The color ramp to apply to the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var colorRamp: js.UndefOr[AlgorithmicColorRamp | MultipartColorRamp] = js.undefined
  
  /**
    * When `true`, calculates the renderer's statistics based on the current display extent and recalculates them as you zoom and pan around the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var dynamicRangeAdjustment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Useful in scenarios where an image service does not have statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var estimateStatistics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The gamma values to be used if `useGamma` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var gamma: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The input layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var layer: ImageryLayer | ImageryTileLayer | WCSLayer
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * A preferred stretch type can be provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var stretchType: js.UndefOr[
    none_ | `min-max` | `standard-deviation` | `histogram-equalization` | `percent-clip` | sigmoid
  ] = js.undefined
  
  /**
    * Indicates whether the `gamma` values should be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var useGamma: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only applicable to multidimensional datasets where a raster layer can contain more than one variable (such as temperature, humidity, wind speed) with different statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  var variableName: js.UndefOr[String] = js.undefined
}
object stretchCreateRendererParams {
  
  inline def apply(layer: ImageryLayer | ImageryTileLayer | WCSLayer): stretchCreateRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[stretchCreateRendererParams]
  }
  
  extension [Self <: stretchCreateRendererParams](x: Self) {
    
    inline def setBandId(value: Double): Self = StObject.set(x, "bandId", value.asInstanceOf[js.Any])
    
    inline def setBandIdUndefined: Self = StObject.set(x, "bandId", js.undefined)
    
    inline def setColorRamp(value: AlgorithmicColorRamp | MultipartColorRamp): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    inline def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    inline def setDynamicRangeAdjustment(value: Boolean): Self = StObject.set(x, "dynamicRangeAdjustment", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeAdjustmentUndefined: Self = StObject.set(x, "dynamicRangeAdjustment", js.undefined)
    
    inline def setEstimateStatistics(value: Boolean): Self = StObject.set(x, "estimateStatistics", value.asInstanceOf[js.Any])
    
    inline def setEstimateStatisticsUndefined: Self = StObject.set(x, "estimateStatistics", js.undefined)
    
    inline def setGamma(value: js.Array[Double]): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setGammaVarargs(value: Double*): Self = StObject.set(x, "gamma", js.Array(value*))
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer | WCSLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStretchType(
      value: none_ | `min-max` | `standard-deviation` | `histogram-equalization` | `percent-clip` | sigmoid
    ): Self = StObject.set(x, "stretchType", value.asInstanceOf[js.Any])
    
    inline def setStretchTypeUndefined: Self = StObject.set(x, "stretchType", js.undefined)
    
    inline def setUseGamma(value: Boolean): Self = StObject.set(x, "useGamma", value.asInstanceOf[js.Any])
    
    inline def setUseGammaUndefined: Self = StObject.set(x, "useGamma", js.undefined)
    
    inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    inline def setVariableNameUndefined: Self = StObject.set(x, "variableName", js.undefined)
  }
}
