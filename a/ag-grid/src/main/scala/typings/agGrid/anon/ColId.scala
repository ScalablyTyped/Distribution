package typings.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColId extends js.Object {
  var colId: String = js.native
  var sort: String = js.native
}

object ColId {
  @scala.inline
  def apply(colId: String, sort: String): ColId = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColId]
  }
  @scala.inline
  implicit class ColIdOps[Self <: ColId] (val x: Self) extends AnyVal {
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
    def setColId(value: String): Self = this.set("colId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
  }
  
}

