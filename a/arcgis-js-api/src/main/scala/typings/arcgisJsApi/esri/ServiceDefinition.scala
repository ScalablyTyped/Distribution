package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Outlines the service capabilities for a [knowledgeGraphService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html)
  */
trait ServiceDefinition extends StObject {
  
  /**
    * Indicates if geometry data in the graph can be modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#allowGeometryUpdates)
    */
  val allowGeometryUpdates: Boolean
  
  /**
    * Specifies the operational capabilities of the knowledge graph.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#capabilities)
    */
  val capabilities: js.Array[String]
  
  /**
    * Copyright information for the knowledge graph.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#copyrightText)
    */
  val copyrightText: String
  
  /**
    * The version number of the ArcGIS Enterprise instance where the knowledge graph service is hosted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#currentVersion)
    */
  val currentVersion: Double
  
  /**
    * Indicates if data editing is not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#dataEditingNotSupported)
    */
  val dataEditingNotSupported: Boolean
  
  /**
    * Specifies the timezone for dateTime fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#dateFieldsTimeReference)
    */
  val dateFieldsTimeReference: ServiceDefinitionDateFieldsTimeReference
  
  /**
    * The description of the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#description)
    */
  val description: String
  
  /**
    * The maximum number of records returned by a [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeQuery) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#maxRecordCount)
    */
  val maxRecordCount: Double
  
  /**
    * Indicates if the knowledge graph schema (data model) can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#schemaEditingNotSupported)
    */
  val schemaEditingNotSupported: Boolean
  
  /**
    * The maximum number of records returned by a [search](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearch) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#searchMaxRecordCount)
    */
  val searchMaxRecordCount: Double
  
  /**
    * specifies the details of the index, edit, search and  geometry capabilities of the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
    */
  val serviceCapabilities: ServiceDefinitionServiceCapabilities
  
  /**
    * The ArcGIS Enterprise Portal item id of the knowledge graph service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceItemId)
    */
  val serviceItemId: String
  
  /**
    * Specifies the [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) information for the knowledge graph service.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#spatialReference)
    */
  val spatialReference: SpatialReference
  
  /**
    * Indicates if the services supports search operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#supportSearch)
    */
  val supportSearch: Boolean
  
  /**
    * The query formats supported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#supportedQueryFormats)
    */
  val supportedQueryFormats: js.Array[String]
  
  /**
    * Indicates if the service supports entity types with a document role.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#supportsDocuments)
    */
  val supportsDocuments: Boolean
  
  /**
    * The units for the spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#units)
    */
  val units: String
}
object ServiceDefinition {
  
  inline def apply(
    allowGeometryUpdates: Boolean,
    capabilities: js.Array[String],
    copyrightText: String,
    currentVersion: Double,
    dataEditingNotSupported: Boolean,
    dateFieldsTimeReference: ServiceDefinitionDateFieldsTimeReference,
    description: String,
    maxRecordCount: Double,
    schemaEditingNotSupported: Boolean,
    searchMaxRecordCount: Double,
    serviceCapabilities: ServiceDefinitionServiceCapabilities,
    serviceItemId: String,
    spatialReference: SpatialReference,
    supportSearch: Boolean,
    supportedQueryFormats: js.Array[String],
    supportsDocuments: Boolean,
    units: String
  ): ServiceDefinition = {
    val __obj = js.Dynamic.literal(allowGeometryUpdates = allowGeometryUpdates.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], copyrightText = copyrightText.asInstanceOf[js.Any], currentVersion = currentVersion.asInstanceOf[js.Any], dataEditingNotSupported = dataEditingNotSupported.asInstanceOf[js.Any], dateFieldsTimeReference = dateFieldsTimeReference.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], maxRecordCount = maxRecordCount.asInstanceOf[js.Any], schemaEditingNotSupported = schemaEditingNotSupported.asInstanceOf[js.Any], searchMaxRecordCount = searchMaxRecordCount.asInstanceOf[js.Any], serviceCapabilities = serviceCapabilities.asInstanceOf[js.Any], serviceItemId = serviceItemId.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], supportSearch = supportSearch.asInstanceOf[js.Any], supportedQueryFormats = supportedQueryFormats.asInstanceOf[js.Any], supportsDocuments = supportsDocuments.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDefinition] (val x: Self) extends AnyVal {
    
    inline def setAllowGeometryUpdates(value: Boolean): Self = StObject.set(x, "allowGeometryUpdates", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setCopyrightText(value: String): Self = StObject.set(x, "copyrightText", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setDataEditingNotSupported(value: Boolean): Self = StObject.set(x, "dataEditingNotSupported", value.asInstanceOf[js.Any])
    
    inline def setDateFieldsTimeReference(value: ServiceDefinitionDateFieldsTimeReference): Self = StObject.set(x, "dateFieldsTimeReference", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordCount(value: Double): Self = StObject.set(x, "maxRecordCount", value.asInstanceOf[js.Any])
    
    inline def setSchemaEditingNotSupported(value: Boolean): Self = StObject.set(x, "schemaEditingNotSupported", value.asInstanceOf[js.Any])
    
    inline def setSearchMaxRecordCount(value: Double): Self = StObject.set(x, "searchMaxRecordCount", value.asInstanceOf[js.Any])
    
    inline def setServiceCapabilities(value: ServiceDefinitionServiceCapabilities): Self = StObject.set(x, "serviceCapabilities", value.asInstanceOf[js.Any])
    
    inline def setServiceItemId(value: String): Self = StObject.set(x, "serviceItemId", value.asInstanceOf[js.Any])
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSupportSearch(value: Boolean): Self = StObject.set(x, "supportSearch", value.asInstanceOf[js.Any])
    
    inline def setSupportedQueryFormats(value: js.Array[String]): Self = StObject.set(x, "supportedQueryFormats", value.asInstanceOf[js.Any])
    
    inline def setSupportedQueryFormatsVarargs(value: String*): Self = StObject.set(x, "supportedQueryFormats", js.Array(value*))
    
    inline def setSupportsDocuments(value: Boolean): Self = StObject.set(x, "supportsDocuments", value.asInstanceOf[js.Any])
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
