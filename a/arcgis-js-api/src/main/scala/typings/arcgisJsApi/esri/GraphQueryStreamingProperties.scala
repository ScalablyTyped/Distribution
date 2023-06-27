package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQueryStreamingProperties
  extends StObject
     with GraphQueryProperties {
  
  /**
  		 * Custom quantization parameters for input geometry that compresses geometry for transfer to the server.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreaming.html#bindGeometryQuantizationParameters)
  		 */
  var bindGeometryQuantizationParameters: js.UndefOr[InputQuantizationParametersProperties] = js.undefined
  
  /**
  		 * Specifies a set of parameters containing data to be included in the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreaming.html#bindParameters)
  		 */
  var bindParameters: js.UndefOr[Any] = js.undefined
  
  /**
  		 * Used to project the geometry onto a virtual grid, likely representing pixels on the screen.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreaming.html#outputQuantizationParameters)
  		 */
  var outputQuantizationParameters: js.UndefOr[OutputQuantizationParametersProperties] = js.undefined
}
object GraphQueryStreamingProperties {
  
  inline def apply(): GraphQueryStreamingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQueryStreamingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQueryStreamingProperties] (val x: Self) extends AnyVal {
    
    inline def setBindGeometryQuantizationParameters(value: InputQuantizationParametersProperties): Self = StObject.set(x, "bindGeometryQuantizationParameters", value.asInstanceOf[js.Any])
    
    inline def setBindGeometryQuantizationParametersUndefined: Self = StObject.set(x, "bindGeometryQuantizationParameters", js.undefined)
    
    inline def setBindParameters(value: Any): Self = StObject.set(x, "bindParameters", value.asInstanceOf[js.Any])
    
    inline def setBindParametersUndefined: Self = StObject.set(x, "bindParameters", js.undefined)
    
    inline def setOutputQuantizationParameters(value: OutputQuantizationParametersProperties): Self = StObject.set(x, "outputQuantizationParameters", value.asInstanceOf[js.Any])
    
    inline def setOutputQuantizationParametersUndefined: Self = StObject.set(x, "outputQuantizationParameters", js.undefined)
  }
}
