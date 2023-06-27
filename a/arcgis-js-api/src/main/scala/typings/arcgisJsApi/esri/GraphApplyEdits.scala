package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphApplyEdits
  extends StObject
     with Accessor {
  
  /**
  		 * A list of [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) to add to the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#entityAdds)
  		 */
  var entityAdds: js.Array[Entity] = js.native
  
  /**
  		 * A list of objects containing an [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) and the ids of the [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) of that type to delete.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#entityDeletes)
  		 */
  var entityDeletes: js.Array[GraphNamedObjectDeletes] = js.native
  
  /**
  		 * A list of [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) with the modified properties to update in the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#entityUpdates)
  		 */
  var entityUpdates: js.Array[Entity] = js.native
  
  /**
  		 * Additional options to set an [input quantization](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html) for any geometries being added to the graph and to automatically delete all relationships associated with a deleted entity.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#options)
  		 */
  var options: GraphApplyEditsOptions = js.native
  
  /**
  		 * A list of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) to add to the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#relationshipAdds)
  		 */
  var relationshipAdds: js.Array[knowledgeGraphRelationship] = js.native
  
  /**
  		 * A list of objects containing a [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html), and the ids of the [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) of that type to delete.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#relationshipDeletes)
  		 */
  var relationshipDeletes: js.Array[GraphNamedObjectDeletes] = js.native
  
  /**
  		 * A list of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) with modified properties to update in the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#relationshipUpdates)
  		 */
  var relationshipUpdates: js.Array[knowledgeGraphRelationship] = js.native
}
