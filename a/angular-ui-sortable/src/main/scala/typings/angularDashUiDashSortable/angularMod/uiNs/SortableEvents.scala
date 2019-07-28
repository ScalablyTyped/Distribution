package typings.angularDashUiDashSortable.angularMod.uiNs

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
    activate: SortableEvent[T] = null,
    beforeStop: SortableEvent[T] = null,
    change: SortableEvent[T] = null,
    deactivate: SortableEvent[T] = null,
    out: SortableEvent[T] = null,
    over: SortableEvent[T] = null,
    receive: SortableEvent[T] = null,
    remove: SortableEvent[T] = null,
    sort: SortableEvent[T] = null,
    start: SortableEvent[T] = null,
    stop: SortableEvent[T] = null,
    update: SortableEvent[T] = null
  ): SortableEvents[T] = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(beforeStop)
    if (change != null) __obj.updateDynamic("change")(change)
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (out != null) __obj.updateDynamic("out")(out)
    if (over != null) __obj.updateDynamic("over")(over)
    if (receive != null) __obj.updateDynamic("receive")(receive)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[SortableEvents[T]]
  }
}

