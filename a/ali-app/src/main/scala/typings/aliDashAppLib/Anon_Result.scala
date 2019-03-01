package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  				// 是否选择完成,取消返回false
  var result: js.Array[aliDashAppLib.myNs.MultiLevelSelectItem]
  var success: scala.Boolean
}

object Anon_Result {
  @scala.inline
  def apply(result: js.Array[aliDashAppLib.myNs.MultiLevelSelectItem], success: scala.Boolean): Anon_Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_Result]
  }
}

