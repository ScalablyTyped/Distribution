package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerBase extends StObject {
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#copyright)
    */
  var copyright: String
  
  /**
    * The SQL where clause used to filter features on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#definitionExpression)
    */
  var definitionExpression: String
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#displayField)
    */
  var displayField: String
  
  /**
    * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editFieldsInfo)
    */
  val editFieldsInfo: EditFieldsInfo
  
  /**
    * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editingInfo)
    */
  val editingInfo: EditFieldsInfo
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
    */
  var elevationInfo: FeatureLayerBaseElevationInfo
  
  /**
    * When a feature layer is configured as floor-aware, it has a floorInfo property defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#floorInfo)
    */
  var floorInfo: LayerFloorInfo
  
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fullExtent)
    */
  var fullExtent: Extent
  
  /**
    * The version of the geodatabase of the feature service data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#gdbVersion)
    */
  var gdbVersion: String
  
  /**
    * Provides information on the system maintained area and length fields along with their respective units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#geometryFieldsInfo)
    */
  val geometryFieldsInfo: GeometryFieldsInfo
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#geometryType)
    */
  var geometryType: point | multipoint | polyline | polygon | multipatch | mesh
  
  /**
    * Indicates whether the client-side features in the layer have `M` (measurement) values.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#hasM)
    */
  var hasM: Boolean
  
  /**
    * Indicates whether the client-side features in the layer have `Z` (elevation) values.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#hasZ)
    */
  var hasZ: Boolean
  
  /**
    * The historic moment to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#historicMoment)
    */
  var historicMoment: js.Date
  
  /**
    * Returns `true` if the layer is loaded from a non-spatial table in a service.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#isTable)
    */
  val isTable: Boolean
  
  /**
    * The layer ID, or layer index, of a Feature Service layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#layerId)
    */
  var layerId: Double
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#objectIdField)
    */
  var objectIdField: String
  
  /**
    * When `true`, indicates that M values will be returned.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#returnM)
    */
  var returnM: Boolean
  
  /**
    * When `true`, indicates that z-values will always be returned.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#returnZ)
    */
  var returnZ: Boolean
  
  /**
    * The service definition expression limits the features available for display and query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#serviceDefinitionExpression)
    */
  val serviceDefinitionExpression: String
  
  /**
    * The [feature service's metadata JSON](https://developers.arcgis.com/rest/services-reference/layer-feature-service-.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#sourceJSON)
    */
  var sourceJSON: Any
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#spatialReference)
    */
  var spatialReference: SpatialReference
  
  /**
    * The absolute URL of the REST endpoint of the layer, non-spatial table or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#url)
    */
  var url: String
  
  /**
    * The version of ArcGIS Server in which the layer is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#version)
    */
  val version: Double
}
object FeatureLayerBase {
  
  inline def apply(
    copyright: String,
    definitionExpression: String,
    displayField: String,
    editFieldsInfo: EditFieldsInfo,
    editingInfo: EditFieldsInfo,
    elevationInfo: FeatureLayerBaseElevationInfo,
    floorInfo: LayerFloorInfo,
    fullExtent: Extent,
    gdbVersion: String,
    geometryFieldsInfo: GeometryFieldsInfo,
    geometryType: point | multipoint | polyline | polygon | multipatch | mesh,
    hasM: Boolean,
    hasZ: Boolean,
    historicMoment: js.Date,
    isTable: Boolean,
    layerId: Double,
    objectIdField: String,
    returnM: Boolean,
    returnZ: Boolean,
    serviceDefinitionExpression: String,
    sourceJSON: Any,
    spatialReference: SpatialReference,
    url: String,
    version: Double
  ): FeatureLayerBase = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], definitionExpression = definitionExpression.asInstanceOf[js.Any], displayField = displayField.asInstanceOf[js.Any], editFieldsInfo = editFieldsInfo.asInstanceOf[js.Any], editingInfo = editingInfo.asInstanceOf[js.Any], elevationInfo = elevationInfo.asInstanceOf[js.Any], floorInfo = floorInfo.asInstanceOf[js.Any], fullExtent = fullExtent.asInstanceOf[js.Any], gdbVersion = gdbVersion.asInstanceOf[js.Any], geometryFieldsInfo = geometryFieldsInfo.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasM = hasM.asInstanceOf[js.Any], hasZ = hasZ.asInstanceOf[js.Any], historicMoment = historicMoment.asInstanceOf[js.Any], isTable = isTable.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], objectIdField = objectIdField.asInstanceOf[js.Any], returnM = returnM.asInstanceOf[js.Any], returnZ = returnZ.asInstanceOf[js.Any], serviceDefinitionExpression = serviceDefinitionExpression.asInstanceOf[js.Any], sourceJSON = sourceJSON.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerBase]
  }
  
  extension [Self <: FeatureLayerBase](x: Self) {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setEditFieldsInfo(value: EditFieldsInfo): Self = StObject.set(x, "editFieldsInfo", value.asInstanceOf[js.Any])
    
    inline def setEditingInfo(value: EditFieldsInfo): Self = StObject.set(x, "editingInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfo(value: FeatureLayerBaseElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setFloorInfo(value: LayerFloorInfo): Self = StObject.set(x, "floorInfo", value.asInstanceOf[js.Any])
    
    inline def setFullExtent(value: Extent): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGeometryFieldsInfo(value: GeometryFieldsInfo): Self = StObject.set(x, "geometryFieldsInfo", value.asInstanceOf[js.Any])
    
    inline def setGeometryType(value: point | multipoint | polyline | polygon | multipatch | mesh): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHistoricMoment(value: js.Date): Self = StObject.set(x, "historicMoment", value.asInstanceOf[js.Any])
    
    inline def setIsTable(value: Boolean): Self = StObject.set(x, "isTable", value.asInstanceOf[js.Any])
    
    inline def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setServiceDefinitionExpression(value: String): Self = StObject.set(x, "serviceDefinitionExpression", value.asInstanceOf[js.Any])
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
