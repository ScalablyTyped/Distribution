package typings.angularDashUiDashSortable.angularMod.uiNs

import typings.angularDashUiDashSortable.angularDashUiDashSortableStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UISortableOptions[T] extends SortableOptions[T] {
  var `ui-floating`: js.UndefOr[auto | Boolean] = js.undefined
}

object UISortableOptions {
  @scala.inline
  def apply[T](
    activate: SortableEvent[T] = null,
    appendTo: js.Any = null,
    axis: String | Boolean = null,
    beforeStop: SortableEvent[T] = null,
    cancel: String = null,
    change: SortableEvent[T] = null,
    connectWith: String | Boolean = null,
    containment: js.Any = null,
    cursor: String = null,
    cursorAt: SortableCursorAtOptions | Boolean = null,
    deactivate: SortableEvent[T] = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    dropOnEmpty: js.UndefOr[Boolean] = js.undefined,
    forceHelperSize: js.UndefOr[Boolean] = js.undefined,
    forcePlaceholderSize: js.UndefOr[Boolean] = js.undefined,
    grid: js.Array[Double] | Boolean = null,
    handle: js.Any = null,
    helper: String | SortableHelperFunctionOption = null,
    items: String = null,
    opacity: Double | Boolean = null,
    out: SortableEvent[T] = null,
    over: SortableEvent[T] = null,
    placeholder: String | Boolean = null,
    receive: SortableEvent[T] = null,
    remove: SortableEvent[T] = null,
    revert: Double | Boolean = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    sort: SortableEvent[T] = null,
    start: SortableEvent[T] = null,
    stop: SortableEvent[T] = null,
    tolerance: String = null,
    `ui-floating`: auto | Boolean = null,
    update: SortableEvent[T] = null,
    zIndex: Int | Double = null
  ): UISortableOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(beforeStop)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (change != null) __obj.updateDynamic("change")(change)
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnEmpty)) __obj.updateDynamic("dropOnEmpty")(dropOnEmpty)
    if (!js.isUndefined(forceHelperSize)) __obj.updateDynamic("forceHelperSize")(forceHelperSize)
    if (!js.isUndefined(forcePlaceholderSize)) __obj.updateDynamic("forcePlaceholderSize")(forcePlaceholderSize)
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out)
    if (over != null) __obj.updateDynamic("over")(over)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (receive != null) __obj.updateDynamic("receive")(receive)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (revert != null) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance)
    if (`ui-floating` != null) __obj.updateDynamic("ui-floating")(`ui-floating`.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[UISortableOptions[T]]
  }
}

