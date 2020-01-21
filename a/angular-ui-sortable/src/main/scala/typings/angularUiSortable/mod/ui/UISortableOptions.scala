package typings.angularUiSortable.mod.ui

import typings.angular.JQueryEventObject
import typings.angularUiSortable.angularUiSortableStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UISortableOptions[T] extends SortableOptions[T] {
  var `ui-floating`: js.UndefOr[auto | Boolean] = js.undefined
}

object UISortableOptions {
  @scala.inline
  def apply[T](
    activate: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    appendTo: js.Any = null,
    axis: String | Boolean = null,
    beforeStop: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    cancel: String = null,
    change: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    connectWith: String | Boolean = null,
    containment: js.Any = null,
    cursor: String = null,
    cursorAt: SortableCursorAtOptions | Boolean = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
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
    out: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    over: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    placeholder: String | Boolean = null,
    receive: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    remove: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    revert: Double | Boolean = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    sort: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    tolerance: String = null,
    `ui-floating`: auto | Boolean = null,
    update: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    zIndex: Int | Double = null
  ): UISortableOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(js.Any.fromFunction2(beforeStop))
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2(deactivate))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnEmpty)) __obj.updateDynamic("dropOnEmpty")(dropOnEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHelperSize)) __obj.updateDynamic("forceHelperSize")(forceHelperSize.asInstanceOf[js.Any])
    if (!js.isUndefined(forcePlaceholderSize)) __obj.updateDynamic("forcePlaceholderSize")(forcePlaceholderSize.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2(out))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2(over))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction2(receive))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (revert != null) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (`ui-floating` != null) __obj.updateDynamic("ui-floating")(`ui-floating`.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[UISortableOptions[T]]
  }
}

