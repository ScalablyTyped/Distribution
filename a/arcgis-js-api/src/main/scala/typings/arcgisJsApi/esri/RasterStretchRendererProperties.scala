package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`histogram-equalization`
import typings.arcgisJsApi.arcgisJsApiStrings.`min-max`
import typings.arcgisJsApi.arcgisJsApiStrings.`percent-clip`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.sigmoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterStretchRendererProperties extends StObject {
  
  /**
    * The stretched values are mapped to this specified color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.undefined
  
  /**
    * The computeGamma automatically calculates best gamma value to render exported image based on empirical model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#computeGamma)
    */
  var computeGamma: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When Dynamic Range Adjustment is `true`, the statistics based on the current display extent are calculated as you zoom and pan around the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#dynamicRangeAdjustment)
    */
  var dynamicRangeAdjustment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The gamma values to be used if [useGamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma) is set to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma)
    */
  var gamma: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `percent-clip`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#maxPercent)
    */
  var maxPercent: js.UndefOr[Double] = js.undefined
  
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `percent-clip`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#minPercent)
    */
  var minPercent: js.UndefOr[Double] = js.undefined
  
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `standard-deviation`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#numberOfStandardDeviations)
    */
  var numberOfStandardDeviations: js.UndefOr[Double] = js.undefined
  
  /**
    * The outputMax denotes the output maximum, which is the highest pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax)
    */
  var outputMax: js.UndefOr[Double] = js.undefined
  
  /**
    * The outputMin denotes the output minimum, which is the lowest pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin)
    */
  var outputMin: js.UndefOr[Double] = js.undefined
  
  /**
    * The sigmoid strength level determines how much of the sigmoidal function will be used in the stretch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#sigmoidStrengthLevel)
    */
  var sigmoidStrengthLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * The input statistics can be specified through the statistics property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#statistics)
    */
  var statistics: js.UndefOr[(js.Array[js.Any | js.Array[Double]]) | RasterStretchRendererStatistics] = js.undefined
  
  /**
    * The stretch type defines a histogram stretch that will be applied to the rasters to enhance their appearance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType)
    */
  var stretchType: js.UndefOr[
    none | `standard-deviation` | `histogram-equalization` | `min-max` | `percent-clip` | sigmoid
  ] = js.undefined
  
  /**
    * Denotes whether the [gamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma) value should be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma)
    */
  var useGamma: js.UndefOr[Boolean] = js.undefined
}
object RasterStretchRendererProperties {
  
  inline def apply(): RasterStretchRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterStretchRendererProperties]
  }
  
  extension [Self <: RasterStretchRendererProperties](x: Self) {
    
    inline def setColorRamp(value: ColorRampProperties): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    inline def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    inline def setComputeGamma(value: Boolean): Self = StObject.set(x, "computeGamma", value.asInstanceOf[js.Any])
    
    inline def setComputeGammaUndefined: Self = StObject.set(x, "computeGamma", js.undefined)
    
    inline def setDynamicRangeAdjustment(value: Boolean): Self = StObject.set(x, "dynamicRangeAdjustment", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeAdjustmentUndefined: Self = StObject.set(x, "dynamicRangeAdjustment", js.undefined)
    
    inline def setGamma(value: js.Array[Double]): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setGammaVarargs(value: Double*): Self = StObject.set(x, "gamma", js.Array(value :_*))
    
    inline def setMaxPercent(value: Double): Self = StObject.set(x, "maxPercent", value.asInstanceOf[js.Any])
    
    inline def setMaxPercentUndefined: Self = StObject.set(x, "maxPercent", js.undefined)
    
    inline def setMinPercent(value: Double): Self = StObject.set(x, "minPercent", value.asInstanceOf[js.Any])
    
    inline def setMinPercentUndefined: Self = StObject.set(x, "minPercent", js.undefined)
    
    inline def setNumberOfStandardDeviations(value: Double): Self = StObject.set(x, "numberOfStandardDeviations", value.asInstanceOf[js.Any])
    
    inline def setNumberOfStandardDeviationsUndefined: Self = StObject.set(x, "numberOfStandardDeviations", js.undefined)
    
    inline def setOutputMax(value: Double): Self = StObject.set(x, "outputMax", value.asInstanceOf[js.Any])
    
    inline def setOutputMaxUndefined: Self = StObject.set(x, "outputMax", js.undefined)
    
    inline def setOutputMin(value: Double): Self = StObject.set(x, "outputMin", value.asInstanceOf[js.Any])
    
    inline def setOutputMinUndefined: Self = StObject.set(x, "outputMin", js.undefined)
    
    inline def setSigmoidStrengthLevel(value: Double): Self = StObject.set(x, "sigmoidStrengthLevel", value.asInstanceOf[js.Any])
    
    inline def setSigmoidStrengthLevelUndefined: Self = StObject.set(x, "sigmoidStrengthLevel", js.undefined)
    
    inline def setStatistics(value: (js.Array[js.Any | js.Array[Double]]) | RasterStretchRendererStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatisticsVarargs(value: (js.Any | js.Array[Double])*): Self = StObject.set(x, "statistics", js.Array(value :_*))
    
    inline def setStretchType(
      value: none | `standard-deviation` | `histogram-equalization` | `min-max` | `percent-clip` | sigmoid
    ): Self = StObject.set(x, "stretchType", value.asInstanceOf[js.Any])
    
    inline def setStretchTypeUndefined: Self = StObject.set(x, "stretchType", js.undefined)
    
    inline def setUseGamma(value: Boolean): Self = StObject.set(x, "useGamma", value.asInstanceOf[js.Any])
    
    inline def setUseGammaUndefined: Self = StObject.set(x, "useGamma", js.undefined)
  }
}
