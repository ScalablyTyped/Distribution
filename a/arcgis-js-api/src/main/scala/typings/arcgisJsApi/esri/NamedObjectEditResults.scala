package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedObjectEditResults extends StObject {
  
  /**
  		 * Indicates any errors caused during the operation applied to this object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#NamedObjectEditResults)
  		 */
  var error: NamedObjectEditResultsError
  
  /**
  		 * The id of the [Entity](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) or [Relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) that was added, updated or deleted from the knowledge graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#NamedObjectEditResults)
  		 */
  var id: String
}
object NamedObjectEditResults {
  
  inline def apply(error: NamedObjectEditResultsError, id: String): NamedObjectEditResults = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedObjectEditResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedObjectEditResults] (val x: Self) extends AnyVal {
    
    inline def setError(value: NamedObjectEditResultsError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
