package typings
package atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemType extends js.Object {
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var elemBefore: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var filterValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var tooltipDescription: js.UndefOr[java.lang.String] = js.undefined
  var tooltipPosition: js.UndefOr[
    atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.top | atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.bottom | atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.left
  ] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ItemType {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNs.ReactNode = null,
    description: java.lang.String = null,
    elemBefore: reactLib.reactMod.ReactNs.ReactNode = null,
    filterValues: js.Array[java.lang.String] = null,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    tooltipDescription: java.lang.String = null,
    tooltipPosition: atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.top | atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.bottom | atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.left = null,
    value: java.lang.String | scala.Double = null
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

