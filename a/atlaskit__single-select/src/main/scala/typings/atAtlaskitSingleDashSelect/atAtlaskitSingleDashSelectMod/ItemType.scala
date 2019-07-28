package typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectMod

import typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectStrings.bottom
import typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectStrings.left
import typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectStrings.top
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemType extends js.Object {
  var content: js.UndefOr[ReactNode] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var elemBefore: js.UndefOr[ReactNode] = js.undefined
  var filterValues: js.UndefOr[js.Array[String]] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var tooltipDescription: js.UndefOr[String] = js.undefined
  var tooltipPosition: js.UndefOr[top | bottom | left] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object ItemType {
  @scala.inline
  def apply(
    content: ReactNode = null,
    description: String = null,
    elemBefore: ReactNode = null,
    filterValues: js.Array[String] = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    tooltipDescription: String = null,
    tooltipPosition: top | bottom | left = null,
    value: String | Double = null
  ): ItemType = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (elemBefore != null) __obj.updateDynamic("elemBefore")(elemBefore.asInstanceOf[js.Any])
    if (filterValues != null) __obj.updateDynamic("filterValues")(filterValues)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (label != null) __obj.updateDynamic("label")(label)
    if (tooltipDescription != null) __obj.updateDynamic("tooltipDescription")(tooltipDescription)
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemType]
  }
}

