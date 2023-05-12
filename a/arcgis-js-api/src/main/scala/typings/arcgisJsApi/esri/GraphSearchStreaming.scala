package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphSearchStreaming
  extends StObject
     with GraphSearch {
  
  /**
    * Specifies list of IDs to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#idsFilter)
    */
  var idsFilter: js.Array[String] = js.native
  
  /**
    * Specifies list of names of [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html#name) or [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#name) to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#namedTypesFilter)
    */
  var namedTypesFilter: js.Array[String] = js.native
  
  /**
    * The maximum number of results returned from the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#num)
    */
  var num: Double = js.native
  
  /**
    * If `true`, returns the IDs of objects that match the search, the names of the properties that matched the search term, scores and highlights of the result set.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#returnSearchContext)
    */
  var returnSearchContext: Boolean = js.native
  
  /**
    * The index of the first result to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#start)
    */
  var start: Double = js.native
}
