package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphApplyEdits
import typings.arcgisJsApi.esri.GraphApplyEditsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphApplyEditsMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphApplyEdits", JSImport.Namespace)
  @js.native
  /**
    * This class defines [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) and [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) to add, delete, and update in a knowledge graph service's [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html)
    */
  open class ^ ()
    extends StObject
       with GraphApplyEdits {
    def this(properties: GraphApplyEditsProperties) = this()
  }
}
