package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`ogc-feature`
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.refresh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OGCFeatureLayer
  extends StObject
     with Layer
     with APIKeyMixin
     with BlendLayer
     with CustomParametersMixin
     with OrderedLayer
     with PortalLayer
     with RefreshableLayer
     with ScaleRangeLayer
     with FeatureEffectLayer {
  
  /**
    * The unique identifier of the collection on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#collectionId)
    */
  var collectionId: String = js.native
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * Creates a popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#createPopupTemplate)
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  
  /**
    * Description of the features in the collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#description)
    */
  val description: String = js.native
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#displayField)
    */
  var displayField: String = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#elevationInfo)
    */
  var elevationInfo: OGCFeatureLayerElevationInfo = js.native
  
  /**
    * Configures the method for reducing the number of point features in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#featureReduction)
    */
  var featureReduction: FeatureReductionCluster | FeatureReductionSelection = js.native
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * The geometry type of features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#geometryType)
    */
  var geometryType: point | polygon | polyline | multipoint = js.native
  
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#getField)
    */
  def getField(fieldName: String): Field = js.native
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * Indicates whether to display labels for this layer.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * The OGCFeatureLayer requires that each feature be uniquely identified with an object id.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#objectIdField)
    */
  var objectIdField: String = js.native
  
  @JSName("on")
  def on_refresh(name: refresh, eventHandler: OGCFeatureLayerRefreshEventHandler): IHandle = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * The popup template for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  
  /**
    * The spatial reference the source data is stored in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  
  @JSName("type")
  val type_OGCFeatureLayer: `ogc-feature` = js.native
  
  /**
    * The URL to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#url)
    */
  var url: String = js.native
}
