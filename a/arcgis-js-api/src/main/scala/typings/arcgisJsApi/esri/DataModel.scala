package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataModel
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Indicates if the data in the graph is managed by ArcGIS Knowledge.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#arcgisManaged)
  		 */
  val arcgisManaged: Boolean = js.native
  
  /**
  		 * A list of the [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) contained in the knowledge graph including their associated properties.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#entityTypes)
  		 */
  val entityTypes: js.Array[EntityType] = js.native
  
  /**
  		 * Information about the global ID for the knowledge graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#identifierInfo)
  		 */
  val identifierInfo: DataModelIdentifierInfo = js.native
  
  /**
  		 * A list of the [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) in the knowledge graph including their associated properties.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#relationshipTypes)
  		 */
  val relationshipTypes: js.Array[RelationshipType] = js.native
  
  /**
  		 * List of the search indexes in the knowledge graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#searchIndexes)
  		 */
  val searchIndexes: js.Array[SearchIndex] = js.native
  
  /**
  		 * Specifies [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) information for the knowledge graph.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#spatialReference)
  		 */
  val spatialReference: SpatialReference = js.native
  
  /**
  		 * Indicates whether users can make changes to the data model.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#strict)
  		 */
  val strict: Boolean = js.native
  
  /**
  		 * The date the data model was last updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#timestamp)
  		 */
  val timestamp: js.Date = js.native
}
