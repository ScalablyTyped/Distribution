package typings.angularUiSortable.mod.ui

import typings.angularUiSortable.angularUiSortableStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UISortableOptions[T] extends SortableOptions[T] {
  var `ui-floating`: js.UndefOr[auto | Boolean] = js.native
}

object UISortableOptions {
  @scala.inline
  def apply[T](): UISortableOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UISortableOptions[T]]
  }
  @scala.inline
  implicit class UISortableOptionsOps[Self <: UISortableOptions[_], T] (val x: Self with UISortableOptions[T]) extends AnyVal {
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
    def `setUi-floating`(value: auto | Boolean): Self = this.set("ui-floating", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-floating`: Self = this.set("ui-floating", js.undefined)
  }
  
}

