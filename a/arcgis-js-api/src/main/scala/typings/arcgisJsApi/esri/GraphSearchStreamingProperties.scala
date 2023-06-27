package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphSearchStreamingProperties
  extends StObject
     with GraphSearchProperties {
  
  /**
  		 * Specifies list of IDs to search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#idsFilter)
  		 */
  var idsFilter: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * Specifies list of names of [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html#name) or [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#name) to search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#namedTypesFilter)
  		 */
  var namedTypesFilter: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The maximum number of results returned from the search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#num)
  		 */
  var num: js.UndefOr[Double] = js.undefined
  
  /**
  		 * If `true`, returns the IDs of objects that match the search, the names of the properties that matched the search term, scores and highlights of the result set.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#returnSearchContext)
  		 */
  var returnSearchContext: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The index of the first result to return.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphSearchStreaming.html#start)
  		 */
  var start: js.UndefOr[Double] = js.undefined
}
object GraphSearchStreamingProperties {
  
  inline def apply(): GraphSearchStreamingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphSearchStreamingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphSearchStreamingProperties] (val x: Self) extends AnyVal {
    
    inline def setIdsFilter(value: js.Array[String]): Self = StObject.set(x, "idsFilter", value.asInstanceOf[js.Any])
    
    inline def setIdsFilterUndefined: Self = StObject.set(x, "idsFilter", js.undefined)
    
    inline def setIdsFilterVarargs(value: String*): Self = StObject.set(x, "idsFilter", js.Array(value*))
    
    inline def setNamedTypesFilter(value: js.Array[String]): Self = StObject.set(x, "namedTypesFilter", value.asInstanceOf[js.Any])
    
    inline def setNamedTypesFilterUndefined: Self = StObject.set(x, "namedTypesFilter", js.undefined)
    
    inline def setNamedTypesFilterVarargs(value: String*): Self = StObject.set(x, "namedTypesFilter", js.Array(value*))
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setReturnSearchContext(value: Boolean): Self = StObject.set(x, "returnSearchContext", value.asInstanceOf[js.Any])
    
    inline def setReturnSearchContextUndefined: Self = StObject.set(x, "returnSearchContext", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
