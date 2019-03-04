package typings
package aliDashAppLib

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
  var resultStatus: aliDashAppLib.aliDashAppLibStrings.`6001` | aliDashAppLib.aliDashAppLibStrings.`6002` | aliDashAppLib.aliDashAppLibStrings.`9000` | aliDashAppLib.aliDashAppLibStrings.`4000` | java.lang.String
}

object Anon_4000 {
  @scala.inline
  def apply(
    result: Anon_Admitstate,
    resultStatus: aliDashAppLib.aliDashAppLibStrings.`6001` | aliDashAppLib.aliDashAppLibStrings.`6002` | aliDashAppLib.aliDashAppLibStrings.`9000` | aliDashAppLib.aliDashAppLibStrings.`4000` | java.lang.String
  ): Anon_4000 = {
    val __obj = js.Dynamic.literal(result = result, resultStatus = resultStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_4000]
  }
}

