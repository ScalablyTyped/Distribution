package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphSearchStreaming
import typings.arcgisJsApi.esri.GraphSearchStreamingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphSearchStreamingMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphSearchStreaming", JSImport.Namespace)
  @js.native
  /**
    * The search operation is performed on a knowledge graph service's [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html)
    */
  open class ^ ()
    extends StObject
       with GraphSearchStreaming {
    def this(properties: GraphSearchStreamingProperties) = this()
  }
}
