package typings.aqb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpsertRet extends js.Object {
  def insert(insertExpr: js.Any): UpsertRetInsertRet = js.native
}

object UpsertRet {
  @scala.inline
  def apply(insert: js.Any => UpsertRetInsertRet): UpsertRet = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[UpsertRet]
  }
  @scala.inline
  implicit class UpsertRetOps[Self <: UpsertRet] (val x: Self) extends AnyVal {
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
    def setInsert(value: js.Any => UpsertRetInsertRet): Self = this.set("insert", js.Any.fromFunction1(value))
  }
  
}

