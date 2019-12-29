package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`rich-text`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`text-area`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`text-box`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`var`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.avg
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.count
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.max
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.stddev
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfoProperties extends js.Object {
  /**
    * The field name as defined by  the service or the `name` of an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression. Arcade expression names are defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#expressionInfos) property. When referencing Arcade expressions, you must preface the name with `expression/`, such as `expression/percent-total`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#fieldName)
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /**
    * Class which provides formatting options for numerical or date fields and how they should display within a popup.
    * > Set the [popupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property for any fields that need to have number formatting for chart/text elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#format)
    */
  var format: js.UndefOr[FieldInfoFormatProperties] = js.undefined
  /**
    * A Boolean determining whether users can edit this field. This is not applicable to Arcade expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#isEditable)
    *
    * @default false
    */
  var isEditable: js.UndefOr[Boolean] = js.undefined
  /**
    * A string containing the field alias. Not applicable to Arcade expressions as the title is used instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Used in a `one:many` or `many:many` relationship to compute the statistics on the field to show in the popup. If the property is present, must be one of the following values:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#statisticType)
    */
  var statisticType: js.UndefOr[count | sum | min | max | avg | stddev | `var`] = js.undefined
  /**
    * A string determining what type of input box editors see when editing the field. Applies only to string fields. This is not applicable to Arcade expressions. If this property is present, it must be one of the following values:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#stringFieldOption)
    *
    * @default text-box
    */
  var stringFieldOption: js.UndefOr[`rich-text` | `text-area` | `text-box`] = js.undefined
  /**
    * A string providing an editing hint for editors of the field. This is not applicable to Arcade expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#tooltip)
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the field is visible in the popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object FieldInfoProperties {
  @scala.inline
  def apply(
    fieldName: String = null,
    format: FieldInfoFormatProperties = null,
    isEditable: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    statisticType: count | sum | min | max | avg | stddev | `var` = null,
    stringFieldOption: `rich-text` | `text-area` | `text-box` = null,
    tooltip: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): FieldInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditable)) __obj.updateDynamic("isEditable")(isEditable.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (statisticType != null) __obj.updateDynamic("statisticType")(statisticType.asInstanceOf[js.Any])
    if (stringFieldOption != null) __obj.updateDynamic("stringFieldOption")(stringFieldOption.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfoProperties]
  }
}

