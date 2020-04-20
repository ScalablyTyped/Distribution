package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldColumnConfigProperties extends FieldConfigProperties {
  /**
    * Controls the sort order of the column. This property will only be honored on one fieldColumn in the FeatureTable widget. If direction is specified on more than one FieldColumn in the same FeatureTable, it will only be honored on the column with the highest index.
    *
    * Possible Value | Description
    * ---------------|------------
    * asc | Sorts the column in ascending order.
    * desc | Sorts the column in descending order.
    * null | No sort is applied to the column.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#direction)
    *
    * @default null
    */
  var direction: js.UndefOr[asc_ | desc_ | js.Any] = js.undefined
  /**
    * Indicates whether the field column is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object FieldColumnConfigProperties {
  @scala.inline
  def apply(
    description: String = null,
    direction: asc_ | desc_ | js.Any = null,
    domain: CodedValueDomainProperties | RangeDomainProperties = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    editorType: String = null,
    hint: String = null,
    label: String = null,
    maxLength: Int | Double = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    visibilityExpression: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): FieldColumnConfigProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (editorType != null) __obj.updateDynamic("editorType")(editorType.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (visibilityExpression != null) __obj.updateDynamic("visibilityExpression")(visibilityExpression.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldColumnConfigProperties]
  }
}

