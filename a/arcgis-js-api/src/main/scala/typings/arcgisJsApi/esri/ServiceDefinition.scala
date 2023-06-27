package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceDefinition
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Indicates if geometry data in the graph can be modified.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#allowGeometryUpdates)
  		 */
  val allowGeometryUpdates: Boolean = js.native
  
  /**
  		 * Specifies the operational capabilities of the knowledge graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#capabilities)
  		 */
  val capabilities: js.Array[String] = js.native
  
  /**
  		 * Copyright information for the knowledge graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#copyrightText)
  		 */
  val copyrightText: String = js.native
  
  /**
  		 * The version number of the ArcGIS Enterprise instance where the knowledge graph service is hosted.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#currentVersion)
  		 */
  val currentVersion: Double = js.native
  
  /**
  		 * Indicates if data editing is not supported.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#dataEditingNotSupported)
  		 */
  val dataEditingNotSupported: Boolean = js.native
  
  /**
  		 * Specifies the timezone for dateTime fields.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#dateFieldsTimeReference)
  		 */
  val dateFieldsTimeReference: ServiceDefinitionDateFieldsTimeReference = js.native
  
  /**
  		 * The description of the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#description)
  		 */
  val description: String = js.native
  
  /**
  		 * The maximum number of records returned by a [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeQuery) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#maxRecordCount)
  		 */
  val maxRecordCount: Double = js.native
  
  /**
  		 * Indicates if the knowledge graph schema (data model) can be edited.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#schemaEditingNotSupported)
  		 */
  val schemaEditingNotSupported: Boolean = js.native
  
  /**
  		 * The maximum number of records returned by a [search](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearch) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#searchMaxRecordCount)
  		 */
  val searchMaxRecordCount: Double = js.native
  
  /**
  		 * specifies the details of the index, edit, search and	 geometry capabilities of the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  val serviceCapabilities: ServiceDefinitionServiceCapabilities = js.native
  
  /**
  		 * The ArcGIS Enterprise Portal item id of the knowledge graph service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceItemId)
  		 */
  val serviceItemId: String = js.native
  
  /**
  		 * Specifies the [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) information for the knowledge graph service.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#spatialReference)
  		 */
  val spatialReference: SpatialReference = js.native
  
  /**
  		 * Indicates if the services supports search operations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#supportSearch)
  		 */
  val supportSearch: Boolean = js.native
  
  /**
  		 * The query formats supported by the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#supportedQueryFormats)
  		 */
  val supportedQueryFormats: js.Array[String] = js.native
  
  /**
  		 * Indicates if the service supports entity types with a document role.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#supportsDocuments)
  		 */
  val supportsDocuments: Boolean = js.native
  
  /**
  		 * The units for the spatial reference.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#units)
  		 */
  val units: String = js.native
}
