package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphQueryResult
import typings.arcgisJsApi.esri.GraphQueryResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphQueryResultMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphQueryResult", JSImport.Namespace)
  @js.native
  /**
    * The results of a [executeQuery()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeQuery) or [executeSearch()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearch) on a knowledge graph service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryResult.html)
    */
  open class ^ ()
    extends StObject
       with GraphQueryResult {
    def this(properties: GraphQueryResultProperties) = this()
  }
}
