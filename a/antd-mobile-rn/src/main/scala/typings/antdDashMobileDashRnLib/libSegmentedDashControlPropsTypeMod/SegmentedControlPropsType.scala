package typings
package antdDashMobileDashRnLib.libSegmentedDashControlPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlPropsType extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SegmentedControlPropsType {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* e */ js.Any => scala.Unit = null,
    onValueChange: /* value */ java.lang.String => scala.Unit = null,
    selectedIndex: scala.Int | scala.Double = null,
    tintColor: java.lang.String = null,
    values: js.Array[java.lang.String] = null
  ): SegmentedControlPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SegmentedControlPropsType]
  }
}

