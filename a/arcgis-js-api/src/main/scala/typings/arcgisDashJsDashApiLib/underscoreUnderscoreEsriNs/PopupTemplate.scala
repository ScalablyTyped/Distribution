package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupTemplate
  extends Accessor
     with JSONSupport {
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects. Each object represents an action or function that may be executed by clicking the icon or image symbolizing them in the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html). By default, every [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) has a `zoom-to` action styled with a magnifying glass icon ![popupTemplate-zoom-action](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-zoom-action.png). When this icon is clicked, the view zooms in four LODs and centers on the selected feature.  PopupTemplates do not have default actions. To override actions on the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) using PopupTemplate see [overwriteActions](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#overwriteActions). Actions defined in a PopupTemplate will only appear in the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) for features or layers that apply that particular PopupTemplate.  The order of each action in the popup is the same order in which they appear in the actions [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).  The [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event:trigger-action) event in [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) fires each time an action in the popup is clicked. This event should be used to execute custom code for each action clicked. For example, if you would like to add a `zoom-out` action to the PopupTemplate that zooms the view out several LODs, you would define the zoom-out code in a separate function. Then you would call the custom `zoom-out` function in the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event:trigger-action) event handler. See the sample code snippet below for more details on how this works.  Actions are defined with the properties listed in the [ActionButton](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [ActionToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#actions)
    */
  var actions: Collection[ActionButton | ActionToggle] = js.native
  /**
    * The template for defining and formatting a popup's content. Content may be defined with one of four types of values.
    *   * **String** - A popup's content can be a simple text or string value referencing field values or [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions. Expressions must be defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#expressionInfos) property.
    *   * **Popup elements** - You can also display content as popup elements. These elements can be used individually or combined. The order in which they are set determines how they display within the popup. See the items below describing each element.
    *   * **text** - A [TextContentElement](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Text.html) that provides descriptive text as content.
    *   * **media** - A [MediaContentElement](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media.html) that is used to display media such as [charts](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart.html) and/or [images](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Image.html).
    *   * **fields** - A [FieldsContentElement](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Fields.html). that contains the fields to display within the content. If this is not set directly within the `content` property, the popup will display whatever is set in the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property.
    *   * **attachments** -  A [AttachmentsContentElement](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Attachments.html) that contains attachments associated with the feature.
    *   * **promise** - The PopupTemplate's content may also be defined with a promise that resolves to any of the above-mentioned elements. This is useful for cases when you run a task or execute a query and want to display the results in the popup. Simply pass the promise to the popupTemplate's content and ensure that it resolves to a string or other popup element.
    *   * **function** - Content may be defined with a JavaScript function that returns any of the above-mentioned elements. This is handy when your popup requires additional processing or functionality than what is provided with the four content types listed above. For example, let’s assume that you would like to display charts using third-party JavaScript libraries or categorize information into separate tabs. In these cases, you can use a function that returns either a string, a reference to an HTML element, a popup element, or a promise. When the feature is clicked, the feature is passed as an argument to the function and provides access to the feature’s graphic and attributes. The function then executes and returns a value to display in the popup template. It is also possible to check a specific feature attribute and determine whether to apply a function based on its value. Out-of-the-box formatting functions can be used to format date, time, and number values. The syntax for using an out-of-the-box formatting function is: `{field-name:format-function-name(option-a: value, option-b: value)}`
    *
    *
    * The formatter functions are described below:
    *
    * Type | Description
    * ----- | -----------
    * DateString | Formats the date into a human-readable format. Supports the following options:    `hideTime: false` - When `true` shows time. Default value is `false`.    `local: false` - Displays date and time in the local time zone. Default value is `false`. When `false` the date will display in UTC.    `systemLocale: false` - Displays date and time in the system locale (local time zone). Default value is `false`.
    * DateFormat | Converts date fields into a human-readable format using [dojo/date/locale.format](https://dojotoolkit.org/reference-guide/1.10/dojo/date/locale/format.html) method. Supports the same options as [dojo/date/locale.format](https://dojotoolkit.org/reference-guide/1.10/dojo/date/locale/format.html). The following snippets show some usage examples:    `{DATE_FIELD:DateFormat}` produces `3/8/08 4:00 PM`.    `{DATE_FIELD:DateFormat(selector: 'date', fullYear: true)}` produces `4/8/2009`.
    * NumberFormat | Formats numbers into various formats using the [dojo/number.format](https://dojotoolkit.org/reference-guide/1.10/dojo/number.html#format) method. Supports the same set of options as [dojo/number.format](https://dojotoolkit.org/reference-guide/1.10/dojo/number.html#format). The following snippets show examples of usage pattern examples:    `{Magnitude:NumberFormat}` produces `4.23456`.    `{Magnitude:NumberFormat(places:2)}` produces `4.23`.
    *
    * Out-of-the-box formatting functions and custom functions are supported as of version 4.1.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content)
    */
  var content: ContentElementContentElement | js.Array[ContentElementContentElement] | java.lang.String | js.Function | arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#expressionInfos)
    */
  var expressionInfos: js.Array[ExpressionInfo] = js.native
  /**
    * An array of [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html) that defines how fields in the dataset or values from [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions participate in a popup. Each object [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html) contains properties for a single field or expression.
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
  var lastEditInfoEnabled: scala.Boolean = js.native
  /**
    * Additional options that can be defined for the popup layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#layerOptions)
    */
  var layerOptions: LayerOptions = js.native
  /**
    * An array of fields used in the PopupTemplate. Use this property to indicate what fields are required to fully render the PopupTemplate.  To fetch the values from all fields, use `["*"]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#outFields)
    *
    * @default null
    */
  var outFields: js.Array[java.lang.String] = js.native
  /**
    * Indicates whether actions should replace existing [popup actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#overwriteActions)
    *
    * @default false
    */
  var overwriteActions: scala.Boolean = js.native
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
  var title: java.lang.String | js.Function = js.native
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

