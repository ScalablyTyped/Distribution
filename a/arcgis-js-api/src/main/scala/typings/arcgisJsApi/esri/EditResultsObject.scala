package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditResultsObject extends StObject {
  
  /**
    * A list of objects containing the id and error information for every added entity or relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#editResultsObject)
    */
  var adds: js.Array[NamedObjectEditResults]
  
  /**
    * A list of objects containing the id and error information for every deleted entity or relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#editResultsObject)
    */
  var deletes: js.Array[NamedObjectEditResults]
  
  /**
    * The name of the [EntityType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) or [RelationshipType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) that had changed items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#editResultsObject)
    */
  var typeName: String
  
  /**
    * A list of objects containing the id and error information for every updated entity or relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#editResultsObject)
    */
  var updates: js.Array[NamedObjectEditResults]
}
object EditResultsObject {
  
  inline def apply(
    adds: js.Array[NamedObjectEditResults],
    deletes: js.Array[NamedObjectEditResults],
    typeName: String,
    updates: js.Array[NamedObjectEditResults]
  ): EditResultsObject = {
    val __obj = js.Dynamic.literal(adds = adds.asInstanceOf[js.Any], deletes = deletes.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditResultsObject]
  }
  
  extension [Self <: EditResultsObject](x: Self) {
    
    inline def setAdds(value: js.Array[NamedObjectEditResults]): Self = StObject.set(x, "adds", value.asInstanceOf[js.Any])
    
    inline def setAddsVarargs(value: NamedObjectEditResults*): Self = StObject.set(x, "adds", js.Array(value*))
    
    inline def setDeletes(value: js.Array[NamedObjectEditResults]): Self = StObject.set(x, "deletes", value.asInstanceOf[js.Any])
    
    inline def setDeletesVarargs(value: NamedObjectEditResults*): Self = StObject.set(x, "deletes", js.Array(value*))
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: js.Array[NamedObjectEditResults]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: NamedObjectEditResults*): Self = StObject.set(x, "updates", js.Array(value*))
  }
}
