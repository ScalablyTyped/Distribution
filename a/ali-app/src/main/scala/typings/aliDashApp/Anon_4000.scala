package typings.aliDashApp

import typings.aliDashApp.aliDashAppStrings.`4000`
import typings.aliDashApp.aliDashAppStrings.`6001`
import typings.aliDashApp.aliDashAppStrings.`6002`
import typings.aliDashApp.aliDashAppStrings.`9000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_4000 extends js.Object {
  var result: Anon_Admitstate
  /**
  			 * 6001	用户取消了业务流程
  			 * 6002	网络异常
  			 * 9000	成功
  			 * 4000	系统异常
  			 */
  var resultStatus: `6001` | `6002` | `9000` | `4000` | String
}

object Anon_4000 {
  @scala.inline
  def apply(result: Anon_Admitstate, resultStatus: `6001` | `6002` | `9000` | `4000` | String): Anon_4000 = {
    val __obj = js.Dynamic.literal(result = result, resultStatus = resultStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_4000]
  }
}

