package typings.agGrid.iColumnVOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnVO extends js.Object {
  var aggFunc: String = js.native
  var displayName: String = js.native
  var field: String = js.native
  var id: String = js.native
}

object ColumnVO {
  @scala.inline
  def apply(aggFunc: String, displayName: String, field: String, id: String): ColumnVO = {
    val __obj = js.Dynamic.literal(aggFunc = aggFunc.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnVO]
  }
  @scala.inline
  implicit class ColumnVOOps[Self <: ColumnVO] (val x: Self) extends AnyVal {
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
    def setAggFunc(value: String): Self = this.set("aggFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

