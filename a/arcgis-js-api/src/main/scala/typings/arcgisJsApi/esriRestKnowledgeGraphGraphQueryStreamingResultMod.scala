package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphQueryStreamingResult
import typings.arcgisJsApi.esri.GraphQueryStreamingResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphQueryStreamingResultMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphQueryStreamingResult", JSImport.Namespace)
  @js.native
  /**
  		 * The result of a [executeSearchStreaming()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearchStreaming) or [executeQueryStreaming()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeQueryStreaming) on a knowledge graph service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreamingResult.html)
  		 */
  open class ^ ()
    extends StObject
       with GraphQueryStreamingResult {
    def this(properties: GraphQueryStreamingResultProperties) = this()
  }
}
