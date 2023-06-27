package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQueryStreamingResultProperties extends StObject {
  
  /**
  		 * Readable stream of objects matching [executeSearchStreaming()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearchStreaming) or [executeQueryStreaming()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeQueryStreaming) criteria.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreamingResult.html#resultRowsStream)
  		 */
  var resultRowsStream: js.UndefOr[Any] = js.undefined
}
object GraphQueryStreamingResultProperties {
  
  inline def apply(): GraphQueryStreamingResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQueryStreamingResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQueryStreamingResultProperties] (val x: Self) extends AnyVal {
    
    inline def setResultRowsStream(value: Any): Self = StObject.set(x, "resultRowsStream", value.asInstanceOf[js.Any])
    
    inline def setResultRowsStreamUndefined: Self = StObject.set(x, "resultRowsStream", js.undefined)
  }
}
