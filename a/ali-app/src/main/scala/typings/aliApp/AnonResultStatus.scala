package typings.aliApp

import typings.aliApp.aliAppStrings.`4000`
import typings.aliApp.aliAppStrings.`6001`
import typings.aliApp.aliAppStrings.`6002`
import typings.aliApp.aliAppStrings.`9000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResultStatus extends js.Object {
  var result: AnonAdmitstate
  /**
  			 * 6001	用户取消了业务流程
  			 * 6002	网络异常
  			 * 9000	成功
  			 * 4000	系统异常
  			 */
  var resultStatus: `6001` | `6002` | `9000` | `4000` | String
}

object AnonResultStatus {
  @scala.inline
  def apply(result: AnonAdmitstate, resultStatus: `6001` | `6002` | `9000` | `4000` | String): AnonResultStatus = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], resultStatus = resultStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResultStatus]
  }
}

