package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadObjectResult extends js.Object {
   // response status, maybe 200 or 304
  var meta: UserMeta = js.native
  var res: NormalSuccessResponse = js.native
  var status: Double = js.native
}

object HeadObjectResult {
  @scala.inline
  def apply(meta: UserMeta, res: NormalSuccessResponse, status: Double): HeadObjectResult = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadObjectResult]
  }
  @scala.inline
  implicit class HeadObjectResultOps[Self <: HeadObjectResult] (val x: Self) extends AnyVal {
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
    def setMeta(value: UserMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

