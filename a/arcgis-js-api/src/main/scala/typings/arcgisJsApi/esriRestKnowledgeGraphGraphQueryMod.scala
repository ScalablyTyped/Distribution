package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphQuery
import typings.arcgisJsApi.esri.GraphQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphQueryMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphQuery", JSImport.Namespace)
  @js.native
  /**
  		 * Defines the query operation performed on a knowledge graph service's [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQuery.html)
  		 */
  open class ^ ()
    extends StObject
       with GraphQuery {
    def this(properties: GraphQueryProperties) = this()
  }
}
