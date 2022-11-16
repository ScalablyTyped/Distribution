package typings.arcgisJsApi

import typings.arcgisJsApi.esri.KnowledgeGraph
import typings.arcgisJsApi.esri.KnowledgeGraphProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphKnowledgeGraphMod {
  
  @JSImport("esri/rest/knowledgeGraph/KnowledgeGraph", JSImport.Namespace)
  @js.native
  /**
    * The knowledge graph associated with the [knowledgeGraphService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html)
    */
  open class ^ ()
    extends StObject
       with KnowledgeGraph {
    def this(properties: KnowledgeGraphProperties) = this()
  }
}
