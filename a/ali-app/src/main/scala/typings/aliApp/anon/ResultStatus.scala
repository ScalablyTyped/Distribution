package typings.aliApp.anon

import typings.aliApp.aliAppStrings.`4000`
import typings.aliApp.aliAppStrings.`6001`
import typings.aliApp.aliAppStrings.`6002`
import typings.aliApp.aliAppStrings.`9000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStatus extends js.Object {
  var result: Admitstate = js.native
  /**
    * 6001    用户取消了业务流程
    * 6002    网络异常
    * 9000    成功
    * 4000    系统异常
    */
  var resultStatus: `6001` | `6002` | `9000` | `4000` | String = js.native
}

object ResultStatus {
  @scala.inline
  def apply(result: Admitstate, resultStatus: `6001` | `6002` | `9000` | `4000` | String): ResultStatus = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], resultStatus = resultStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultStatus]
  }
  @scala.inline
  implicit class ResultStatusOps[Self <: ResultStatus] (val x: Self) extends AnyVal {
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
    def setResult(value: Admitstate): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultStatus(value: `6001` | `6002` | `9000` | `4000` | String): Self = this.set("resultStatus", value.asInstanceOf[js.Any])
  }
  
}

