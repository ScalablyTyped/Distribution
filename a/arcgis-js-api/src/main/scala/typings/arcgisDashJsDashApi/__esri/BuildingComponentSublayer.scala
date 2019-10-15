package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`building-component`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hide
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingComponentSublayer
  extends BuildingSublayer
     with Loadable {
  /**
    * The SQL where clause used to filter features on the client. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when only a subset of the data in the layer should be displayed.  Setting the definition expression of a layer automatically updates all layer views.  If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.  Important to note is that the initial loading time of the features remains unchanged, even if they are filtered. This happens because, as opposed to Feature Layers, feature filtering is done client-side. As a result all features need to be downloaded always for filter evaluation.  This property is evaluated on the client using the cached attributes and it only supports [standardized SQL](http://doc.arcgis.com/en/arcgis-online/reference/sql-agol.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget. The possible values are listed below.
    *
    * Value | Description
    * ------|------------
    *  show | The layer is visible in the table of contents.
    *  hide | The layer is hidden in the table of contents.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#listMode)
    *
    * @default show
    */
  var listMode: show | hide = js.native
  /**
    * An array of field names from the service to include with each feature. To fetch the values from all fields in the layer, use `["*"]`. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.Array[String] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: Boolean = js.native
  /**
    * The popup template for the sublayer. When set, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Setting a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) on this layer type is done in the same way as a FeatureLayer.  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The renderer assigned to the sublayer. The renderer defines how to visualize each feature in the sublayer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer)
    */
  var renderer: Renderer = js.native
  val `type`: `building-component` = js.native
  /**
    * Creates a default popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#createPopupTemplate)
    *
    * @param options Options for creating the popup template.
    * @param options.maximumFields The maximum number of fields to include in the popup template.
    * @param options.ignoreFieldTypes Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: BuildingComponentSublayerCreatePopupTemplateOptions): PopupTemplate = js.native
  /**
    * Returns the [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) instance for a field name (case-insensitive).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getField)
    *
    * @param fieldName Name of the field.
    *
    */
  def getField(fieldName: String): Field = js.native
  /**
    * Returns the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) associated with the given field name. The domain can be either a [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getFieldDomain)
    *
    * @param fieldName Name of the field.
    *
    */
  def getFieldDomain(fieldName: String): Domain = js.native
}

@JSGlobal("__esri.BuildingComponentSublayer")
@js.native
object BuildingComponentSublayer extends TopLevel[BuildingComponentSublayerConstructor]

