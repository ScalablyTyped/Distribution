package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.entity
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerProperties
  extends StObject
     with LayerProperties
     with BlendLayerProperties
     with FeatureReductionLayerProperties {
  
  /**
  		 * The SQL where clause used to filter features on the client.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#definitionExpression)
  		 */
  var definitionExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The name of the sublayer's primary display field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#displayField)
  		 */
  var displayField: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies how features are placed on the vertical axis (z).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#elevationInfo)
  		 */
  var elevationInfo: js.UndefOr[KnowledgeGraphSublayerElevationInfo] = js.undefined
  
  /**
  		 * The name of the geometry field for the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#geometryFieldName)
  		 */
  var geometryFieldName: js.UndefOr[String] = js.undefined
  
  /**
  		 * The geometry type of features in the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#geometryType)
  		 */
  var geometryType: js.UndefOr[point | multipoint | polyline | polygon] = js.undefined
  
  /**
  		 * Specifies whether the sublayer represents an [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) or [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#graphType)
  		 */
  var graphType: js.UndefOr[entity | typings.arcgisJsApi.arcgisJsApiStrings.relationship] = js.undefined
  
  /**
  		 * Indicates whether the features in the sublayer have `M` (measurement) values.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#hasM)
  		 */
  var hasM: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether the features in the layer have `Z` (elevation) values.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#hasZ)
  		 */
  var hasZ: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The label definition for this sublayer, specified as an array of [label classes](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#labelingInfo)
  		 */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  
  /**
  		 * Indicates whether to display labels for this sublayer.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#labelsVisible)
  		 */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The name of an `oid` containing a unique value or identifier for each feature in the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#objectIdField)
  		 */
  var objectIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * Outlines the [type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html) definition for the named type represented by the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#objectType)
  		 */
  var objectType: js.UndefOr[GraphObjectTypeProperties] = js.undefined
  
  /**
  		 * The [KnowledgeGraphLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html) of which this is a sublayer for a specific entity or relationship type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#parentCompositeLayer)
  		 */
  var parentCompositeLayer: js.UndefOr[KnowledgeGraphLayerProperties] = js.undefined
  
  /**
  		 * The popup template for the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#popupTemplate)
  		 */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
  		 * The renderer assigned to the sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#renderer)
  		 */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
}
object KnowledgeGraphSublayerProperties {
  
  inline def apply(): KnowledgeGraphSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnowledgeGraphSublayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerProperties] (val x: Self) extends AnyVal {
    
    inline def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    inline def setElevationInfo(value: KnowledgeGraphSublayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    inline def setGeometryFieldName(value: String): Self = StObject.set(x, "geometryFieldName", value.asInstanceOf[js.Any])
    
    inline def setGeometryFieldNameUndefined: Self = StObject.set(x, "geometryFieldName", js.undefined)
    
    inline def setGeometryType(value: point | multipoint | polyline | polygon): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    inline def setGraphType(value: entity | typings.arcgisJsApi.arcgisJsApiStrings.relationship): Self = StObject.set(x, "graphType", value.asInstanceOf[js.Any])
    
    inline def setGraphTypeUndefined: Self = StObject.set(x, "graphType", js.undefined)
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelingInfoUndefined: Self = StObject.set(x, "labelingInfo", js.undefined)
    
    inline def setLabelingInfoVarargs(value: LabelClassProperties*): Self = StObject.set(x, "labelingInfo", js.Array(value*))
    
    inline def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    inline def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    inline def setObjectType(value: GraphObjectTypeProperties): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setParentCompositeLayer(value: KnowledgeGraphLayerProperties): Self = StObject.set(x, "parentCompositeLayer", value.asInstanceOf[js.Any])
    
    inline def setParentCompositeLayerUndefined: Self = StObject.set(x, "parentCompositeLayer", js.undefined)
    
    inline def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    inline def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    inline def setRenderer(value: RendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
