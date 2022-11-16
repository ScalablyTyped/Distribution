package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphApplyEditsResult
import typings.arcgisJsApi.esri.GraphApplyEditsResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphApplyEditsResultMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphApplyEditsResult", JSImport.Namespace)
  @js.native
  /**
    * The result of an [executeApplyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeApplyEdits) performed on a knowledge graph service's [graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html) resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html)
    */
  open class ^ ()
    extends StObject
       with GraphApplyEditsResult {
    def this(properties: GraphApplyEditsResultProperties) = this()
  }
}
