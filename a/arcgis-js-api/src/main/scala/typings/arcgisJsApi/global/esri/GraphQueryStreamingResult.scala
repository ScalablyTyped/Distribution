package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GraphQueryStreamingResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GraphQueryStreamingResult")
@js.native
/**
  * The result of a [executeSearchStreaming()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearchStreaming) or [executeQueryStreaming()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeQueryStreaming) on a knowledge graph service.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreamingResult.html)
  */
open class GraphQueryStreamingResult ()
  extends StObject
     with typings.arcgisJsApi.esri.GraphQueryStreamingResult {
  def this(properties: GraphQueryStreamingResultProperties) = this()
}
