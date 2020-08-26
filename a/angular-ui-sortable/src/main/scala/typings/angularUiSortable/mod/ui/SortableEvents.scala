package typings.angularUiSortable.mod.ui

import typings.angular.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableEvents[T] extends js.Object {
  var activate: js.UndefOr[SortableEvent[T]] = js.native
  var beforeStop: js.UndefOr[SortableEvent[T]] = js.native
  var change: js.UndefOr[SortableEvent[T]] = js.native
  var deactivate: js.UndefOr[SortableEvent[T]] = js.native
  var out: js.UndefOr[SortableEvent[T]] = js.native
  var over: js.UndefOr[SortableEvent[T]] = js.native
  var receive: js.UndefOr[SortableEvent[T]] = js.native
  var remove: js.UndefOr[SortableEvent[T]] = js.native
  var sort: js.UndefOr[SortableEvent[T]] = js.native
  var start: js.UndefOr[SortableEvent[T]] = js.native
  var stop: js.UndefOr[SortableEvent[T]] = js.native
  var update: js.UndefOr[SortableEvent[T]] = js.native
}

object SortableEvents {
  @scala.inline
  def apply[T](): SortableEvents[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableEvents[T]]
  }
  @scala.inline
  implicit class SortableEventsOps[Self <: SortableEvents[_], T] (val x: Self with SortableEvents[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("activate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setBeforeStop(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("beforeStop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeStop: Self = this.set("beforeStop", js.undefined)
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setDeactivate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("deactivate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    @scala.inline
    def setOut(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("out", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setOver(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("over", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOver: Self = this.set("over", js.undefined)
    @scala.inline
    def setReceive(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("receive", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReceive: Self = this.set("receive", js.undefined)
    @scala.inline
    def setRemove(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setSort(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setUpdate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

