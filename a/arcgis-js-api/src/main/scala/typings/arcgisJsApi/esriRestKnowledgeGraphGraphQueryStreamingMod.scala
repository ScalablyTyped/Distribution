package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphQueryStreaming
import typings.arcgisJsApi.esri.GraphQueryStreamingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphQueryStreamingMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphQueryStreaming", JSImport.Namespace)
  @js.native
  /**
    * Defines a streaming query operation performed on a [knowledge graph service's](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html) [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryStreaming.html)
    */
  open class ^ ()
    extends StObject
       with GraphQueryStreaming {
    def this(properties: GraphQueryStreamingProperties) = this()
  }
}
