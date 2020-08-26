package typings.aliApp.anon

import typings.aliApp.my.MultiLevelSelectItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
                  // 是否选择完成,取消返回false
  var result: js.Array[MultiLevelSelectItem] = js.native
  var success: Boolean = js.native
}

object Result {
  @scala.inline
  def apply(result: js.Array[MultiLevelSelectItem], success: Boolean): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setResultVarargs(value: MultiLevelSelectItem*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[MultiLevelSelectItem]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

