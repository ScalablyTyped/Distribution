package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingComponentSublayerProperties
  extends BuildingSublayerProperties
     with LoadableProperties {
  /**
    * The SQL where clause used to filter features on the client. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when only a subset of the data in the layer should be displayed.  Setting the definition expression of a layer automatically updates all layer views.  If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.  Important to note is that the initial loading time of the features remains unchanged, even if they are filtered. This happens because, as opposed to Feature Layers, feature filtering is done client-side. As a result all features need to be downloaded always for filter evaluation.  This property is evaluated on the client using the cached attributes and it only supports [standardized SQL](http://doc.arcgis.com/en/arcgis-online/reference/sql-agol.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.native
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
  var listMode: js.UndefOr[show | hide] = js.native
  /**
    * An array of field names from the service to include with each feature. To fetch the values from all fields in the layer, use `["*"]`. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer).  To include fields in all sublayers, use the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#outFields) property of the parent layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked. The layer needs to have a [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#popupTemplate) to define what information should be displayed in the popup. Alternatively, a default popup template may be automatically used if [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The popup template for the sublayer. When set, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Setting a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) on this layer type is done in the same way as a FeatureLayer.  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * The renderer assigned to the sublayer. The renderer defines how to visualize each feature in the sublayer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.native
}

object BuildingComponentSublayerProperties {
  @scala.inline
  def apply(): BuildingComponentSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingComponentSublayerProperties]
  }
  @scala.inline
  implicit class BuildingComponentSublayerPropertiesOps[Self <: BuildingComponentSublayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefinitionExpression(value: String): Self = this.set("definitionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionExpression: Self = this.set("definitionExpression", js.undefined)
    @scala.inline
    def setListMode(value: show | hide): Self = this.set("listMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListMode: Self = this.set("listMode", js.undefined)
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = this.set("outFields", js.Array(value :_*))
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = this.set("outFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFields: Self = this.set("outFields", js.undefined)
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = this.set("popupEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupEnabled: Self = this.set("popupEnabled", js.undefined)
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = this.set("popupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTemplate: Self = this.set("popupTemplate", js.undefined)
    @scala.inline
    def setRenderer(value: RendererProperties): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
  }
  
}

