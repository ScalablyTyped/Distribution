package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowEmpty extends js.Object {
  var allowEmpty: Boolean = js.native
  var referers: js.Array[String] = js.native
  var res: NormalSuccessResponse = js.native
}

object AllowEmpty {
  @scala.inline
  def apply(allowEmpty: Boolean, referers: js.Array[String], res: NormalSuccessResponse): AllowEmpty = {
    val __obj = js.Dynamic.literal(allowEmpty = allowEmpty.asInstanceOf[js.Any], referers = referers.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEmpty]
  }
  @scala.inline
  implicit class AllowEmptyOps[Self <: AllowEmpty] (val x: Self) extends AnyVal {
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
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferersVarargs(value: String*): Self = this.set("referers", js.Array(value :_*))
    @scala.inline
    def setReferers(value: js.Array[String]): Self = this.set("referers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}

