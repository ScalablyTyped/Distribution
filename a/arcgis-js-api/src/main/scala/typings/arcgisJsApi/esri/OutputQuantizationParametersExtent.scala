package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputQuantizationParametersExtent extends StObject {
  
  /**
    * Maximum horizontal grid bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#extent)
    */
  var xmax: Double
  
  /**
    * Minimum horizontal grid bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#extent)
    */
  var xmin: Double
  
  /**
    * Maximum vertical grid bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#extent)
    */
  var ymax: Double
  
  /**
    * Minimum vertical grid bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#extent)
    */
  var ymin: Double
}
object OutputQuantizationParametersExtent {
  
  inline def apply(xmax: Double, xmin: Double, ymax: Double, ymin: Double): OutputQuantizationParametersExtent = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputQuantizationParametersExtent]
  }
  
  extension [Self <: OutputQuantizationParametersExtent](x: Self) {
    
    inline def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    inline def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    inline def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
    
    inline def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
  }
}
