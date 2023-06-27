package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphObjectType
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The display name of the graph object type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#alias)
  		 */
  var alias: String = js.native
  
  /**
  		 * Specifies [index fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html) for a graph object type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#fieldIndexes)
  		 */
  var fieldIndexes: js.Array[FieldIndex] = js.native
  
  /**
  		 * The name of the graph object type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * Specifies the [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html) of a graph object type such as an [EntityType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) or [RelationshipType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#properties)
  		 */
  var properties: js.Array[GraphProperty] = js.native
  
  /**
  		 * The object type's role in the knowledge graph.
  		 *
  		 * @default "Regular"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#role)
  		 */
  var role: String = js.native
}
