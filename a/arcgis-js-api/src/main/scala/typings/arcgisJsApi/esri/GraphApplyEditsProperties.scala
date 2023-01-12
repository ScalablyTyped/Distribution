package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphApplyEditsProperties extends StObject {
  
  /**
    * A list of [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) to add to the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#entityAdds)
    */
  var entityAdds: js.UndefOr[js.Array[EntityProperties]] = js.undefined
  
  /**
    * A list of objects containing an [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) and the ids of the [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) of that type to delete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#entityDeletes)
    */
  var entityDeletes: js.UndefOr[js.Array[GraphNamedObjectDeletes]] = js.undefined
  
  /**
    * A list of [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) with the modified properties to update in the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#entityUpdates)
    */
  var entityUpdates: js.UndefOr[js.Array[EntityProperties]] = js.undefined
  
  /**
    * Additional options to set an [input quantization](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html) for any geometries being added to the graph and to automatically delete all relationships associated with a deleted entity.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#options)
    */
  var options: js.UndefOr[GraphApplyEditsOptions] = js.undefined
  
  /**
    * A list of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) to add to the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#relationshipAdds)
    */
  var relationshipAdds: js.UndefOr[js.Array[knowledgeGraphRelationshipProperties]] = js.undefined
  
  /**
    * A list of objects containing a [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html), and the ids of the [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) of that type to delete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#relationshipDeletes)
    */
  var relationshipDeletes: js.UndefOr[js.Array[GraphNamedObjectDeletes]] = js.undefined
  
  /**
    * A list of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) with modified properties to update in the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#relationshipUpdates)
    */
  var relationshipUpdates: js.UndefOr[js.Array[knowledgeGraphRelationshipProperties]] = js.undefined
}
object GraphApplyEditsProperties {
  
  inline def apply(): GraphApplyEditsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphApplyEditsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphApplyEditsProperties] (val x: Self) extends AnyVal {
    
    inline def setEntityAdds(value: js.Array[EntityProperties]): Self = StObject.set(x, "entityAdds", value.asInstanceOf[js.Any])
    
    inline def setEntityAddsUndefined: Self = StObject.set(x, "entityAdds", js.undefined)
    
    inline def setEntityAddsVarargs(value: EntityProperties*): Self = StObject.set(x, "entityAdds", js.Array(value*))
    
    inline def setEntityDeletes(value: js.Array[GraphNamedObjectDeletes]): Self = StObject.set(x, "entityDeletes", value.asInstanceOf[js.Any])
    
    inline def setEntityDeletesUndefined: Self = StObject.set(x, "entityDeletes", js.undefined)
    
    inline def setEntityDeletesVarargs(value: GraphNamedObjectDeletes*): Self = StObject.set(x, "entityDeletes", js.Array(value*))
    
    inline def setEntityUpdates(value: js.Array[EntityProperties]): Self = StObject.set(x, "entityUpdates", value.asInstanceOf[js.Any])
    
    inline def setEntityUpdatesUndefined: Self = StObject.set(x, "entityUpdates", js.undefined)
    
    inline def setEntityUpdatesVarargs(value: EntityProperties*): Self = StObject.set(x, "entityUpdates", js.Array(value*))
    
    inline def setOptions(value: GraphApplyEditsOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRelationshipAdds(value: js.Array[knowledgeGraphRelationshipProperties]): Self = StObject.set(x, "relationshipAdds", value.asInstanceOf[js.Any])
    
    inline def setRelationshipAddsUndefined: Self = StObject.set(x, "relationshipAdds", js.undefined)
    
    inline def setRelationshipAddsVarargs(value: knowledgeGraphRelationshipProperties*): Self = StObject.set(x, "relationshipAdds", js.Array(value*))
    
    inline def setRelationshipDeletes(value: js.Array[GraphNamedObjectDeletes]): Self = StObject.set(x, "relationshipDeletes", value.asInstanceOf[js.Any])
    
    inline def setRelationshipDeletesUndefined: Self = StObject.set(x, "relationshipDeletes", js.undefined)
    
    inline def setRelationshipDeletesVarargs(value: GraphNamedObjectDeletes*): Self = StObject.set(x, "relationshipDeletes", js.Array(value*))
    
    inline def setRelationshipUpdates(value: js.Array[knowledgeGraphRelationshipProperties]): Self = StObject.set(x, "relationshipUpdates", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUpdatesUndefined: Self = StObject.set(x, "relationshipUpdates", js.undefined)
    
    inline def setRelationshipUpdatesVarargs(value: knowledgeGraphRelationshipProperties*): Self = StObject.set(x, "relationshipUpdates", js.Array(value*))
  }
}
