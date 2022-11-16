package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.esri.EditFieldsInfo
import typings.arcgisJsApi.esri.FeatureLayerBaseElevationInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FeatureLayerBase")
@js.native
open class FeatureLayerBase ()
  extends StObject
     with typings.arcgisJsApi.esri.FeatureLayerBase {
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#copyright)
    */
  /* CompleteClass */
  var copyright: String = js.native
  
  /**
    * The SQL where clause used to filter features on the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#definitionExpression)
    */
  /* CompleteClass */
  var definitionExpression: String = js.native
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#displayField)
    */
  /* CompleteClass */
  var displayField: String = js.native
  
  /**
    * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editFieldsInfo)
    */
  /* CompleteClass */
  override val editFieldsInfo: EditFieldsInfo = js.native
  
  /**
    * The editor tracking fields, which record who adds or edits the data through the feature service and when edits are made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#editingInfo)
    */
  /* CompleteClass */
  override val editingInfo: EditFieldsInfo = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
    */
  /* CompleteClass */
  var elevationInfo: FeatureLayerBaseElevationInfo = js.native
  
  /**
    * When a feature layer is configured as floor-aware, it has a floorInfo property defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#floorInfo)
    */
  /* CompleteClass */
  var floorInfo: typings.arcgisJsApi.esri.LayerFloorInfo = js.native
  
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fullExtent)
    */
  /* CompleteClass */
  var fullExtent: typings.arcgisJsApi.esri.Extent = js.native
  
  /**
    * The version of the geodatabase of the feature service data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#gdbVersion)
    */
  /* CompleteClass */
  var gdbVersion: String = js.native
  
  /**
    * Provides information on the system maintained area and length fields along with their respective units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#geometryFieldsInfo)
    */
  /* CompleteClass */
  override val geometryFieldsInfo: typings.arcgisJsApi.esri.GeometryFieldsInfo = js.native
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#geometryType)
    */
  /* CompleteClass */
  var geometryType: point | multipoint | polyline | polygon | multipatch | mesh = js.native
  
  /**
    * Indicates whether the client-side features in the layer have `M` (measurement) values.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#hasM)
    */
  /* CompleteClass */
  var hasM: Boolean = js.native
  
  /**
    * Indicates whether the client-side features in the layer have `Z` (elevation) values.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#hasZ)
    */
  /* CompleteClass */
  var hasZ: Boolean = js.native
  
  /**
    * The historic moment to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#historicMoment)
    */
  /* CompleteClass */
  var historicMoment: js.Date = js.native
  
  /**
    * Returns `true` if the layer is loaded from a non-spatial table in a service.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#isTable)
    */
  /* CompleteClass */
  override val isTable: Boolean = js.native
  
  /**
    * The layer ID, or layer index, of a Feature Service layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#layerId)
    */
  /* CompleteClass */
  var layerId: Double = js.native
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#objectIdField)
    */
  /* CompleteClass */
  var objectIdField: String = js.native
  
  /**
    * When `true`, indicates that M values will be returned.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#returnM)
    */
  /* CompleteClass */
  var returnM: Boolean = js.native
  
  /**
    * When `true`, indicates that z-values will always be returned.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#returnZ)
    */
  /* CompleteClass */
  var returnZ: Boolean = js.native
  
  /**
    * The service definition expression limits the features available for display and query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#serviceDefinitionExpression)
    */
  /* CompleteClass */
  override val serviceDefinitionExpression: String = js.native
  
  /**
    * The [feature service's metadata JSON](https://developers.arcgis.com/rest/services-reference/layer-feature-service-.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#sourceJSON)
    */
  /* CompleteClass */
  var sourceJSON: Any = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#spatialReference)
    */
  /* CompleteClass */
  var spatialReference: typings.arcgisJsApi.esri.SpatialReference = js.native
  
  /**
    * The absolute URL of the REST endpoint of the layer, non-spatial table or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#url)
    */
  /* CompleteClass */
  var url: String = js.native
  
  /**
    * The version of ArcGIS Server in which the layer is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#version)
    */
  /* CompleteClass */
  override val version: Double = js.native
}
