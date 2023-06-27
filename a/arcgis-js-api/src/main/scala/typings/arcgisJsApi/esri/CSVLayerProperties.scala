package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVLayerProperties
  extends StObject
     with LayerProperties
     with OrderedLayerProperties
     with ScaleRangeLayerProperties
     with TemporalLayerProperties
     with BlendLayerProperties
     with FeatureEffectLayerProperties
     with FeatureReductionLayerProperties
     with PortalLayerProperties {
  
  /**
  		 * Copyright information for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#copyright)
  		 */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
  		 * A list of custom parameters appended to the URL of all resources fetched by the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#customParameters)
  		 */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The SQL where clause used to filter features on the client.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#definitionExpression)
  		 */
  var definitionExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The column delimiter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#delimiter)
  		 */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /**
  		 * The name of the layer's primary display field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#displayField)
  		 */
  var displayField: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies how features are placed on the vertical axis (z).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
  		 */
  var elevationInfo: js.UndefOr[CSVLayerElevationInfo] = js.undefined
  
  /**
  		 * An array of fields in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#fields)
  		 */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  
  /**
  		 * The geometry type of features in the CSVLayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#geometryType)
  		 */
  var geometryType: js.UndefOr[point] = js.undefined
  
  /**
  		 * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#labelingInfo)
  		 */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  
  /**
  		 * Indicates whether to display labels for this layer.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#labelsVisible)
  		 */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The latitude field name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#latitudeField)
  		 */
  var latitudeField: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether the layer will be included in the legend.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#legendEnabled)
  		 */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The longitude field name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#longitudeField)
  		 */
  var longitudeField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#fields) containing a unique value or identifier for each feature in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#objectIdField)
  		 */
  var objectIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * An array of field names to include in the CSVLayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#outFields)
  		 */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * Indicates whether to display popups when features in the layer are clicked.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#popupEnabled)
  		 */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The popup template for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#popupTemplate)
  		 */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
  		 * Refresh interval of the layer in minutes.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#refreshInterval)
  		 */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The renderer assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#renderer)
  		 */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  
  /**
  		 * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#screenSizePerspectiveEnabled)
  		 */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The spatial reference of the layer.
  		 *
  		 * @default SpatialReference.WGS84
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * The URL of the CSV file.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
}
object CSVLayerProperties {
  
  inline def apply(): CSVLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSVLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    inline def setElevationInfo(value: CSVLayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    inline def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGeometryType(value: point): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    inline def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfoUndefined: Self = StObject.set(x, "labelingInfo", js.undefined)
    
    inline def setLabelingInfoVarargs(value: LabelClassProperties*): Self = StObject.set(x, "labelingInfo", js.Array(value*))
    
    inline def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    inline def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    inline def setLatitudeField(value: String): Self = StObject.set(x, "latitudeField", value.asInstanceOf[js.Any])
    
    inline def setLatitudeFieldUndefined: Self = StObject.set(x, "latitudeField", js.undefined)
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setLongitudeField(value: String): Self = StObject.set(x, "longitudeField", value.asInstanceOf[js.Any])
    
    inline def setLongitudeFieldUndefined: Self = StObject.set(x, "longitudeField", js.undefined)
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    inline def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    inline def setRenderer(value: RendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setScreenSizePerspectiveEnabled(value: Boolean): Self = StObject.set(x, "screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setScreenSizePerspectiveEnabledUndefined: Self = StObject.set(x, "screenSizePerspectiveEnabled", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
