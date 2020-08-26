package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterType extends js.Object {
  var Cancel: Double = js.native
  var FilterType: Double = js.native
}

object FilterType {
  @scala.inline
  def apply(Cancel: Double, FilterType: Double): FilterType = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterType]
  }
  @scala.inline
  implicit class FilterTypeOps[Self <: FilterType] (val x: Self) extends AnyVal {
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
    def setCancel(value: Double): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterType(value: Double): Self = this.set("FilterType", value.asInstanceOf[js.Any])
  }
  
}

