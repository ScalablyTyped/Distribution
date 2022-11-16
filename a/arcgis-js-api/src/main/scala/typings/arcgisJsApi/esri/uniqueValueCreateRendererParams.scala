package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait uniqueValueCreateRendererParams extends StObject {
  
  /**
    * A preferred class field name used for calculating unique values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#createRenderer)
    */
  var classFieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The color ramp to apply to the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#createRenderer)
    */
  var colorRamp: js.UndefOr[AlgorithmicColorRamp | MultipartColorRamp] = js.undefined
  
  /**
    * The colors to apply to each unique value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#createRenderer)
    */
  var colors: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * The input layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#createRenderer)
    */
  var layer: ImageryLayer | ImageryTileLayer
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#createRenderer)
    */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object uniqueValueCreateRendererParams {
  
  inline def apply(layer: ImageryLayer | ImageryTileLayer): uniqueValueCreateRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[uniqueValueCreateRendererParams]
  }
  
  extension [Self <: uniqueValueCreateRendererParams](x: Self) {
    
    inline def setClassFieldName(value: String): Self = StObject.set(x, "classFieldName", value.asInstanceOf[js.Any])
    
    inline def setClassFieldNameUndefined: Self = StObject.set(x, "classFieldName", js.undefined)
    
    inline def setColorRamp(value: AlgorithmicColorRamp | MultipartColorRamp): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    inline def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    inline def setColors(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
