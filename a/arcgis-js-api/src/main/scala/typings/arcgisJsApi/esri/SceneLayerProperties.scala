package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerProperties
  extends StObject
     with LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with APIKeyMixinProperties {
  
  /**
    * The SQL where clause used to filter features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[SceneLayerElevationInfo] = js.undefined
  
  /**
    * List of ObjectIDs not being displayed in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#excludeObjectIds)
    */
  var excludeObjectIds: js.UndefOr[CollectionProperties[Double]] = js.undefined
  
  /**
    * Configures the method for decluttering overlapping features in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#featureReduction)
    */
  var featureReduction: js.UndefOr[FeatureReductionSelectionProperties] = js.undefined
  
  /**
    * A collection of polygons [geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneFilter.html#geometries) which will mask out different parts of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#filter)
    */
  var filter: js.UndefOr[SceneFilterProperties] = js.undefined
  
  /**
    * When a scene layer is configured as floor-aware, it has a floorInfo property defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#floorInfo)
    */
  var floorInfo: js.UndefOr[LayerFloorInfoProperties] = js.undefined
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType)
    */
  var geometryType: js.UndefOr[point | mesh] = js.undefined
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  
  /**
    * Indicates whether to display labels for this layer.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelsVisible)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the field containing each graphic's Object ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#objectIdField)
    */
  var objectIdField: js.UndefOr[String] = js.undefined
  
  /**
    * An array of field names from the service to include with each feature.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The popup template for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.undefined
}
object SceneLayerProperties {
  
  inline def apply(): SceneLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneLayerProperties]
  }
  
  extension [Self <: SceneLayerProperties](x: Self) {
    
    inline def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setElevationInfo(value: SceneLayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    inline def setExcludeObjectIds(value: CollectionProperties[Double]): Self = StObject.set(x, "excludeObjectIds", value.asInstanceOf[js.Any])
    
    inline def setExcludeObjectIdsUndefined: Self = StObject.set(x, "excludeObjectIds", js.undefined)
    
    inline def setExcludeObjectIdsVarargs(value: Double*): Self = StObject.set(x, "excludeObjectIds", js.Array(value*))
    
    inline def setFeatureReduction(value: FeatureReductionSelectionProperties): Self = StObject.set(x, "featureReduction", value.asInstanceOf[js.Any])
    
    inline def setFeatureReductionUndefined: Self = StObject.set(x, "featureReduction", js.undefined)
    
    inline def setFilter(value: SceneFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFloorInfo(value: LayerFloorInfoProperties): Self = StObject.set(x, "floorInfo", value.asInstanceOf[js.Any])
    
    inline def setFloorInfoUndefined: Self = StObject.set(x, "floorInfo", js.undefined)
    
    inline def setGeometryType(value: point | mesh): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    inline def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfoUndefined: Self = StObject.set(x, "labelingInfo", js.undefined)
    
    inline def setLabelingInfoVarargs(value: LabelClassProperties*): Self = StObject.set(x, "labelingInfo", js.Array(value*))
    
    inline def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    inline def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    inline def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    inline def setRenderer(value: RendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setScreenSizePerspectiveEnabled(value: Boolean): Self = StObject.set(x, "screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setScreenSizePerspectiveEnabledUndefined: Self = StObject.set(x, "screenSizePerspectiveEnabled", js.undefined)
  }
}
