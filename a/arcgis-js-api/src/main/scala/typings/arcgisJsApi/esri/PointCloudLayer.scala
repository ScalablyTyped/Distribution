package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudLayer
  extends Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer {
  /**
    * Specifies how points are placed on the vertical axis (z). This property only affects [PointCloudLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) when using the `absolute-height` mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#elevationInfo)
    */
  var elevationInfo: PointCloudLayerElevationInfo = js.native
  /**
    * An array of fields accessible in the layer. The most common fields for PointCloudLayers are described more in detail in the following table: Name | Comment -- | -- ELEVATION | Check the [LAS Specification](https://www.opengeospatial.org/standards/LAS) for details. INTENSITY  | Check the [LAS Specification](https://www.opengeospatial.org/standards/LAS) for details. CLASS_CODE | Get the list with the class label with [PointCloudLayer.queryCachedStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#queryCachedStatistics). RGB | The individual RGB channels (uint8) are packed into a single uint32 value. See example for decode. RETURNS | Bits 0-5 for Return Number and Number of Returns. See example for decode. FLAGS | Check the [LAS Specification](https://www.opengeospatial.org/standards/LAS) for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * A convenient property that can be used to make case-insensitive lookups for a field by name. It can also provide a list of the [date fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields) in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  /**
    * An array of [pointCloudFilters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html) used to filter points. Only the points that satisfy all the filters are displayed in the view. There are two types of filters that can be set: [PointCloudValueFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html) filters points based on classification values and [PointCloudReturnFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html) filters points based on return values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#filters)
    */
  var filters: js.Array[PointCloudValueFilter | PointCloudReturnFilter] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: Boolean = js.native
  /**
    * An array of field names from the service to include with each feature. To fetch the values from all fields in the layer, use `["*"]`. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#renderer) and [filtering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#filters). The required fields and `outFields` are used to populate [PointCloudLayerView.availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-PointCloudLayerView.html#availableFields).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.Array[String] = js.native
  /**
    * Indicates whether to display popups when points in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: Boolean = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PointCloudLayer.fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#fields) for the most common attributes information. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Setting a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) on this layer type is done in the same way as a FeatureLayer.  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each point in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#renderer)
    */
  var renderer: PointCloudRenderer = js.native
  @JSName("type")
  val type_PointCloudLayer: `point-cloud` = js.native
  /**
    * Creates a default popup template for the layer, populated with all the fields of the layer. The field CLASS_CODE is decoded with the category name. The field RGB describes rgb with decimal-codes. The field RETURNS is decoded with the number of returns out of total like (1/3), which shows number 1 out of 3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#createPopupTemplate)
    *
    * @param options Options for creating the popup template.
    * @param options.maximumFields The maximum number of fields to include in the popup template.
    * @param options.ignoreFieldTypes Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: PointCloudLayerCreatePopupTemplateOptions): PopupTemplate = js.native
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name. The domain can be either a [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#getFieldDomain)
    *
    * @param fieldName Name of the field.
    *
    */
  def getFieldDomain(fieldName: String): Domain = js.native
  /**
    * Queries cached statistics from the service for a given field. Check for the response details the [I3S PointCloud Specification](https://github.com/Esri/i3s-spec/blob/master/docs/2.0/statistics.pcsl.md)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#queryCachedStatistics)
    *
    * @param fieldName The name of the field to query statistics for.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryCachedStatistics(fieldName: String): js.Any = js.native
  def queryCachedStatistics(fieldName: String, options: PointCloudLayerQueryCachedStatisticsOptions): js.Any = js.native
}

