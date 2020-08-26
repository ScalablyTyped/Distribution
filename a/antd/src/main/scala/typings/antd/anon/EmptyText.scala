package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyText extends js.Object {
  var emptyText: String = js.native
  var filterConfirm: String = js.native
  var filterReset: String = js.native
  var filterTitle: String = js.native
  var selectAll: String = js.native
  var selectInvert: String = js.native
  var sortTitle: String = js.native
}

object EmptyText {
  @scala.inline
  def apply(
    emptyText: String,
    filterConfirm: String,
    filterReset: String,
    filterTitle: String,
    selectAll: String,
    selectInvert: String,
    sortTitle: String
  ): EmptyText = {
    val __obj = js.Dynamic.literal(emptyText = emptyText.asInstanceOf[js.Any], filterConfirm = filterConfirm.asInstanceOf[js.Any], filterReset = filterReset.asInstanceOf[js.Any], filterTitle = filterTitle.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], sortTitle = sortTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyText]
  }
  @scala.inline
  implicit class EmptyTextOps[Self <: EmptyText] (val x: Self) extends AnyVal {
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
    def setEmptyText(value: String): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterConfirm(value: String): Self = this.set("filterConfirm", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterReset(value: String): Self = this.set("filterReset", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterTitle(value: String): Self = this.set("filterTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectAll(value: String): Self = this.set("selectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectInvert(value: String): Self = this.set("selectInvert", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortTitle(value: String): Self = this.set("sortTitle", value.asInstanceOf[js.Any])
  }
  
}

