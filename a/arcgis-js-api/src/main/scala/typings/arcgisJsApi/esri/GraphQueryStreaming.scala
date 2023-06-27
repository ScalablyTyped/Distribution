package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQueryStreaming
  extends StObject
     with GraphQuery {
  
  /**
  		 * Custom quantization parameters for input geometry that compresses geometry for transfer to the server.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreaming.html#bindGeometryQuantizationParameters)
  		 */
  var bindGeometryQuantizationParameters: InputQuantizationParameters = js.native
  
  /**
  		 * Specifies a set of parameters containing data to be included in the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreaming.html#bindParameters)
  		 */
  var bindParameters: Any = js.native
  
  /**
  		 * Used to project the geometry onto a virtual grid, likely representing pixels on the screen.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreaming.html#outputQuantizationParameters)
  		 */
  var outputQuantizationParameters: OutputQuantizationParameters = js.native
}
