package typings.arcgisDashJsDashApi.__esri

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
    * Used in a `one:many` or `many:many` relationship to compute the statistics on the field to show in the popup. If the property is present, must be one of the following values:  **Possible Values:** count | sum | min | max | avg | stddev | var
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#statisticType)
    */
  var statisticType: js.UndefOr[String] = js.undefined
  /**
    * A string determining what type of input box editors see when editing the field. Applies only to string fields. This is not applicable to Arcade expressions. If this property is present, it must be one of the following values:  **Possible Values:** rich-text | text-area | text-box
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#stringFieldOption)
    *
    * @default text-box
    */
  var stringFieldOption: js.UndefOr[String] = js.undefined
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
    statisticType: String = null,
    stringFieldOption: String = null,
    tooltip: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): FieldInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(isEditable)) __obj.updateDynamic("isEditable")(isEditable)
    if (label != null) __obj.updateDynamic("label")(label)
    if (statisticType != null) __obj.updateDynamic("statisticType")(statisticType)
    if (stringFieldOption != null) __obj.updateDynamic("stringFieldOption")(stringFieldOption)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[FieldInfoProperties]
  }
}

