package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputQuantizationParametersProperties extends StObject {
  
  /**
    * An extent defining the quantization grid bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#extent)
    */
  var extent: js.UndefOr[OutputQuantizationParametersExtent] = js.undefined
  
  /**
    * Geometry coordinates are optimized for viewing and displaying of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#quantizeMode)
    */
  var quantizeMode: js.UndefOr[view | edit] = js.undefined
  
  /**
    * The size of one pixel in the units of the [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#tolerance)
    */
  var tolerance: js.UndefOr[Double] = js.undefined
}
object OutputQuantizationParametersProperties {
  
  inline def apply(): OutputQuantizationParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputQuantizationParametersProperties]
  }
  
  extension [Self <: OutputQuantizationParametersProperties](x: Self) {
    
    inline def setExtent(value: OutputQuantizationParametersExtent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setQuantizeMode(value: view | edit): Self = StObject.set(x, "quantizeMode", value.asInstanceOf[js.Any])
    
    inline def setQuantizeModeUndefined: Self = StObject.set(x, "quantizeMode", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
