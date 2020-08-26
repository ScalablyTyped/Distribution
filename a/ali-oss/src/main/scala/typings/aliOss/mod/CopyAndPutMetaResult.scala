package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyAndPutMetaResult extends js.Object {
  var data: ModifyData = js.native
  var res: NormalSuccessResponse = js.native
}

object CopyAndPutMetaResult {
  @scala.inline
  def apply(data: ModifyData, res: NormalSuccessResponse): CopyAndPutMetaResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyAndPutMetaResult]
  }
  @scala.inline
  implicit class CopyAndPutMetaResultOps[Self <: CopyAndPutMetaResult] (val x: Self) extends AnyVal {
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
    def setData(value: ModifyData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}

