package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphSearch
import typings.arcgisJsApi.esri.GraphSearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphSearchMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphSearch", JSImport.Namespace)
  @js.native
  /**
    * The search operation is performed on a [knowledge graph service's](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html) [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearch.html)
    */
  open class ^ ()
    extends StObject
       with GraphSearch {
    def this(properties: GraphSearchProperties) = this()
  }
}
