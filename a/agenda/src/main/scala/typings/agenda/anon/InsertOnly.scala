package typings.agenda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertOnly extends js.Object {
  var insertOnly: js.UndefOr[Boolean] = js.native
}

object InsertOnly {
  @scala.inline
  def apply(): InsertOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOnly]
  }
  @scala.inline
  implicit class InsertOnlyOps[Self <: InsertOnly] (val x: Self) extends AnyVal {
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
    def setInsertOnly(value: Boolean): Self = this.set("insertOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertOnly: Self = this.set("insertOnly", js.undefined)
  }
  
}

