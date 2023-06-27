package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphApplyEditsResultProperties extends StObject {
  
  /**
  		 * Returns a list of objects for each [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) or [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) that added, updated or deleted records by [executeApplyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeApplyEdits).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#editResults)
  		 */
  var editResults: js.UndefOr[js.Array[EditResultsObject]] = js.undefined
  
  /**
  		 * The error message explaining information about why [executeApplyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeApplyEdits) failed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#error)
  		 */
  var error: js.UndefOr[GraphApplyEditsResultError] = js.undefined
  
  /**
  		 * If `true` there was an error processing [executeApplyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeApplyEdits).
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#hasError)
  		 */
  var hasError: js.UndefOr[Any] = js.undefined
}
object GraphApplyEditsResultProperties {
  
  inline def apply(): GraphApplyEditsResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphApplyEditsResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphApplyEditsResultProperties] (val x: Self) extends AnyVal {
    
    inline def setEditResults(value: js.Array[EditResultsObject]): Self = StObject.set(x, "editResults", value.asInstanceOf[js.Any])
    
    inline def setEditResultsUndefined: Self = StObject.set(x, "editResults", js.undefined)
    
    inline def setEditResultsVarargs(value: EditResultsObject*): Self = StObject.set(x, "editResults", js.Array(value*))
    
    inline def setError(value: GraphApplyEditsResultError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHasError(value: Any): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    inline def setHasErrorUndefined: Self = StObject.set(x, "hasError", js.undefined)
  }
}
