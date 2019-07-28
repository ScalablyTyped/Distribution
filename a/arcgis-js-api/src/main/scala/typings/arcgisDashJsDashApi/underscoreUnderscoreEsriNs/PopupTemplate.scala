package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupTemplate
  extends Accessor
     with JSONSupport {
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects. Each object represents an action or function that may be executed by clicking the icon or image symbolizing them in the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html). By default, every [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) has a `zoom-to` action styled with a magnifying glass icon ![popupTemplate-zoom-action](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-zoom-action.png). When this icon is clicked, the view zooms in four LODs and centers on the selected feature.  PopupTemplates do not have default actions. To override actions on the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) using PopupTemplate see [overwriteActions](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#overwriteActions). Actions defined in a PopupTemplate will only appear in the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) for features or layers that apply that particular PopupTemplate.  The order of each action in the popup is the same order in which they appear in the actions [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).  The [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event-trigger-action) event in [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) fires each time an action in the popup is clicked. This event should be used to execute custom code for each action clicked. For example, if you would like to add a `zoom-out` action to the PopupTemplate that zooms the view out several LODs, you would define the zoom-out code in a separate function. Then you would call the custom `zoom-out` function in the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event-trigger-action) event handler. See the sample code snippet below for more details on how this works.  Actions are defined with the properties listed in the [ActionButton](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [ActionToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#actions)
    */
  var actions: Collection[ActionButton | ActionToggle] = js.native
  /**
    * The template for defining and formatting a popup's content. Content may be defined with one of four types of values.
    *   * **String** - A popup's content can be a simple text or string value referencing field values or [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions. Expressions must be defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#expressionInfos) property.
    *   * **Popup elements** - You can also display content as popup elements. These elements can be used individually or combined. The order in which they are set determines how they display within the popup. See the items below describing each element.
    *   * **text** - A [text content element](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html) that provides descriptive text as content.
    *   * **media** - A [media content element](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html) that is used to display media such as charts/images.
    *   * **fields** - A [fields content element](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html). that contains the fields to display within the content. If this is not set directly within the `content` property, the popup will display whatever is set in the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property.
    *   * **attachments** -  A [attachments content element](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html) that contains attachments associated with the feature.
    *   * **promise** - The PopupTemplate's content may also be defined with a promise that resolves to any of the above-mentioned elements. This is useful for cases when you run a task or execute a query and want to display the results in the popup. Simply pass the promise to the popupTemplate's content and ensure that it resolves to a string or other popup element.
    *   * **function** - Content may be defined with a JavaScript function that returns any of the above-mentioned elements. This is useful when your popup requires additional processing or functionality than what is provided with the four content types listed above. For example, assume that you would like to display charts using third-party JavaScript libraries or categorize information into separate tabs. In these cases, you can use a function that returns either a string, a reference to an HTML element, a popup element, or a promise. When the feature is clicked, the feature is passed as an argument to the function and provides access to the feature’s graphic and attributes. Set the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#outFields) property to specify any fields needed for rendering the popup. The function then executes and returns a value to display in the popup template.
    *
    *
    * > As of version 4.12, content can no longer be set using a wildcard, e.g. `*`. Instead, set the `Popup's` [defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) property to `true`. In addition, out-of-the-box formatting functions such as `DateString`, `DateFormat`, and `NumberFormat` are no longer supported. Instead, set the [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) and specify formatting using the [FieldInfoFormat](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html) class to format any number or date fields within the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html). See the [GeoJSONLayer sample](https://developers.arcgis.com/javascript/latest/sample-code/layers-geojson/index.html) for an example of how to do this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content)
    */
  var content: Content | js.Array[Content] | String | js.Function | IPromise[_] = js.native
  /**
    * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#expressionInfos)
    */
  var expressionInfos: js.Array[ExpressionInfo] = js.native
  /**
    * An array of [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) that defines how fields in the dataset or values from [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions participate in a popup. If no [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) are specified, nothing will display since the popup will only display the fields that are defined by this array. Each [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) contains properties for a single field or expression. This property can be set directly within the PopupTemplate or within the [fields content element](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html). If this is not set within the [fields content element](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html), it will default to whatever is specified directly within the `PopupTemplate.fieldInfos`. The image on the left is a result of using the first example snippet below, whereas the image on the right is a result of the second snippet.
    *
    * | **Content set using 'fields' type** | **Content referenced from fields set within fieldInfo**  |
    * | -------------------------- | --------------------------- |
    * | ![popuptemplate-fields](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-fields.png) | ![popuptemplate-fieldinfocontent](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-fieldinfocontent.png) |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos)
    */
  var fieldInfos: js.Array[FieldInfo] = js.native
  /**
    * Indicates whether or not editor tracking should display.  ![popupTemplate-showLastEditInfo](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/410/showlasteditinfo.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#lastEditInfoEnabled)
    *
    * @default true
    */
  var lastEditInfoEnabled: Boolean = js.native
  /**
    * Additional options that can be defined for the popup layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#layerOptions)
    */
  var layerOptions: LayerOptions = js.native
  /**
    * An array of field names used in the PopupTemplate. Use this property to indicate what fields are required to fully render the PopupTemplate. This is important if setting [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) via a function since any fields needed for successful rendering should be specified here.  To fetch the values from all fields, use `["*"]`.
    * > This will not fetch fields from related tables. If related features are needed, set this using [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#outFields)
    *
    * @default null
    */
  var outFields: js.Array[String] = js.native
  /**
    * Indicates whether actions should replace existing [popup actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#overwriteActions)
    *
    * @default false
    */
  var overwriteActions: Boolean = js.native
  /**
    * The `RelatedRecordsInfo` class provides additional sorting options when working with related records in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#relatedRecordsInfo)
    */
  var relatedRecordsInfo: RelatedRecordsInfo = js.native
  /**
    * The template for defining how to format the title used in a popup. You can format the title by specifying either a string value or a function that returns a simple string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#title)
    */
  var title: String | js.Function = js.native
}

@JSGlobal("__esri.PopupTemplate")
@js.native
/**
  * A PopupTemplate formats and defines the content of a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). A PopupTemplate allows the user to access values from feature attributes and values returned from [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions when a feature in the view is selected.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html)
  */
class PopupTemplateCls () extends PopupTemplate {
  def this(properties: PopupTemplateProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

