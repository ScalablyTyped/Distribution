package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetACLResult extends js.Object {
  var acl: ACLType = js.native
  var res: NormalSuccessResponse = js.native
}

object GetACLResult {
  @scala.inline
  def apply(acl: ACLType, res: NormalSuccessResponse): GetACLResult = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetACLResult]
  }
  @scala.inline
  implicit class GetACLResultOps[Self <: GetACLResult] (val x: Self) extends AnyVal {
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
    def setAcl(value: ACLType): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}

