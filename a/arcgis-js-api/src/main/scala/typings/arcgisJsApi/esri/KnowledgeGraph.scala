package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnowledgeGraph
  extends StObject
     with Accessor {
  
  /**
    * The data model of the knowledge graph service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html#dataModel)
    */
  var dataModel: DataModel = js.native
  
  /**
    * The url to a hosted knowledge graph.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html#url)
    */
  var url: String = js.native
}
