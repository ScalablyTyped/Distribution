package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`defined-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.quantile
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait classBreaksCreateRendererParams extends StObject {
  
  /**
    * The classification method used for generating breaks.
    *
    * @default natural-breaks
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var classificationMethod: js.UndefOr[
    `equal-interval` | `natural-breaks` | quantile | `standard-deviation` | `defined-interval`
  ] = js.undefined
  
  /**
    * The color ramp to apply to the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var colorRamp: js.UndefOr[AlgorithmicColorRamp | MultipartColorRamp] = js.undefined
  
  /**
    * The colors to apply to each class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var colors: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * Only applicable when `classificationMethod` is `defined-interval`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var definedInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The field whose data will be used in the classification.
    *
    * @default value
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The input layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var layer: ImageryLayer | ImageryTileLayer | WCSLayer
  
  /**
    * The number of class breaks to generate for the classification.
    *
    * @default 5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var numClasses: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * Only applicable to multidimensional datasets where a raster layer can contain more than one variable (such as temperature, humidity, wind speed) with different statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
    */
  var variableName: js.UndefOr[String] = js.undefined
}
object classBreaksCreateRendererParams {
  
  inline def apply(layer: ImageryLayer | ImageryTileLayer | WCSLayer): classBreaksCreateRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[classBreaksCreateRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: classBreaksCreateRendererParams] (val x: Self) extends AnyVal {
    
    inline def setClassificationMethod(value: `equal-interval` | `natural-breaks` | quantile | `standard-deviation` | `defined-interval`): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    inline def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    inline def setColorRamp(value: AlgorithmicColorRamp | MultipartColorRamp): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    inline def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    inline def setColors(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDefinedInterval(value: Double): Self = StObject.set(x, "definedInterval", value.asInstanceOf[js.Any])
    
    inline def setDefinedIntervalUndefined: Self = StObject.set(x, "definedInterval", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer | WCSLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    inline def setNumClassesUndefined: Self = StObject.set(x, "numClasses", js.undefined)
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    inline def setVariableNameUndefined: Self = StObject.set(x, "variableName", js.undefined)
  }
}
