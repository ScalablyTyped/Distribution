package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMultiResult extends js.Object {
  var deleted: js.UndefOr[js.Array[String]] = js.native
   // deleted object names list
  var res: NormalSuccessResponse = js.native
}

object DeleteMultiResult {
  @scala.inline
  def apply(res: NormalSuccessResponse): DeleteMultiResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiResult]
  }
  @scala.inline
  implicit class DeleteMultiResultOps[Self <: DeleteMultiResult] (val x: Self) extends AnyVal {
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
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedVarargs(value: String*): Self = this.set("deleted", js.Array(value :_*))
    @scala.inline
    def setDeleted(value: js.Array[String]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
  }
  
}

