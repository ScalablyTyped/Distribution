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

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.FeatureLayerBaseProperties because var conflicts: fullExtent, title. Inlined copyright, definitionExpression, displayField, elevationInfo, floorInfo, gdbVersion, geometryType, hasM, hasZ, historicMoment, layerId, objectIdField, returnM, returnZ, sourceJSON, spatialReference, url */ trait SubtypeGroupLayerProperties
  extends StObject
     with LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with TemporalLayerProperties
     with BlendLayerProperties
     with CustomParametersMixinProperties {
  
  /**
  		 * Copyright information for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#copyright)
  		 */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
  		 * The SQL where clause used to filter features on the client.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#definitionExpression)
  		 */
  var definitionExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The name of the layer's primary display field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#displayField)
  		 */
  var displayField: js.UndefOr[String] = js.undefined
  
  /**
  		 * Determines if the layer is editable.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#editingEnabled)
  		 */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies how features are placed on the vertical axis (z).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
  		 */
  var elevationInfo: js.UndefOr[FeatureLayerBaseElevationInfo] = js.undefined
  
  /**
  		 * An array of fields in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#fields)
  		 */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  
  /**
  		 * When a feature layer is configured as floor-aware, it has a floorInfo property defined.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#floorInfo)
  		 */
  var floorInfo: js.UndefOr[LayerFloorInfoProperties] = js.undefined
  
  /**
  		 * The version of the geodatabase of the feature service data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#gdbVersion)
  		 */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
  		 * The geometry type of features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#geometryType)
  		 */
  var geometryType: js.UndefOr[point | multipoint | polyline | polygon | multipatch | mesh] = js.undefined
  
  /**
  		 * Indicates whether the client-side features in the layer have `M` (measurement) values.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#hasM)
  		 */
  var hasM: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether the client-side features in the layer have `Z` (elevation) values.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#hasZ)
  		 */
  var hasZ: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The historic moment to query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#historicMoment)
  		 */
  var historicMoment: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The layer ID, or layer index, of a Feature Service layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#layerId)
  		 */
  var layerId: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fields) containing a unique value or identifier for each feature in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#objectIdField)
  		 */
  var objectIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * An array of field names from the service to include with each feature.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#outFields)
  		 */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * When `true`, indicates that M values will be returned.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#returnM)
  		 */
  var returnM: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When `true`, indicates that z-values will always be returned.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#returnZ)
  		 */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The [feature service's metadata JSON](https://developers.arcgis.com/rest/services-reference/layer-feature-service-.htm) exposed by the ArcGIS REST API.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#sourceJSON)
  		 */
  var sourceJSON: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The spatial reference of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [SubtypeSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html) objects that allow you to alter the properties of one or more sublayers of the SubtypeGroupLayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#sublayers)
  		 */
  var sublayers: js.UndefOr[CollectionProperties[SubtypeSublayerProperties]] = js.undefined
  
  /**
  		 * The name of the SubtypeGroupLayer's subtype field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#subtypeField)
  		 */
  var subtypeField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The absolute URL of the REST endpoint of the layer, non-spatial table or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
}
object SubtypeGroupLayerProperties {
  
  inline def apply(): SubtypeGroupLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtypeGroupLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeGroupLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    inline def setEditingEnabled(value: Boolean): Self = StObject.set(x, "editingEnabled", value.asInstanceOf[js.Any])
    
    inline def setEditingEnabledUndefined: Self = StObject.set(x, "editingEnabled", js.undefined)
    
    inline def setElevationInfo(value: FeatureLayerBaseElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    inline def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFloorInfo(value: LayerFloorInfoProperties): Self = StObject.set(x, "floorInfo", value.asInstanceOf[js.Any])
    
    inline def setFloorInfoUndefined: Self = StObject.set(x, "floorInfo", js.undefined)
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setGeometryType(value: point | multipoint | polyline | polygon | multipatch | mesh): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setHistoricMoment(value: DateProperties): Self = StObject.set(x, "historicMoment", value.asInstanceOf[js.Any])
    
    inline def setHistoricMomentUndefined: Self = StObject.set(x, "historicMoment", js.undefined)
    
    inline def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    inline def setReturnMUndefined: Self = StObject.set(x, "returnM", js.undefined)
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setSublayers(value: CollectionProperties[SubtypeSublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    inline def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    inline def setSublayersVarargs(value: SubtypeSublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value*))
    
    inline def setSubtypeField(value: String): Self = StObject.set(x, "subtypeField", value.asInstanceOf[js.Any])
    
    inline def setSubtypeFieldUndefined: Self = StObject.set(x, "subtypeField", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
