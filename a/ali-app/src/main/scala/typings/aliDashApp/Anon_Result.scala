package typings.aliDashApp

import typings.aliDashApp.myNs.MultiLevelSelectItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  				// 是否选择完成,取消返回false
  var result: js.Array[MultiLevelSelectItem]
  var success: Boolean
}

object Anon_Result {
  @scala.inline
  def apply(result: js.Array[MultiLevelSelectItem], success: Boolean): Anon_Result = {
    val __obj = js.Dynamic.literal(result = result, success = success)
  
    __obj.asInstanceOf[Anon_Result]
  }
}

