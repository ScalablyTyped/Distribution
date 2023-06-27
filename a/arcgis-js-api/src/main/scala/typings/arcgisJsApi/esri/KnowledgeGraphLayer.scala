package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`knowledge-graph`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnowledgeGraphLayer
  extends StObject
     with Layer {
  
  /**
  		 * Defines a set of [named types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphNamedObject.html) and/or [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) and [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) to be included in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#inclusionModeDefinition)
  		 */
  var inclusionModeDefinition: InclusionModeDefinition = js.native
  
  /**
  		 * The [data model](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html), [service definition](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html) and [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#url) of the [knowledge graph service](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html) that contains the data for the KnowledgeGraphLayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#knowledgeGraph)
  		 */
  val knowledgeGraph: KnowledgeGraph = js.native
  
  /**
  		 * A collection of operational [KnowledgeGraphSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#layers)
  		 */
  val layers: Collection[KnowledgeGraphSublayer] = js.native
  
  /**
  		 * The [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) included in the KnowledgeGraphLayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#memberEntityTypes)
  		 */
  val memberEntityTypes: js.Array[EntityType] = js.native
  
  /**
  		 * The [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) included in the KnowledgeGraphLayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#memberRelationshipTypes)
  		 */
  val memberRelationshipTypes: js.Array[RelationshipType] = js.native
  
  /**
  		 * All non-spatial [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) and [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) sublayers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#tables)
  		 */
  val tables: Collection[KnowledgeGraphSublayer] = js.native
  
  /**
  		 * The layer type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#type)
  		 */
  @JSName("type")
  val type_KnowledgeGraphLayer: `knowledge-graph` = js.native
  
  /**
  		 * The url of the [knowledge graph service](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#url)
  		 */
  var url: String = js.native
}
