package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLayerProperties
  extends StObject
     with LayerProperties
     with ScaleRangeLayerProperties
     with TemporalLayerProperties
     with BlendLayerProperties {
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The SQL where clause used to filter features based on their attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#displayField)
    */
  var displayField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how graphics are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[StreamLayerElevationInfo] = js.undefined
  
  /**
    * Configures the method for reducing the number of point features in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#featureReduction)
    */
  var featureReduction: js.UndefOr[FeatureReductionSelectionProperties] = js.undefined
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  
  /**
    * An [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object used to filter features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryDefinition)
    */
  var geometryDefinition: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryType)
    */
  var geometryType: js.UndefOr[point | polygon | polyline | multipoint] = js.undefined
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  
  /**
    * Indicates whether to display labels for this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#labelsVisible)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of attempts to reconnect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maxReconnectionAttempts)
    */
  var maxReconnectionAttempts: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum time to wait in seconds between attempts to reconnect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maxReconnectionInterval)
    */
  var maxReconnectionInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#fields) containing a unique value or identifier for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#objectIdField)
    */
  var objectIdField: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The popup template for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
    * Options for purging stale features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var purgeOptions: js.UndefOr[StreamLayerPurgeOptions] = js.undefined
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The [stream service's metadata JSON](https://developers.arcgis.com/rest/services-reference/stream-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The URL of the stream service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of a websocket connection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#webSocketUrl)
    */
  var webSocketUrl: js.UndefOr[String] = js.undefined
}
object StreamLayerProperties {
  
  @scala.inline
  def apply(): StreamLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLayerProperties]
  }
  
  @scala.inline
  implicit class StreamLayerPropertiesMutableBuilder[Self <: StreamLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    @scala.inline
    def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    @scala.inline
    def setElevationInfo(value: StreamLayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    @scala.inline
    def setFeatureReduction(value: FeatureReductionSelectionProperties): Self = StObject.set(x, "featureReduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureReductionUndefined: Self = StObject.set(x, "featureReduction", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setGeometryDefinition(value: ExtentProperties): Self = StObject.set(x, "geometryDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryDefinitionUndefined: Self = StObject.set(x, "geometryDefinition", js.undefined)
    
    @scala.inline
    def setGeometryType(value: point | polygon | polyline | multipoint): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    @scala.inline
    def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingInfoUndefined: Self = StObject.set(x, "labelingInfo", js.undefined)
    
    @scala.inline
    def setLabelingInfoVarargs(value: LabelClassProperties*): Self = StObject.set(x, "labelingInfo", js.Array(value :_*))
    
    @scala.inline
    def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    @scala.inline
    def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    @scala.inline
    def setMaxReconnectionAttempts(value: Double): Self = StObject.set(x, "maxReconnectionAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReconnectionAttemptsUndefined: Self = StObject.set(x, "maxReconnectionAttempts", js.undefined)
    
    @scala.inline
    def setMaxReconnectionInterval(value: Double): Self = StObject.set(x, "maxReconnectionInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReconnectionIntervalUndefined: Self = StObject.set(x, "maxReconnectionInterval", js.undefined)
    
    @scala.inline
    def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    @scala.inline
    def setPurgeOptions(value: StreamLayerPurgeOptions): Self = StObject.set(x, "purgeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeOptionsUndefined: Self = StObject.set(x, "purgeOptions", js.undefined)
    
    @scala.inline
    def setRenderer(value: RendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setScreenSizePerspectiveEnabled(value: Boolean): Self = StObject.set(x, "screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSizePerspectiveEnabledUndefined: Self = StObject.set(x, "screenSizePerspectiveEnabled", js.undefined)
    
    @scala.inline
    def setSourceJSON(value: js.Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWebSocketUrl(value: String): Self = StObject.set(x, "webSocketUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebSocketUrlUndefined: Self = StObject.set(x, "webSocketUrl", js.undefined)
  }
}
