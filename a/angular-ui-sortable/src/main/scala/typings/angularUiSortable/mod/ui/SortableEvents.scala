package typings.angularUiSortable.mod.ui

import typings.angular.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableEvents[T] extends js.Object {
  var activate: js.UndefOr[SortableEvent[T]] = js.undefined
  var beforeStop: js.UndefOr[SortableEvent[T]] = js.undefined
  var change: js.UndefOr[SortableEvent[T]] = js.undefined
  var deactivate: js.UndefOr[SortableEvent[T]] = js.undefined
  var out: js.UndefOr[SortableEvent[T]] = js.undefined
  var over: js.UndefOr[SortableEvent[T]] = js.undefined
  var receive: js.UndefOr[SortableEvent[T]] = js.undefined
  var remove: js.UndefOr[SortableEvent[T]] = js.undefined
  var sort: js.UndefOr[SortableEvent[T]] = js.undefined
  var start: js.UndefOr[SortableEvent[T]] = js.undefined
  var stop: js.UndefOr[SortableEvent[T]] = js.undefined
  var update: js.UndefOr[SortableEvent[T]] = js.undefined
}

object SortableEvents {
  @scala.inline
  def apply[T](
    activate: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    beforeStop: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    change: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    out: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    over: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    receive: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    remove: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    sort: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null,
    update: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit = null
  ): SortableEvents[T] = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(js.Any.fromFunction2(beforeStop))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2(deactivate))
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2(out))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2(over))
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction2(receive))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[SortableEvents[T]]
  }
}

