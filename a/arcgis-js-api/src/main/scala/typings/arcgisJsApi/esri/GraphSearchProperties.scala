package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.both_
import typings.arcgisJsApi.arcgisJsApiStrings.entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphSearchProperties extends StObject {
  
  /**
    * The text to search for in the knowledge graph.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearch.html#searchQuery)
    */
  var searchQuery: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to search [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html), [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html), or both.
    *
    * @default "both"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearch.html#typeCategoryFilter)
    */
  var typeCategoryFilter: js.UndefOr[entity | typings.arcgisJsApi.arcgisJsApiStrings.relationship | both_] = js.undefined
}
object GraphSearchProperties {
  
  inline def apply(): GraphSearchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphSearchProperties]
  }
  
  extension [Self <: GraphSearchProperties](x: Self) {
    
    inline def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    inline def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
    
    inline def setTypeCategoryFilter(value: entity | typings.arcgisJsApi.arcgisJsApiStrings.relationship | both_): Self = StObject.set(x, "typeCategoryFilter", value.asInstanceOf[js.Any])
    
    inline def setTypeCategoryFilterUndefined: Self = StObject.set(x, "typeCategoryFilter", js.undefined)
  }
}
