package typings.aliApp

import typings.aliApp.my.MultiLevelSelectItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  				// 是否选择完成,取消返回false
  var result: js.Array[MultiLevelSelectItem]
  var success: Boolean
}

object AnonResult {
  @scala.inline
  def apply(result: js.Array[MultiLevelSelectItem], success: Boolean): AnonResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResult]
  }
}

