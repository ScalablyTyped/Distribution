package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typings.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typings.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`subtype-group`
import typings.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.color
import typings.arcgisJsApi.arcgisJsApiStrings.darken
import typings.arcgisJsApi.arcgisJsApiStrings.difference
import typings.arcgisJsApi.arcgisJsApiStrings.exclusion
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.hue
import typings.arcgisJsApi.arcgisJsApiStrings.invert
import typings.arcgisJsApi.arcgisJsApiStrings.lighten
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.luminosity
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.minus
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.overlay
import typings.arcgisJsApi.arcgisJsApiStrings.plus
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.reflect
import typings.arcgisJsApi.arcgisJsApiStrings.saturation
import typings.arcgisJsApi.arcgisJsApiStrings.screen
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.xor
import typings.arcgisJsApi.esri.BasemapProperties
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.DateProperties
import typings.arcgisJsApi.esri.ExtentProperties
import typings.arcgisJsApi.esri.FeatureLayerBaseElevationInfo
import typings.arcgisJsApi.esri.FieldProperties
import typings.arcgisJsApi.esri.GroundProperties
import typings.arcgisJsApi.esri.LayerFloorInfoProperties
import typings.arcgisJsApi.esri.MapProperties
import typings.arcgisJsApi.esri.PortalItemProperties
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import typings.arcgisJsApi.esri.TimeExtentProperties
import typings.arcgisJsApi.esri.TimeInfoProperties
import typings.arcgisJsApi.esri.TimeIntervalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SubtypeGroupLayerProperties & {  type :'subtype-group'} */
trait SubtypeGroupLayerProperti extends StObject {
  
  /**
  		 * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
  		 *
  		 * @default normal
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
  		 */
  var blendMode: js.UndefOr[
    average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
  ] = js.undefined
  
  /**
  		 * Copyright information for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#copyright)
  		 */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
  		 * A list of custom parameters appended to the URL of all resources fetched by the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-CustomParametersMixin.html#customParameters)
  		 */
  var customParameters: js.UndefOr[Any] = js.undefined
  
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
  		 * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
  		 */
  var effect: js.UndefOr[js.Array[Any] | String] = js.undefined
  
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
  		 * The full extent of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fullExtent)
  		 */
  /**
  		 * The full extent of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fullExtent)
  		 */
  var fullExtent: js.UndefOr[ExtentProperties] = js.undefined
  
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
  		 * The unique ID assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * The layer ID, or layer index, of a Feature Service layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#layerId)
  		 */
  var layerId: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  		 *
  		 * @default "show"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#listMode)
  		 */
  var listMode: js.UndefOr[show | hide | `hide-children`] = js.undefined
  
  /**
  		 * The maximum scale (most zoomed in) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
  		 */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum scale (most zoomed out) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
  		 */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#fields) containing a unique value or identifier for each feature in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#objectIdField)
  		 */
  var objectIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The opacity of the layer.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity)
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An array of field names from the service to include with each feature.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#outFields)
  		 */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The parent to which the layer belongs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#parent)
  		 */
  var parent: js.UndefOr[MapProperties | BasemapProperties | GroundProperties | GroupLayerPropertiestypeg] = js.undefined
  
  /**
  		 * The portal item from which the layer is loaded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
  		 */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  
  /**
  		 * Refresh interval of the layer in minutes.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
  		 */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  
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
  var sublayers: js.UndefOr[CollectionProperties[typings.arcgisJsApi.esri.SubtypeSublayerProperties]] = js.undefined
  
  /**
  		 * The name of the SubtypeGroupLayer's subtype field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#subtypeField)
  		 */
  var subtypeField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The layer's time extent.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
  		 */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
  		 * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
  		 */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.undefined
  
  /**
  		 * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
  		 */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.undefined
  
  /**
  		 * The title of the layer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
  		 */
  /**
  		 * The title of the layer used to identify it in places such as the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) and [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widgets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: `subtype-group`
  
  /**
  		 * The absolute URL of the REST endpoint of the layer, non-spatial table or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
  
  /**
  		 * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
  		 */
  var useViewTime: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object SubtypeGroupLayerProperti {
  
  inline def apply(): SubtypeGroupLayerProperti = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("subtype-group")
    __obj.asInstanceOf[SubtypeGroupLayerProperti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeGroupLayerProperti] (val x: Self) extends AnyVal {
    
    inline def setBlendMode(
      value: average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
    ): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    inline def setEditingEnabled(value: Boolean): Self = StObject.set(x, "editingEnabled", value.asInstanceOf[js.Any])
    
    inline def setEditingEnabledUndefined: Self = StObject.set(x, "editingEnabled", js.undefined)
    
    inline def setEffect(value: js.Array[Any] | String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setEffectVarargs(value: Any*): Self = StObject.set(x, "effect", js.Array(value*))
    
    inline def setElevationInfo(value: FeatureLayerBaseElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    inline def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFloorInfo(value: LayerFloorInfoProperties): Self = StObject.set(x, "floorInfo", value.asInstanceOf[js.Any])
    
    inline def setFloorInfoUndefined: Self = StObject.set(x, "floorInfo", js.undefined)
    
    inline def setFullExtent(value: ExtentProperties): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    inline def setFullExtentUndefined: Self = StObject.set(x, "fullExtent", js.undefined)
    
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
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setListMode(value: show | hide | `hide-children`): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    inline def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setParent(value: MapProperties | BasemapProperties | GroundProperties | GroupLayerPropertiestypeg): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    inline def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
    
    inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    inline def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    inline def setReturnMUndefined: Self = StObject.set(x, "returnM", js.undefined)
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setSublayers(value: CollectionProperties[typings.arcgisJsApi.esri.SubtypeSublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    inline def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    inline def setSublayersVarargs(value: typings.arcgisJsApi.esri.SubtypeSublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value*))
    
    inline def setSubtypeField(value: String): Self = StObject.set(x, "subtypeField", value.asInstanceOf[js.Any])
    
    inline def setSubtypeFieldUndefined: Self = StObject.set(x, "subtypeField", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setTimeInfo(value: TimeInfoProperties): Self = StObject.set(x, "timeInfo", value.asInstanceOf[js.Any])
    
    inline def setTimeInfoUndefined: Self = StObject.set(x, "timeInfo", js.undefined)
    
    inline def setTimeOffset(value: TimeIntervalProperties): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: `subtype-group`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseViewTime(value: Boolean): Self = StObject.set(x, "useViewTime", value.asInstanceOf[js.Any])
    
    inline def setUseViewTimeUndefined: Self = StObject.set(x, "useViewTime", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
