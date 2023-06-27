package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.both_
import typings.arcgisJsApi.arcgisJsApiStrings.entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphSearch
  extends StObject
     with Accessor {
  
  /**
  		 * The text to search for in the knowledge graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearch.html#searchQuery)
  		 */
  var searchQuery: String = js.native
  
  /**
  		 * Specifies whether to search [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html), [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html), or both.
  		 *
  		 * @default "both"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearch.html#typeCategoryFilter)
  		 */
  var typeCategoryFilter: entity | typings.arcgisJsApi.arcgisJsApiStrings.relationship | both_ = js.native
}
